# Todo Application

## Table of Contents
- [Overview](#overview)
- [Purpose](#purpose)
- [Application Features](#application-features)
- [Technologies Used](#technologies-used)
- [Real-World Scenario Match](#real-world-scenario-match)
- [Running the Application Locally](#running-the-application-locally)
   - [Prerequisites](#prerequisites)
   - [Steps](#steps)
- [Backend CI/CD Pipeline Documentation](#backend-cicd-pipeline-documentation)
   - [Overview](#overview-1)
   - [Pipeline Components](#pipeline-components)
   - [Setup Steps](#setup-steps)
   - [Deployment Verification](#deployment-verification)
   - [Best Practices](#best-practices)
   - [Conclusion](#conclusion)

## Overview
This Todo Application is a full-stack web application designed for managing daily tasks efficiently. It serves as a learning project, aimed at understanding and implementing modern web development practices and tools.

## Purpose
The primary purpose of this application is educational. It is developed to gain hands-on experience in the following areas:
- **Full-Stack Development**: Integrating a React-based frontend with a Spring Boot backend.
- **API Design**: Building RESTful APIs with Spring Boot.
- **Frontend Development**: Creating a responsive and interactive UI using React.
- **Database Management**: Utilizing databases for persistent storage of data.
- **CI/CD Pipelines**: Implementing Continuous Integration and Continuous Deployment using GitHub, Heroku, and Vercel.
- **Version Control**: Using Git and GitHub for source code management and collaboration.

## Application Features
- **Task Management**: Users can create, view, update, and delete tasks.
- **Responsive Design**: The frontend is designed to be responsive, making it accessible across various devices.

## Technologies Used
- **Frontend**: React, HTML, CSS
- **Backend**: Spring Boot, Java
- **Database**: H2 (dev), PostgreSQL
- **Deployment**: Heroku (Backend), Vercel (Frontend)
- **CI/CD**: GitHub Actions

## Real-World Scenario Match
This project is designed to mimic real-world software development scenarios including:

- Working with modern web frameworks and technologies.
- Building and consuming RESTful APIs.
- Implementing responsive web design.
- Deploying applications to cloud platforms.
- Practicing DevOps methodologies through CI/CD pipelines.

## Running the Application Locally

### Prerequisites
- Node.js and npm (for React frontend)
- Java and Maven (for Spring Boot backend)

### Steps
1. **Clone the Repository (backend or frontend)**:
   ```bash
   git clone [repository URL]
   cd [repository directory]

2. **Run the Backend**
    ```bash
   mvn spring-boot:run

3. **Run the Frontend**
    ```bash
   npm install
   npm start


Certainly! Below is a documentation outline summarizing the setup of your backend CI/CD pipeline with GitHub and Heroku. This documentation can be used as a reference for current and future projects or team members.

---

# Backend CI/CD Pipeline Documentation

## Overview
This document outlines the Continuous Integration and Continuous Deployment (CI/CD) pipeline setup for the backend of the Todo Application, a Spring Boot project. The backend is hosted on GitHub and automatically deployed to Heroku.

## Pipeline Components
- **Source Control**: GitHub
- **CI/CD Service**: GitHub Actions (for running tests) and Heroku (for deployment)
- **Hosting Platform**: Heroku
- **Primary Branch for Deployment**: `main`

## Setup Steps

### GitHub Repository Setup
1. **Repository Creation**: A dedicated GitHub repository is created for the backend code.
2. **Branch Strategy**: The `main` branch is used as the primary branch for development and deployment.

### Heroku Setup
1. **Application Creation**: A new application is created in Heroku.
2. **GitHub Integration**:
   - In the Heroku dashboard, under the "Deploy" tab, the GitHub repository is connected to the Heroku application.
   - Automatic deployments are set up to deploy code from the `main` branch.

### Automatic Deployment
- **Trigger**: Every push to the `main` branch triggers an automatic deployment on Heroku.
- **Process**:
   - Heroku detects changes pushed to the `main` branch.
   - The application is built and deployed automatically by Heroku.

### GitHub Actions (Optional)
- If implemented, GitHub Actions runs automated tests for each push or pull request to ensure code quality and functionality before deployment.

## Deployment Verification
- **Push Test**: A small change, such as a comment or documentation update, is pushed to the `main` branch to verify that the CI/CD pipeline triggers correctly and executes all steps, including deployment.
- **Heroku Logs**: The `heroku logs --tail --app your-app-name` command is used to monitor deployment logs and troubleshoot if needed.

## Best Practices
- **Commit Messages**: Clear and descriptive commit messages are encouraged for better tracking and understanding of changes.
- **Testing**: Regular testing and monitoring of the deployment process to ensure reliability and efficiency.
- **Security**: Secure handling of sensitive information like API keys using environment variables in Heroku.

## Conclusion
The backend CI/CD pipeline is set up to facilitate efficient, automated deployment of the Spring Boot application, ensuring a streamlined development workflow and consistent deployment practices.

## Other
- CI/CD trigger 1
