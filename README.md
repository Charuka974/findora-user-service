# Findora User Service

## Student Information
- **Student Name:** Charuka Hansaja
- **Student ID:** 241722035
- **Slack Handle:** Charuka (`U0BF12U29NF`)
- **GCP Project ID:** findora-cloud-platform
---

## Project Description
Handles user registration, authentication, and user profile metadata for the Findora platform.

## Technology Stack & Database
- **Language:** Java 25 / Spring Boot
- **Database:** Relational Database (Cloud SQL - MySQL / PostgreSQL)
- **Service Discovery:** Netflix Eureka Client

## Setup / Getting Started Instructions
```bash
mvn clean package -DskipTests
java -jar target/user-service-0.0.1-SNAPSHOT.jar