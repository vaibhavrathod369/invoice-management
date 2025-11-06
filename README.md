📖 Table of Contents
	1.	Overview
	2.	Features
	3.	Tech Stack
	4.	Architecture
	5.	Setup & Installation
	6.	API Endpoints
	7.	Sample API Request
	8.	Screenshots (Optional)
	9.	Future Enhancements
	10.	Learning Outcome
	11.	Author

⸻

🧩 Overview

This backend application helps businesses manage their invoice lifecycle — from creation to approval.
It follows a clean 3-layer architecture (Controller → Service → Repository) and connects to a MySQL database using Spring Data JPA.

⸻

🚀 Features
	•	Create, view, approve, and delete invoices
	•	Default status set as PENDING on creation
	•	Update invoice status to APPROVED through API
	•	Uses Spring Boot REST APIs
	•	Database integration using MySQL + JPA
	•	Easily testable via Postman or Swagger UI

  ______

  🧱 Tech Stack

  | Layer       | Technology        |
| ----------- | ----------------- |
| Language    | Java 17           |
| Framework   | Spring Boot 3.3.5 |
| Database    | MySQL 8           |
| ORM         | Spring Data JPA   |
| Build Tool  | Maven             |
| API Testing | Postman           |
| IDE         | IntelliJ IDEA     |

______

🏗 Architecture
Controller → Service → Repository → Database

Each layer has a clear responsibility:
-> Controller → handles HTTP requests
-> Service → contains business logic
-> Repository → interacts with MySQL database

______

⚙️ Setup & Installation

1️⃣ Clone the Repository
git clone https://github.com/<your-username>/invoice-management-system.git
cd invoice-management-system

2️⃣ Create MySQL Database

Open MySQL Command Line Client and run:

CREATE DATABASE invoicedb;
CREATE USER 'invoiceuser'@'localhost' IDENTIFIED BY 'invoicepass';
GRANT ALL PRIVILEGES ON invoicedb.* TO 'invoiceuser'@'localhost';
FLUSH PRIVILEGES;

3️⃣ Configure Application Properties

Open src/main/resources/application.properties and verify:

spring.datasource.url=jdbc:mysql://localhost:3306/invoicedb?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=invoiceuser
spring.datasource.password=invoicepass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

4️⃣ Run the Application

Run the project using Maven:
vnw spring-boot:run


Server starts at:
👉 http://localhost:8080


📡 API Endpoints

| Method | Endpoint                     | Description              |
| ------ | ---------------------------- | ------------------------ |
| GET    | `/api/invoices`              | Fetch all invoices       |
| POST   | `/api/invoices`              | Create a new invoice     |
| PUT    | `/api/invoices/{id}/approve` | Approve an invoice by ID |
| DELETE | `/api/invoices/{id}`         | Delete an invoice by ID  |


🧾 Sample API Request
➕ Create Invoice (POST)

URL:
http://localhost:8080/api/invoices

Body (JSON):

{
  "vendorName": "XYZ",
  "amount": 15000.75,
  "invoiceDate": "2025-11-06",
  "status": "PENDING"
}


Response:

{
  "id": 1,
  "vendorName": "Infosys Vendor",
  "amount": 15000.75,
  "invoiceDate": "2025-11-06",
  "status": "PENDING"
}

🧪 Test Using Postman
Import the API endpoints manually in Postman.
Use raw JSON format (as shown above).
Observe database updates live in MySQL.

👨‍💻 Author

Vaibhav Rathod
Backend Developer | Java | ERP Systems | Databases

📧 Email: vaibhavrathod369@example.com
🔗 LinkedIn: https://www.linkedin.com/in/vaibhavrathod369/
💻 GitHub: github.com/VaibhavRathod
