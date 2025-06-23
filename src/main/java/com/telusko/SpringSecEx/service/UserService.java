package com.telusko.SpringSecEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.telusko.SpringSecEx.model.Users;
import com.telusko.SpringSecEx.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtService jwtService;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);

        //however for postman if we use normal password it will show not authorized, as in security configure there was noPasswordEncoder. So we need to change that
    } 

  
public String verify(Users user) {
    // Step 1: Authenticate username and password
    Authentication authentication = authManager.authenticate(
        new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
    );

    // Step 2: If credentials are valid
    if (authentication.isAuthenticated()) {
        // Fetch the actual user from DB
        Users dbUser = repo.findByUsername(user.getUsername());

        // Step 3: Compare roles
        if (dbUser != null && dbUser.getRole().equals(user.getRole())) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "Role mismatch or user not found";
        }
    } else {
        return "Authentication failed";
    }
}

    
}
