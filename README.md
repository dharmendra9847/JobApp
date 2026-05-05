# 💼 JobApp - Spring Boot Job Management Application

A simple and scalable Job Management Web Application built using **Spring Boot (MVC architecture)**. This application allows users to add job postings and view all available jobs.

---

## 🚀 Features

- Add new job postings
- View all job listings
- MVC-based architecture (Controller → Service → Model)
- Clean separation of concerns
- Form handling with Spring Boot
- Lightweight and easy to extend

---

## 🛠️ Tech Stack

- **Backend:** Java 17+/Spring Boot
- **Framework:** Spring MVC
- **Build Tool:** Maven
- **Frontend:** Thymeleaf / JSP (based on your setup)
- **Lombok:** For boilerplate reduction

---

## 📁 Project Structure

```
jobapp/
│
├── src/main/java/com/itsdharm/jobapp/
│
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   │
│   ├── exception/          # (Add later)
│   ├── config/             # (Add later)
│   ├── dto/                # (For API layer)
│   └── util/
│
├── src/main/resources/
│   ├── templates/
│   ├── static/
│   ├── application.properties
│
├── .gitignore
├── .gitattributes
├── README.md
└── pom.xml
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```bash
git clone https://github.com/dharmendra9847/JobApp.git
cd jobapp