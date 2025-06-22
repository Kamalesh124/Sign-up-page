package com.telusko.SpringSecEx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Users")
public class Users {

    @Id
    private int id;

    private String username;

    private String password;

    private String role;

    
    private String designation;
}
