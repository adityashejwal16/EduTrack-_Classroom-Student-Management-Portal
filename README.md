# 🎓 EduTrack – Classroom & Student Management Portal
## 📌 Project Description

EduTrack is a Full Stack Backend Application developed using Spring Boot and MongoDB for managing classroom and student information.

The system allows users to perform CRUD operations on student batches, making it useful for educational institutes to manage their courses efficiently.

---

## 🧠 Project Overview
<br>
EduTrack helps in managing:
<br>
📚 Classroom / Batch Details
<br>
👨‍🎓 Student Information (extendable)
<br>
💰 Course Fees
<br>
⏳ Course Duration
<br>
All data is stored in MongoDB and accessed using REST APIs.

---

## 🏗️ Project Architecture
<br>

The project follows a Layered Architecture:


## src/main/java/
- entity
  - BatchEntry.java
- repository
  - BatchEntryRepository.java
- service
  - BatchEntryService.java
- controller
  - BatchEntryController.java

    
---

## ⚙️ Technologies Used
☕ Java
<br>
🚀 Spring Boot
<br>
🍃 Spring Data MongoDB
<br>
🗄️ MongoDB
<br>
🌐 REST API
<br>
📦 Maven

---


## 📂 Module Details
🔹 Entity Layer

Represents MongoDB collection.

## BatchEntry.java

• id
<br>
• batchName
<br>
• duration
<br>
• fees


## 🔹 Repository Layer

Handles database operations using:

<br>

MongoRepository<BatchEntry, String>


## 🔹 Service Layer

Contains business logic:
<br>
• Add Batch
<br>
• View All Batches
<br>
• Get Batch by ID
<br>
• Update Batch
<br>
• Delete Batch

---

## 🔹 Controller Layer

Handles HTTP requests.

Base URL:
/batches

## 🌐 API Endpoints
| Method | Endpoint      | Description     |
| ------ | ------------- | --------------- |
| POST   | /batches      | Create batch    |
| GET    | /batches      | Get all batches |
| GET    | /batches/{id} | Get batch by ID |
| PUT    | /batches/{id} | Update batch    |
| DELETE | /batches/{id} | Delete batch    |

## 🛠️ Configuration

Add in application.properties:

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=EduTrackDB


## ▶️ How to Run
１. Install & Start MongoDB
２. Clone the repository

git clone https://github.com/your-username/edutrack.git

３. Open in IDE (IntelliJ / Eclipse)
４. Run Spring Boot Application
５. Test APIs using Postman

---

## 🧪 Sample Request
{
  "batchName": "Java Full Stack",
  "duration": "6 Months",
  "fees": 50000
}

---

## 🎯 Features

✔ Manage classroom batches
✔ REST API support
✔ MongoDB integration
✔ Clean architecture
✔ Easy to extend (students, teachers, etc.)


## 🚀 Future Enhancements

👨‍🎓 Student Management Module
👩‍🏫 Teacher Management
🔐 Authentication (Login/Register)
📊 Dashboard UI (React/Angular)


## 📚 Learning Outcomes
Spring Boot REST APIs
MongoDB Integration
Backend Architecture Design
CRUD Operations

---

# 👨‍💻 Author
## Aditya Dipak Shejwal
