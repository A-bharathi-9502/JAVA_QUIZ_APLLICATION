# Java Quiz Application 

A console-based **Java Quiz Application** developed using Core Java concepts.  
This project simulates a level-based quiz game similar to *“Who Wants to Be a Millionaire”* with lifelines and rewards.
##  Project Overview

The Java Quiz Application allows a user to answer **10 multiple-choice questions** sequentially.  
For every correct answer, the user is rewarded with ₹1000.  
The quiz ends immediately if the user selects a wrong answer.

Two lifelines are provided to assist the user:
- Audience Poll
- 50/50

Each lifeline can be used **only once in the entire game** and **cannot be used for the 10th question.
##  Features
- User input (Name & Age)
- 10 multiple-choice questions
- Reward system (₹1000 per correct answer)
- Quiz ends immediately on wrong answer
-Lifelines:
  - **Audience Poll** (percentage-based hints)
  - **50/50** (removes two incorrect options)
-  Lifelines hidden once used
-  Lifelines not allowed for the last question
-  Color-coded console output:
  - Correct Answer → Green
  - Wrong Answer → Red
-  Final result summary
##  Technologies Used

- **Programming Language:** Java  
- **Concepts:**  
  - Object-Oriented Programming (OOP)  
  - Arrays & ArrayList  
  - Loops and Conditional Statements  
  - Scanner Class  
- **Console Styling:** ANSI color codes  

---

## Project Structure
JAVA_QUIZ_APPLICATION/
│
├── GQT_Projects/
│ └── Quiz_Application/
│ ├── Main.java
│ ├── QuestionBank.java
│ ├── LifeLines.java
│ ├── RewardSystem.java
│ ├── UserDetails.java
│ ├── AnswerValidate.java
│ └── Colors.java
│
└── README.md


Sample Output:
Enter your Name: Bharathi
Enter your Age: 21
Welcome to Quiz Bharathi

Q1: Java is a ___ language?
a) Low-level  b) High-level  c) Assembly  d) Machine  e) Lifeline

Correct Answer!
Congratulations Bharathi! You got ₹1000

...
===== QUIZ COMPLETED =====
Congratulations Bharathi You won ₹10000


