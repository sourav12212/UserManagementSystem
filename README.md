# <h1 align="center"> User Management System </h1>
<p align="center">
  <a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
  </a>
  <a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
  </a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.4-brightgreen.svg" />
  </a>
   <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
</p>

---

<p align="left">

# Spring User Management System

This Spring project is a User Management System that provides CRUD (Create, Read, Update, Delete) operations for managing user data. It includes API endpoints for adding, retrieving, updating, and deleting user information.

## Project Setup

To set up this project, follow these steps:

1. Create a new Spring Boot project using Spring Initializer by visiting [https://start.spring.io/](https://start.spring.io/).

2. Choose the required dependencies for your project, including Spring Web, Spring Data JPA, and any other dependencies you may need.

3. Generate the project and import it into your preferred IDE (Eclipse, IntelliJ, etc.).

## User Model

The `User` model represents the attributes of a user:

- `userId` (Integer): Unique identifier for each user.
- `userName` (String): User's username.
- `userDateOfBirth` (LocalDate): User's date of birth (formatted as 'yyyy-MM-dd').
- `userEmail` (String): User's email address.
- `phoneNumber` (String): User's phone number (12 digits with the country code).
- `dateTime` (LocalDateTime): Date and time when the user record was created or updated.

## API Endpoints

The project provides the following API endpoints:

1. `POST /addUser`: Add a new user. Request body should contain user details (JSON).
2. `GET /getUser/{userId}`: Retrieve a user by their `userId`.
3. `GET /getAllUsers`: Retrieve a list of all users.
4. `PUT /updateUserInfo/{userId}`: Update user information for a specific `userId`. Request body should contain updated user details (JSON).
5. `DELETE /deleteUser/{userId}`: Delete a user by their `userId`.

## Validation

Validation has been implemented using Spring annotations. The following validations are applied:

- `userName`: Must be between 8 and 50 characters.
- `userDateOfBirth`: Must be in 'yyyy-MM-dd' format.
- `userEmail`: Must be a valid email format.
- `phoneNumber`: Must be 12 digits with the country code '91'.
- `dateTime`: Automatically generated timestamp for user records.

For more information on Spring annotations, refer to [Spring Boot Annotations - GeeksforGeeks](https://www.geeksforgeeks.org/spring-boot-annotations/).

Feel free to customize this project as needed for your specific requirements.

## Author

[Sourav Das]

## License

This project is licensed under the [MIT License](LICENSE).


<!-- Contact -->
## Contact
For questions or feedback, please contact [Sourav Das](mailto:sourav12212@gmail.com).
