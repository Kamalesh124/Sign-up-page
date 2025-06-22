

```markdown
# 🚀 VAT Portal Backend (NIC)

This is the backend for the **VAT Management Portal**, built with **Spring Boot**, **PostgreSQL**, and secured using **JWT Authentication**. It supports user registration, login, and role-based authorization.

---

## 📌 Features

- ✅ User Registration (`/register`)
- 🔐 JWT-based Login (`/login`)
- 👤 Role-based Access: `ADMIN`, `APPROVER`, `USER`
- 🐘 PostgreSQL Database Integration (Hosted on Render)
- 🧰 RESTful APIs with Spring Boot
- 🐳 Dockerized Deployment
- 📄 (Optional) Swagger Documentation

---

## ⚙️ Tech Stack

| Layer         | Technology               |
|---------------|---------------------------|
| Backend       | Spring Boot (Java 17)     |
| Auth & Sec    | Spring Security + JWT     |
| Database      | PostgreSQL (Render Cloud) |
| Build Tool    | Maven                     |
| Deployment    | Docker + Render           |

---


## 🔐 API Endpoints

### 1️⃣ Register

**URL:** `POST /register`

#### ✅ Sample Request:
```json
{
  "username": "Kamalesh Chakraborty",
  "password": "Kammo124",
  "role": "APPROVER",
  "designation": "Manager"
}
````

---

### 2️⃣ Login

**URL:** `POST /login`

#### ✅ Sample Request:

```json
{
  "username": "Kamalesh Chakraborty",
  "password": "Kammo124"
}
```

#### 🔐 Response:

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

✅ Use this JWT token in the `Authorization` header for protected APIs:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 🌍 Deployment

✅ Live API: [https://sign-up-page-h05w.onrender.com](https://sign-up-page-h05w.onrender.com)

---

## 🧪 Local Setup

### 1. Clone the repo

```bash
git clone https://github.com/GaneshRehan/vat_portal_backend_nic.git
cd vat_portal_backend_nic
```

### 2. Update DB credentials in `src/main/resources/application.properties`

### 3. Build and run

```bash
./mvnw clean install
java -jar target/*.jar
```

---

## 🐳 Docker Deployment

### 1. Build the image

```bash
docker build -t vat-portal-backend .
```

### 2. Run the container

```bash
docker run -p 8083:8083 vat-portal-backend
```

---

## 🔐 Environment Variables (Render)

| Key                          | Value                                  |
| ---------------------------- | -------------------------------------- |
| `SPRING_DATASOURCE_URL`      | jdbc\:postgresql://... (Render DB URL) |
| `SPRING_DATASOURCE_USERNAME` | e.g. `kamalesh1_user`                  |
| `SPRING_DATASOURCE_PASSWORD` | Your DB password                       |


