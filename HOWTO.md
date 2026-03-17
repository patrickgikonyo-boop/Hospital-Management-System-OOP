 Hospital Management System - HOWTO

 Name
Patrick Gikonyo  

 Student Number
225876  


 Project Description
This project is a Hospital Management System developed using Java Object-Oriented Programming (OOP) principles.

The system allows:
- Creation of Patients and Doctors
- Scheduling Appointments
- Generating Bills
- User input for dynamic data entry


 OOP Concepts Used
- Encapsulation (private variables with getters/setters)
- Inheritance (Doctor and Nurse inherit from MedicalStaff and Person)
- Abstraction (Person and MedicalStaff abstract classes)
- Interfaces (Payable, Schedulable)
- Polymorphism (method overriding)


 User Input Handling
The program uses the Scanner class to allow users to:
- Enter patient details
- Enter doctor details
- Input bill amount
- Schedule appointments


Exception Handling Implemented

 1. InputMismatchException
Handles cases where the user enters the wrong data type.
Example: entering text instead of a number.

 2. IllegalArgumentException
Prevents invalid values such as negative bill amounts.

 3. General Exception
Catches any unexpected errors to prevent program crash.

 4. finally Block
Ensures the Scanner is always closed properly to avoid memory leaks.

Program Robustness
The system ensures:
- Invalid inputs do not crash the program
- Errors are handled gracefully
- User is notified of mistakes

 How to Run
1. Open project in VS Code
2. Run HospitalMain.java
3. Follow prompts in terminal
