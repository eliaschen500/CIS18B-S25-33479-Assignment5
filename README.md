# CIS18B-S25-33479-Assignment5
MarketBridge Notification System

Overview

-This project implements a modular and generic notification system for MarketBridge, a fictional e-commerce platform. The system is designed using Java generics and incorporates several design patterns (Observer, Abstract Factory, and Builder) to support flexibility and scalability.

Features

-Generic Notification<T> class to handle various notification types.

-Observer pattern to allow different observers (Email/SMS) to react to notifications.

-Abstract Factory pattern for creating typed notification objects.

-Builder pattern to construct custom notifications.

-Demonstrates type erasure and generic limitations in Java.


|── Main.java                      // Entry point of the application
|── Notification.java              // Abstract base class for notifications
|── NotificationService.java       // Manages and notifies observers
|── NotificationBuilder.java       // Generic builder for creating notifications
|── Observer.java                  // Generic observer interface
|── EmailNotification.java         // Concrete email notification
|── SMSNotification.java           // Concrete SMS notification
|── EmailObserver.java             // Email observer implementation
|── SMSObserver.java               // SMS observer implementation
|── NotificationFactory.java       // Factory interface for creating notifications
|── EmailNotificationFactory.java  // Email factory
|── SMSNotificationFactory.java    // SMS factory
|── TypeErasureExample.java        // Demonstrates type erasure limitation
|── GenericArrayExample.java       // Demonstrates generic array restriction

Type Erasure & Generic Limitations

Two classes:

-TypeErasureExample.java: Explains why instanceof cannot be used with parameterized types.

-GenericArrayExample.java: Shows that you cannot create arrays of a generic type due to type erasure.

