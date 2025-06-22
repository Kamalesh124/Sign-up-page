Here’s a **professional and clear `README.md`** you can use for your `vat_portal_backend_nic` backend project:

---

```markdown
# 🚀 VAT Portal Backend (NIC)

This is the backend system for the **VAT Management Portal** built using **Spring Boot** and **PostgreSQL**, secured with **JWT Authentication**. This service is intended to support user registration, login, and role-based authorization.

---

## 📌 Features

- ✅ User Registration (`/register`)
- 🔐 JWT-based Login (`/login`)
- 👤 Role-based access (ADMIN / APPROVER / USER)
- 📦 PostgreSQL database integration
- 🌐 RESTful API built with Spring Boot
- 🐘 Hosted PostgreSQL on Render
- 📄 Swagger-ready (optional enhancement)

---

## ⚙️ Tech Stack

| Layer           | Technology               |
|----------------|---------------------------|
| Backend         | Spring Boot (Java 17)     |
| Authentication  | Spring Security + JWT     |
| Database        | PostgreSQL                |
| Build Tool      | Maven                     |
| Deployment      | Docker + Render           |

---

## 📂 Project Structure

```

vat\_portal\_backend\_nic/
├── src/
├── Dockerfile
├── mvnw / mvnw\.cmd
├── pom.xml
└── application.properties

````

---

## 🔐 API Endpoints

### 📝 Register

```http
POST /register
````

#### Sample JSON Body:

```json
{
  "username": "Kamalesh Chakraborty",
  "password": "Kammo124",
  "role": "APPROVER",
  "designation": "Manager"
}
```

---

### 🔓 Login

```http
POST /login
```

#### Sample JSON Body:

```json
{
  "username": "Kamalesh Chakraborty",
  "password": "Kammo124"
}
```

* ✔️ Returns a **JWT Token** on success.
* The token should be used in the `Authorization` header as:

  ```
  Authorization: Bearer <JWT_TOKEN>
  ```

---

## 🌐 Deployment

> ✅ Deployed on [Render](https://render.com/)

**Production URL:**
[https://sign-up-page-h05w.onrender.com](https://sign-up-page-h05w.onrender.com)

---

## 🔧 Setup (Local)

1. **Clone the repository**

   ```bash
   git clone https://github.com/GaneshRehan/vat_portal_backend_nic.git
   ```

2. **Update `application.properties`** with your DB credentials.

3. **Build the project**

   ```bash
   ./mvnw clean install
   ```

4. **Run the app**

   ```bash
   java -jar target/*.jar
   ```

---

## 🐳 Docker Deployment

1. **Build Docker image**

   ```bash
   docker build -t vat-portal-backend .
   ```

2. **Run the container**

   ```bash
   docker run -p 8083:8083 vat-portal-backend
   ```

---

