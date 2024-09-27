# Food Delivery System

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation Instructions](#installation-instructions)
- [Usage](#usage)
- [OOP Concepts Demonstrated](#oop-concepts-demonstrated)
- [License](#license)

## Project Description
The Food Delivery System is an online application designed to streamline the food ordering and delivery process. It allows customers to browse and order food items from various restaurants, manage their carts, and track their orders. The system includes distinct user roles: Admins who manage food items and restaurants, DeliveryPersons who handle order deliveries, and Users who can register as either Customers or Admins. This comprehensive system integrates all entities to provide a seamless food delivery experience.

## Features
- **User Registration**: Customers can register as Users or Admins.
- **Restaurant Management**: Admins can add, update, or delete restaurants and their menu items.
- **Order Management**: Customers can place, update, and track their orders.
- **Cart Management**: Users can manage their shopping carts before placing an order.
- **Role-Based Access**: Different functionalities based on user roles (Admin, DeliveryPerson, Customer).
- **Real-Time Order Tracking**: Customers can track the status of their orders.

## Technologies Used
- Java (Core Java for OOP concepts)
- Collections Framework
- Java I/O for data management

## Installation Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/food-delivery-system.git
Navigate to the project directory:
bash

Copy code

cd food-delivery-system

Compile the Java files:
bash

Copy code
javac *.java

Run the application:
bash

Copy code
java MainClass

Usage
Start the application and register as a Customer or Admin.
Browse the available restaurants and their menus.
Add food items to your cart and place an order.
Track your orders through the order management interface.
OOP Concepts Demonstrated
Inheritance: Different user roles (Customer, Admin, DeliveryPerson) inherit from a base class User.
Polymorphism: Methods like placeOrder() and trackOrder() are overridden in derived classes to provide specific implementations.
Collections: Utilization of Java Collections (e.g., ArrayLists) to manage lists of restaurants, orders, and users efficiently.
