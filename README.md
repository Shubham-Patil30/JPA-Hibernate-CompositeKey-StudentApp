# Student App

## Description
The Student App is a Java-based application that uses JPA and Hibernate for managing student data in a relational database. This project demonstrates the use of composite keys with `@Embeddable` and `@EmbeddedId` annotations for uniquely identifying each student. It provides functionality to add and retrieve students, with a check to avoid duplicate entries.

## Features
- Implements composite primary keys using `@Embeddable` and `@EmbeddedId`
- Adds student information and checks for existing entries
- Uses JPA and Hibernate for ORM and data persistence
- Simple CRUD operations

## Technologies Used
- Java
- JPA (Java Persistence API)
- Hibernate ORM
- MySQL (or any other relational database)
- Maven for dependency management

## Project Structure
- `StudentEntity`: An entity class representing student data with `@EmbeddedId` for the composite key.
- `StudentCompositeKey`: An embeddable class used as a composite key in `StudentEntity`.
- `StudentDAO` and `StudentDAOImpl`: The DAO interface and implementation for data operations.

## Annotations
- `@Entity` and `@Table`: Define the Student entity and database table.
- `@Embeddable`: Declares `StudentCompositeKey` as a composite key component that can be embedded in other entities.
- `@EmbeddedId`: Embeds the composite key in `StudentEntity`.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Shubham-Patil30/JPA-Hibernate-CompositeKey-StudentApp.git
   cd student-app
