Online Bookstore
This is an Online Bookstore web application developed using Spring Boot (MVC). Users can browse through a collection of books, view details such as title, author, and price, and add books to their shopping cart.

Features
Display a list of available books on the homepage.
Each book displays its title, author, price, and an "Add to Cart" button.
Search for books by title, author, or category (Phase 2 - Enhancement).
Registration and login functionality for users (Phase 2 - Security).
Admin dashboard for managing books and users (Phase 3 - Admin Dashboard).
Technologies Used
Java
Spring Boot
Spring MVC
Thymeleaf (Template Engine)
MySQL/Oracle (Phase 2 - Enhancement)
Spring Security (Phase 2 - Security)
Getting Started
To run this application locally, follow these steps:

Clone this repository:

bash
Copy code
git clone https://github.com/your-username/online-bookstore.git
Navigate to the project directory:

bash
Copy code
cd online-bookstore
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
Open your web browser and go to http://localhost:9095 to view the application.

Phase 2 - Enhancement
In Phase 2 of development, the following enhancements will be implemented:

Integration with a MySQL or Oracle database using Spring Boot JDBC.
Implementation of search functionality to allow users to search for books by title, author, or category.
Security features including user registration and login functionality.
Phase 3 - Admin Dashboard
In Phase 3, an admin dashboard will be developed to manage books and users efficiently:

Book Management: Admins can add, edit, or delete books from the database.
User Management: Admins can view and manage user accounts, including roles and permissions.
Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

Fork this repository.
Create a new branch: git checkout -b feature/your-feature-name
Commit your changes: git commit -am 'Add some feature'
Push to the branch: git push origin feature/your-feature-name
Submit a pull request.
