# myBudget v1.0

myBudget is a very basic application of family's budget handling.  Create as a final project for Java Web Developper course in Coderslab

## Technologies

Java, Spring, Hibernate (JPA, Validator), JSP  
Frontend without framework: HTML, CSS, JavaScript

## Description

Possibility to create your expense, but before you need to create the concerned currencies and shops.  
Currencies and shops used in any expense are not deletable.  
Any expense is composed of:

1. Total amount of the expense
2. Personal amount is the amount from your bill that you don't want to share in costs.
3. Shared amount is the amount from your bill that you want to share in costs.

Note that your total amount should be the addition of your personal amount and your shared amount. If not the expense will not be added.

Multi-user not supported.

## Endpoint

Currency's creation:  /currency/createForm  
Shop's creation:  /shop/createForm  
Expense's creation:  /expense/createForm

all currencies displaying:  /currency/showAll  
all shops displaying:  /shop/showAll  
all expenses displaying:  /expense/showAll  
