Today’s will be related to the theory content. You will try to implement and apply the
open/close principle and factory method. 

This lab’s objectives:
1. Applying Liskov Substitution Principle
2. Applying Single Responsibility Principle

### TASKS:

#### Shape Ordered Printer

A team of developers is tasked with creating a simple shape drawing application. The
application needs to handle different types of shapes, calculate their areas, and draw them
on a canvas in a specific order. 

Here’s how the project unfolds:

#### • Shape

– There will be different types of shapes: square, rectangle, and circle.

– Each shape will have a certain starting coordinate of x and y.

– Each shape will have its own implementation of area calculation.

#### • Order Printer

Takes a list of different Shapes and orders them according to the criteria given below,

– By area (ascending order).

– If areas are equal, by x-position (left to right).

– If x-positions are also equal, by y-position (top to bottom).

Write at least 10 test cases for this application.