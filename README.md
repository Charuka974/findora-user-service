# Findora User Service

## Student Information
- **Student Name:** Charuka Hansaja[cite: 2]
- **Student ID:** c44073838[cite: 2]
- **Slack Handle:** Charuka (`U0BF12U29NF`)[cite: 2]
- **GCP Project ID:** findora-cloud-platform[cite: 2]

---

## Project Description
Handles user registration, authentication, and user profile metadata for the Findora platform.

## Technology Stack & Database
- **Language:** Java 25 / Spring Boot[cite: 2]
- **Database:** Relational Database (Cloud SQL - MySQL / PostgreSQL)[cite: 2]
- **Service Discovery:** Netflix Eureka Client[cite: 2]

## Setup / Getting Started Instructions
```bash
mvn clean package -DskipTests
java -jar target/user-service-0.0.1-SNAPSHOT.jar