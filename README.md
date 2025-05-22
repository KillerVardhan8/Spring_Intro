# Spring Intro Project

This repository introduces core Spring Framework concepts using Spring Tool Suite (STS). It covers Dependency Injection, Bean Management via XML and annotations, and demonstrates modular understanding through simple use cases.

## Table of Contents
- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Concepts Demonstrated](#concepts-demonstrated)
- [Project Structure](#project-structure)
- [Modules](#modules)
  - [springboot-helloworld-app](#springboot-helloworld-app)
  - [springboot-dependency-injection](#springboot-dependency-injection)
  - [springboot-logging-demo](#springboot-logging-demo)
- [How to Run in STS](#how-to-run-in-sts)
- [Next Steps](#next-steps)

## Overview

**Spring_Intro** is a hands-on beginner project built in **Spring Tool Suite (STS)** to understand how the Spring Framework manages objects (beans), injects dependencies, and provides loose coupling via configuration. Each module demonstrates key concepts with small, focused applications.

## Technologies Used

- Java SE
- Spring Core (v5 or later)
- Spring Tool Suite (STS IDE)
- XML and Annotation-based configuration
- Maven (optional for managing dependencies)

## Concepts Demonstrated

- Inversion of Control (IoC)
- Dependency Injection (Constructor / Setter / Annotation)
- Bean creation via XML
- Autowiring using `@Autowired`
- ApplicationContext vs BeanFactory
- Logging in Spring applications

## Project Structure

- Each folder is a standalone STS project.
- `model/` – POJOs such as `Student`, `Department`, etc.
- `config/` – XML configuration for beans
- `App.java` or `MainApp.java` – Spring context loader and method tester

## Modules

### springboot-helloworld-app

A simple Spring application demonstrating:
- XML-based bean configuration
- Creating and retrieving beans via `ApplicationContext`

Key Learning:
> Basic Spring configuration and context setup.

---

### springboot-dependency-injection

Demonstrates:
- Constructor and Setter injection
- Using `@Autowired` for automatic bean wiring
- Creating service-like classes and injecting into controllers

Key Learning:
> Understanding different types of DI and real-world use of annotations.

---

### springboot-logging-demo

Demonstrates:
- Integrating logging into Spring-managed components
- Using `Logger` to trace object lifecycle and method calls

Key Learning:
> Tracing and debugging Spring behavior with logging.

## How to Run in STS

1. Clone the repository:
   ```bash
   git clone https://github.com/KillerVardhan8/Spring_Intro.git
