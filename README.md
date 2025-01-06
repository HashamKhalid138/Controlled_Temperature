# 🌡️ **Temperature Controller System**

## 📚 **Description**  
This project is a **Temperature Controller System** designed using a **Layered Architecture** and implemented in **Java**. The system manages temperature control in a smart home setup, following **GRASP (General Responsibility Assignment Software Patterns)** principles to ensure clean code, low coupling, and high cohesion.  

The architecture is divided into three layers:  
1. **Presentation Layer:** Handles user interaction.  
2. **Logic Layer:** Manages core logic and communication with devices.  
3. **Data Layer:** Directly interacts with hardware systems like cooling and heating systems.  

---

## 🏗️ **Architecture Overview**  

### 📁 **1. Presentation Layer**  
- **Class:** `SmartHomeController`  
- **Responsibility:** Acts as a mediator between the user and system logic.  
- **Method:** `setTemperature(float targetTemp)`  

### 📁 **2. Logic Layer**  
- **Class:** `TemperatureService`  
- **Responsibility:** Handles system logic for turning the system ON and OFF.  
- **Methods:**  
   - `onSystem(float targetTemp)`  
   - `offSystem(float targetTemp)`  

### 📁 **3. Data Layer**  
- **Class:** `TemperatureDevices`  
- **Responsibility:** Controls the physical devices (cooling and heating systems).  
- **Methods:**  
   - `coolingSystem()`  
   - `heatingSystem()`  

---

## 🧠 **GRASP Principles Applied**  

### 1️⃣ **Information Expert**  
- **Applied To:** `TemperatureDevices` and `TemperatureService`  
- **Why:**  
   - `TemperatureDevices` knows best how to manage hardware operations (cooling/heating).  
   - `TemperatureService` knows how to control devices based on the target temperature.  

### 2️⃣ **Controller**  
- **Applied To:** `SmartHomeController`  
- **Why:**  
   - `SmartHomeController` acts as the entry point for temperature management requests.  
   - It delegates tasks to the `TemperatureService`.  

### 3️⃣ **Low Coupling**  
- **Applied Between:** `SmartHomeController`, `TemperatureService`, and `TemperatureDevices`  
- **Why:**  
   - Each layer communicates with the layer below without knowing the internal workings of the lower layer.  
   - Changes in one class do not heavily impact others.  

### 4️⃣ **High Cohesion**  
- **Applied To:** All classes  
- **Why:**  
   - Each class has a single, focused responsibility.  
   - `SmartHomeController` focuses on user interaction.  
   - `TemperatureService` focuses on logic.  
   - `TemperatureDevices` focuses on hardware interactions.  

---

### Summary of GRASP Principles:
1. **Information Expert**: Classes like `TemperatureService` and `TemperatureDevices` are experts in handling specific parts of the system's logic (temperature control and device activation).
2. **High Cohesion**: Each class is highly cohesive, focusing on a single responsibility, such as controlling the temperature or managing device behavior.
3. **Low Coupling**: The classes are loosely coupled, reducing dependencies and allowing each part of the system to be modified or extended independently.
4. **Controller**: `SmartHomeController` acts as the controller, coordinating the system's operations based on user input.

These GRASP principles ensure that the code is well-structured, modular, and easier to maintain or extend in the future.
### How to run Code:
Use netbeans, javac for running my code
