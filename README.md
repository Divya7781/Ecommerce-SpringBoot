# 🛒 Spring Boot E-Commerce Backend Project

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



