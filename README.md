Project Country Search
A student that completes this project shows that they can:

Use IntelliJ in the following areas: application creation, code entry, and code execution
Explain the uses of and differences between Maven, Spring, and Tomcat
Build a REST service using Spring Boot
Use and implement inversion of control and dependency injection with Spring
Implement Beans throughout the Beans’ lifecycle controlling the Beans using annotations
Introduction
The countries of the world have many different defining attributes including land size, population, and median age. Below is a list of countries to include in your data. As most people do their research using websites, we are going to create web services to help search this data. We will be returning JSON objects. Nothing fancy for now!

We will be creating an table for country data. The country model should contain the following fields. The model should be named Country and the table countries

String name
long population
long landmasskm2
int medianage
The model should also include the standard getters and setters. You should use the provided data.sql file to seed your data

Some Important Notes That Might help:

The sort method must work with int - so not long. the solution - type casting! See the code snippet below:
.sort((c1, c2) -> (int)(c1.getPopulation() - c2.getPopulation()))
To calculate median for stretch goals - if the list contains an odd number of items, pick the middle one. If the list contains an even number of items, pick either of the two items that lie in the middle.
Using the data.sql at the end, the endpoints will produce the following outputs. Expand to see the suggested outputs! Note that id numbers may vary.

To set up this project you will need to

 Create a forked copy of this project
 Clone your OWN version of the repository (Not Lambda's by mistake!)
 Create a new branch: git checkout -b .
 Push commits: git push -u origin
 Using the cloned repository as your working directory, create an initial application using the IntelliJ GUI interface remembering to implement the project on your newly created branch, committing changes regularly
 Push commits: git push origin
Video on how to set up your project

 When completed, submit on Canvas the link to YOUR GitHub Repository
MVP
http://localhost:2019/names/all
http://localhost:2019/names/start/u
http://localhost:2019/population/total
http://localhost:2019/population/min
http://localhost:2019/population/max
Stretch Goal
http://localhost:2019/population/median
