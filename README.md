# 🛒 Spring Boot E-Commerce Backend Project
---
## 📌 Project Overview

This project is a complete E-Commerce Backend Application developed using:

- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Swagger OpenAPI
- Razorpay Payment Gateway
- Docker
- Java Mail Sender

The application provides REST APIs for managing:

- Categories
- Products
- Users
- Orders
- Reviews
- Wishlist
- Cart
- Image Upload
- Payments
- Email Sending

This project is designed to simulate a real-world e-commerce backend system.
---


# 🚀 Features

## ✅ User Features

- User Registration
- User Login
- Product Browsing
- Product Search
- Pagination & Sorting
- Add to Cart
- Wishlist Management
- Place Orders
- Add Reviews & Ratings
- Upload Product Images
- Email Notifications
- Online Payment Integration


## ✅ Admin Features

- Manage Categories
- Manage Products
- Manage Orders
- Update Order Status
- View Users
- Swagger API Documentation

# 🛠️ Technologies Used

<div align="center">

| 🚀 Technology | 📌 Purpose |
|---|---|
| ![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) | Programming Language |
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) | Backend Framework |
| ![Spring MVC](https://img.shields.io/badge/Spring_MVC-6DB33F?style=for-the-badge&logo=spring&logoColor=white) | REST APIs |
| ![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-59666C?style=for-the-badge) | Database Operations |
| ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white) | ORM Framework |
| ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) | Database |
| ![Swagger](https://img.shields.io/badge/Swagger_OpenAPI-85EA2D?style=for-the-badge&logo=swagger&logoColor=black) | API Documentation |
| ![Razorpay](https://img.shields.io/badge/Razorpay-02042B?style=for-the-badge&logo=razorpay&logoColor=61DAFB) | Payment Gateway |
| ![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white) | Containerization |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) | Dependency Management |
| ![Lombok](https://img.shields.io/badge/Lombok-CA4245?style=for-the-badge) | Reduce Boilerplate Code |

</div>


# 📁 Project Structure

```
src/main/java/com/ecommerce

├── controller
│   ├── CategoryController.java
│   ├── ProductController.java
│   ├── UserController.java
│   ├── OrderController.java
│   ├── ReviewController.java
│   ├── WishlistController.java
│   ├── UploadController.java
│   ├── EmailController.java
│   └── PaymentController.java

├── entity
│   ├── Category.java
│   ├── Product.java
│   ├── User.java
│   ├── OrderEntity.java
│   ├── Review.java
│   ├── Wishlist.java
│   └── Cart.java

├── repository
│   ├── CategoryRepository.java
│   ├── ProductRepository.java
│   ├── UserRepository.java
│   ├── OrderRepository.java
│   ├── ReviewRepository.java
│   ├── WishlistRepository.java
│   └── CartRepository.java

├── service
│   ├── CategoryService.java
│   ├── ProductService.java
│   ├── UserService.java
│   ├── OrderService.java
│   ├── ReviewService.java
│   ├── WishlistService.java
│   ├── CartService.java
│   ├── FileUploadService.java
│   ├── EmailService.java
│   └── PaymentService.java

├── serviceimplementation
│   ├── CategoryServiceImplementation.java
│   ├── ProductServiceImplementation.java
│   ├── UserServiceImplementation.java
│   ├── OrderServiceImplementation.java
│   ├── ReviewServiceImplementation.java
│   ├── WishlistServiceImplementation.java
│   ├── CartServiceImplementation.java
│   ├── FileUploadServiceImplementation.java
│   ├── EmailServiceImplementation.java
│   └── PaymentServiceImplementation.java

├── exception
│   ├── ErrorResponse.java
│   └── GlobalExceptionHandler.java

├── config
│   ├── OpenApiConfig.java
│   └── RazorpayConfig.java

└── EcommerceProjectApplication.java
```


# ⚙️ Setup Instructions

---

## ✅ Step 1: Clone Repository

```bash
git clone https://github.com/yourusername/ecommerce-project.git
```

---

## ✅ Step 2: Open Project

Open project in:

- Eclipse
- Spring Tool Suite (STS)
- IntelliJ IDEA
- VS Code

---

## ✅ Step 3: Configure MySQL

Create database:

```sql
CREATE DATABASE ecommerce;
```

---

---
## ✅ Step 4: Configure application.properties

```
spring.application.name=Ecommerce_project

server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Swagger
springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true

# File Upload
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

# Mail Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=yourgmail@gmail.com
spring.mail.password=your_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Razorpay
razorpay.key=your_key
razorpay.secret=your_secret
```
---

---
# 📦 Maven Dependencies

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>com.razorpay</groupId>
    <artifactId>razorpay-java</artifactId>
    <version>1.4.4</version>
</dependency>
```
---

---
# ▶️ Running the Project

## ✅ Run Application

Run:
```
EcommerceProjectApplication.java
```
OR
```
mvn spring-boot:run
```
---

---
# 📖 Swagger Documentation

## Swagger UI
```
http://localhost:8080/swagger-ui/index.html
```

## OpenAPI Docs
```
http://localhost:8080/v3/api-docs
```
---




# 📌 API Endpoints

---

# 📁 Category APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/categories</td>
<td>Add Category</td>
</tr>

<tr>
<td>GET</td>
<td>/api/categories</td>
<td>Get All Categories</td>
</tr>

<tr>
<td>GET</td>
<td>/api/categories/{id}</td>
<td>Get Category By Id</td>
</tr>

<tr>
<td>DELETE</td>
<td>/api/categories/{id}</td>
<td>Delete Category</td>
</tr>
</table>

---

# 📱 Product APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/products</td>
<td>Add Product</td>
</tr>

<tr>
<td>GET</td>
<td>/api/products</td>
<td>Get All Products</td>
</tr>

<tr>
<td>GET</td>
<td>/api/products/{id}</td>
<td>Get Product By Id</td>
</tr>

<tr>
<td>DELETE</td>
<td>/api/products/{id}</td>
<td>Delete Product</td>
</tr>

<tr>
<td>GET</td>
<td>/api/products/search</td>
<td>Search Products</td>
</tr>
</table>

---

# 👤 User APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/users/register</td>
<td>Register User</td>
</tr>

<tr>
<td>POST</td>
<td>/api/users/login</td>
<td>User Login</td>
</tr>

<tr>
<td>GET</td>
<td>/api/users</td>
<td>Get All Users</td>
</tr>
</table>

---

# 🛒 Cart APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/cart</td>
<td>Add To Cart</td>
</tr>

<tr>
<td>GET</td>
<td>/api/cart/{userId}</td>
<td>Get User Cart</td>
</tr>

<tr>
<td>DELETE</td>
<td>/api/cart/{id}</td>
<td>Remove Cart Item</td>
</tr>
</table>

---

# 📦 Order APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/orders</td>
<td>Place Order</td>
</tr>

<tr>
<td>GET</td>
<td>/api/orders</td>
<td>Get All Orders</td>
</tr>

<tr>
<td>GET</td>
<td>/api/orders/user/{id}</td>
<td>Get User Orders</td>
</tr>

<tr>
<td>PUT</td>
<td>/api/orders/{id}</td>
<td>Update Order Status</td>
</tr>
</table>

---

# ❤️ Wishlist APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/wishlist</td>
<td>Add Wishlist</td>
</tr>

<tr>
<td>GET</td>
<td>/api/wishlist/{userId}</td>
<td>Get Wishlist</td>
</tr>

<tr>
<td>DELETE</td>
<td>/api/wishlist/{id}</td>
<td>Remove Wishlist</td>
</tr>
</table>

---

# ⭐ Review APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/reviews</td>
<td>Add Review</td>
</tr>

<tr>
<td>GET</td>
<td>/api/reviews/{productId}</td>
<td>Get Reviews</td>
</tr>

<tr>
<td>GET</td>
<td>/api/reviews/average/{productId}</td>
<td>Average Rating</td>
</tr>

<tr>
<td>DELETE</td>
<td>/api/reviews/{id}</td>
<td>Delete Review</td>
</tr>
</table>

---

# 🖼️ Upload APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/upload</td>
<td>Upload Image</td>
</tr>
</table>

---

# 📧 Email APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/email</td>
<td>Send Email</td>
</tr>
</table>

---

# 💳 Payment APIs

<table>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
</tr>

<tr>
<td>POST</td>
<td>/api/payment/create-order</td>
<td>Create Razorpay Order</td>
</tr>
</table>




---

# 🔍 Search, Pagination & Sorting

## 📌 Example Request

```http
GET /api/products/search?keyword=phone&page=0&size=5&sortBy=price
```

---

## 📋 Query Parameters

| Parameter | Description |
|----------|-------------|
| `keyword` | Product search keyword |
| `page` | Page number |
| `size` | Records per page |
| `sortBy` | Sorting field |

---

## ✅ Example Response

```json
{
  "content": [
    {
      "id": 1,
      "name": "iPhone 15",
      "price": 79999
    }
  ],
  "pageNumber": 0,
  "pageSize": 5,
  "totalElements": 20,
  "totalPages": 4
}
```

---

## 🚀 Supported Sorting Fields

- `price`
- `name`
- `createdAt`

---

## 📌 Notes

- Pagination starts from `0`
- `size` controls number of records per page
- `sortBy` can be changed dynamically



---

# 🖼️ Image Upload API

## 📌 Upload Product Image

```http
POST /api/upload
```

---

## 📂 Content Type

```txt
multipart/form-data
```

---

## 📤 Request Body

| Field | Type | Description |
|------|------|-------------|
| `file` | File | Product image file |

---

## 🔗 Access Uploaded Image

```http
http://localhost:8080/images/filename.jpg
```

---

## ✅ Example Response

```json
{
  "fileName": "iphone.jpg",
  "imageUrl": "http://localhost:8080/images/iphone.jpg",
  "message": "Image uploaded successfully"
}
```

---

## ⚠️ Notes

- Supports JPG, PNG, JPEG
- Use `multipart/form-data`
- Max upload size: 10MB




---

# 📧 Email Sending API

## 📌 Send Email

```http
POST /api/email
```

---

## 📤 Request Body

| Field | Type | Description |
|------|------|-------------|
| `to` | String | Receiver email address |
| `subject` | String | Email subject |
| `text` | String | Email message content |

---

## 📨 Example Request

```json
{
  "to": "user@gmail.com",
  "subject": "Order Confirmation",
  "text": "Your order has been placed successfully"
}
```

---

## ✅ Example Response

```json
{
  "message": "Email sent successfully"
}
```

---

## ⚠️ Notes

- SMTP configuration required
- Supports Gmail SMTP
- Use valid email addresses only






---

# 💳 Razorpay Integration

## 📌 Create Payment Order

```http
POST /api/payment/create-order
```

---

## 📤 Request Body

| Field | Type | Description |
|------|------|-------------|
| `amount` | Number | Payment amount in paise |

---

## 📨 Example Request

```json
{
  "amount": 50000
}
```

---

## ✅ Example Response

```json
{
  "id": "order_Q123456789",
  "currency": "INR",
  "amount": 50000,
  "status": "created"
}
```

---

## ⚠️ Notes

- Razorpay test keys required
- Amount should be passed in paise
- Secure payment order generation





---

# 🐳 Docker Support

## 📦 Step 1: Build JAR File

```bash
mvn clean package
```

Generates the executable Spring Boot JAR inside the `target/` folder.

---

## 📄 Step 2: Dockerfile

```dockerfile
FROM eclipse-temurin:17

WORKDIR /app

COPY target/Ecommerce_project-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

## 🏗️ Step 3: Build Docker Image

```bash
docker build -t ecommerce-app .
```

Creates a Docker image named `ecommerce-app`.

---

## 🚀 Step 4: Run Docker Container

```bash
docker run -p 8080:8080 ecommerce-app
```

Runs the Spring Boot application inside a Docker container.

---

## ✅ Step 5: Verify Running Container

```bash
docker ps
```

---

## 🌐 Application URL

```http
http://localhost:8080
```

---

## ⚠️ Notes

- Ensure Docker Desktop is running
- Java 17 is required
- Port `8080` must be free





---

# 🧪 API Testing

The APIs can be tested using the following tools:

| Tool | Purpose |
|------|---------|
| Swagger UI | Interactive API documentation |
| Postman | API request testing |
| Thunder Client | VS Code API testing extension |

---

## 🌐 Swagger UI

Access Swagger documentation:

```http
http://localhost:8080/swagger-ui/index.html
```

---

## 📬 Postman Testing

Import API endpoints into Postman and test:

- GET requests
- POST requests
- Authentication APIs
- File uploads
- Payment APIs

---

## ⚡ Thunder Client

Thunder Client can be installed directly inside VS Code for lightweight API testing.

---

## ✅ Recommended Testing Flow

1. Start Spring Boot application
2. Open Swagger UI
3. Test APIs using Postman
4. Verify responses and status codes

---

## 📌 Common Status Codes

| Status Code | Meaning |
|-------------|---------|
| `200` | Success |
| `201` | Resource Created |
| `400` | Bad Request |
| `401` | Unauthorized |
| `404` | Resource Not Found |
| `500` | Internal Server Error |




---

# ⚠️ Common Issues & Fixes

## 🔴 Swagger 500 Error

### Cause
Circular entity relationships causing serialization issues.

### Fix

Use:

```java
@JsonIgnoreProperties
```

or

```java
@JsonManagedReference
@JsonBackReference
```

---

## 🔴 MySQL Connection Error

### Check

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db

spring.datasource.username=root

spring.datasource.password=your_password
```

### Fixes

- Ensure MySQL server is running
- Verify database name
- Check username and password
- Confirm port `3306` is available

---

## 🔴 File Upload Error

### Cause
Multipart support not enabled.

### Fix

```properties
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=5MB
```

---

## 🔴 Razorpay Authentication Failed

### Cause
Invalid API credentials.

### Fix

```properties
razorpay.key=YOUR_KEY
razorpay.secret=YOUR_SECRET
```

### Notes

- Use Razorpay test keys during development
- Ensure secret key is correct
- Restart application after updating keys

---

## 🔴 Port Already in Use

### Error

```bash
Web server failed to start. Port 8080 was already in use.
```

### Fix

Change server port:

```properties
server.port=8081
```

or stop the running process using port `8080`.

---

## 🔴 Docker Container Not Starting

### Check

```bash
docker ps -a
```

### Fixes

- Ensure Docker Desktop is running
- Verify Docker image built successfully
- Check container logs:

```bash
docker logs <container_id>
```






---

# 📚 Concepts Learned

During this project, the following backend development concepts and technologies were implemented and practiced:

| Category | Concepts |
|----------|-----------|
| Backend Framework | Spring Boot, Spring MVC |
| API Development | REST APIs, CRUD Operations |
| Database | JPA, Hibernate, MySQL |
| Documentation | Swagger/OpenAPI |
| Advanced Features | Pagination, Sorting, Search APIs |
| File Handling | Multipart File Upload |
| Email Services | SMTP Email Integration |
| Payment Gateway | Razorpay Integration |
| Exception Handling | Global Exception Handling |
| Containerization | Docker |
| Build Tool | Maven |

---

## 🚀 Key Backend Skills Gained

- Building scalable REST APIs
- Database entity relationship mapping
- Request validation and exception handling
- API documentation using Swagger
- Dockerizing Spring Boot applications
- Payment gateway integration
- File upload handling
- Pagination and filtering implementation
- Email service integration

---

## 📈 Project Outcome

This project helped in understanding:

- Real-world backend architecture
- API design best practices
- Deployment workflow using Docker
- Secure payment integration
- Production-level backend debugging



---

# 🔮 Future Enhancements

The following improvements and advanced features are planned for future development:

| Feature | Purpose |
|---------|---------|
| JWT Authentication | Secure user authentication and authorization |
| Spring Security | Role-based access control and endpoint protection |
| React Frontend | Full-stack frontend integration |
| Admin Dashboard | Product, order, and user management |
| Payment Verification | Secure Razorpay payment validation |
| Order Tracking | Real-time order status updates |
| Cloud Deployment | Deploy application to cloud platforms |
| AWS Deployment | Production deployment using AWS services |
| CI/CD Pipeline | Automated build and deployment workflow |
| Redis Caching | Improve API response performance |
| Microservices Architecture | Scalable distributed backend services |

---

## 🚀 Planned Advanced Features

### 🔐 Security Improvements
- JWT token authentication
- Refresh token support
- Role-based authorization
- API endpoint protection

---

### ☁️ Deployment & Scalability
- AWS EC2 deployment
- Docker Compose support
- CI/CD integration using GitHub Actions
- Redis caching for performance optimization

---

### 🛒 E-Commerce Enhancements
- Real-time order tracking
- Payment verification workflow
- Admin analytics dashboard
- Product recommendation system

---

## 📈 Long-Term Goal

Transform this project into a production-ready scalable e-commerce platform using modern backend architecture and cloud deployment practices.




---

# 👨‍💻 Author

## Divya M

### Full Stack Developer

---

## 🔗 Skills

- Java
- Spring Boot
- HTML
- CSS
- JavaScript
- React.js
- MySQL

---



---

# 📌 Git Commands

## 🚀 Initial Push to GitHub

### 1️⃣ Initialize Git Repository

```bash
git init
```

---

### 2️⃣ Add Project Files

```bash
git add .
```

---

### 3️⃣ Commit Changes

```bash
git commit -m "Initial commit for ecommerce backend project"
```

---

### 4️⃣ Rename Branch to Main

```bash
git branch -M main
```

---

### 5️⃣ Connect Remote Repository

```bash
git remote add origin https://github.com/yourusername/repository-name.git
```

---

### 6️⃣ Push Code to GitHub

```bash
git push -u origin main
```

---

## ✅ Verify Remote Repository

```bash
git remote -v
```

---

## 📌 Common Git Commands

| Command | Purpose |
|---------|---------|
| `git status` | Check modified files |
| `git pull` | Pull latest changes |
| `git push` | Push code to GitHub |
| `git clone <url>` | Clone repository |
| `git log` | View commit history |

---

## ⚠️ Notes

- Ensure Git is installed
- Configure Git username and email before pushing
- Replace repository URL with your actual GitHub repository



---

# 🚀 Final Thoughts

This project helped in building a strong understanding of modern backend development using Spring Boot and REST APIs.

### ✅ Implemented Features

- RESTful API Architecture
- Product & Order Management
- Payment Gateway Integration
- Swagger Documentation
- Docker Support
- Search, Pagination & Sorting
- File Upload APIs
- Email Services

### 📈 Future Scope

The project can be enhanced further with:

- JWT Authentication
- Spring Security
- Redis Caching
- AWS Deployment
- CI/CD Pipeline
- Microservices Architecture

This backend system provides a solid foundation for developing a full-scale production-ready e-commerce application.
