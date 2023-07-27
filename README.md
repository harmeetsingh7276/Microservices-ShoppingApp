# Microservices Shopping App

Microservices Shopping App is an application that provides a comprehensive overview of microservices architecture. The project is built using Spring Boot and employs various microservices, including Order, Product, and Inventory. Each microservice operates independently, with its own database schema, ensuring a modular and scalable system.


# Introduction
Microservices architecture is a modern approach to building applications, where complex applications are broken down into smaller, loosely-coupled services that can be developed, deployed, and scaled independently. This project serves as a practical example of how to implement microservices using Spring Boot and showcases the benefits of a microservices-based approach in building a shopping application.

# Features
Order Microservice: Manages the creation, retrieval, and processing of customer orders.
Product Microservice: Handles product information and inventory management.
Inventory Microservice: Tracks and maintains product availability and stock levels.
Service Discovery: Utilizes the Service Discovery Design pattern to register and discover microservices on the Eureka Server.
API Gateway: Acts as a single entry point to access all the microservices, keeping the URL consistent for clients.

# Technologies Used
Java
Spring Boot
Spring Cloud
Eureka Server
API Gateway


# Setup
To set up the Microservices Shopping App locally, follow these steps:

Clone the repository from GitHub Repo URL.
Navigate to the project root directory.
Build each microservice using Maven : mvn clean install 
Start the Eureka Server module.(Discovery-service)
Start each microservice module (Order, Product, Inventory) individually.
Finally, start the API Gateway module.
Ensure that you have Java and the necessary dependencies installed before proceeding with the setup.

# Usage
Once the application is up and running, you can interact with the microservices through the API Gateway, which serves as the entry point to the entire system. Use appropriate API endpoints to perform operations such as creating orders, managing products, and tracking inventory.

# Modules
The Microservices Shopping App comprises the following modules:

Order Microservice: Responsible for order management.
Product Microservice: Handles product-related operations.
Inventory Microservice: Deals with inventory tracking and management.
Discovery Server: Implements the Service Discovery pattern and registers services on the Eureka Server.
API Gateway: Acts as a single entry point for all microservices.
Each module has its own directory within the project.

# Service Discovery
The Discovery Server module uses the Service Discovery Design pattern and is built on the Spring Cloud project. It plays a crucial role in the microservices architecture, facilitating the registration of individual microservices on the Eureka Server. This enables services to dynamically discover and communicate with one another.

# API Gateway
The API Gateway serves as a central entry point for clients to access all microservices. It handles client requests and routes them to the appropriate microservice. The API Gateway provides a unified interface and helps in enforcing security, rate limiting, and other cross-cutting concerns.

# Spring Security Using Oauth2.0 (KeyCloak)
Implement Spring security using KeyCloak. We have our Authorization Type as OAuth2.0.
Steps to run security,KeyCloak and Get valid Token
1. run command-> docker run -p 8181:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.1 start-dev
2.Check if the keycloak service is active-> docker ps
3.Refer the video in the reference folder to get to know the settings->keycloak_settings.mp4
4.After you get the settings done copy the secret client key and token url from the keycloak and open postman
5.Refer this video for postman setting->postman_config.mp4

# Circuit Breaker using Resilience4j
This is basically a fault tolerance mechanism. The need of this component with a practicle example could be 
Example : We order a product & it internally calls the inventory-service and if inventory-service fails to cater the request due to various reasons like 
1.If the service is down
2.Timeout to respond to the request
That's where this system comes into picture

We have also implemented the Retry mechanism for the order service so that it tries 3 times before failing a request
