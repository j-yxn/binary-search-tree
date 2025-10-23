# Java Binary Search Tree for Student Records

This project is a Java implementation of a Binary Search Tree (BST) designed to manage student records efficiently.
The tree incorporates each student's unique ID as the key, allowing for efficient insertion, search, and deletion functions.

This was created and finalized as a project for my high school Data Structures and Algorithms (DSA) course.

## ✨ Features

**Insert:** Add a new `Student` object to the tree.<br>
**Search:** Find and return a `BinaryTreeNode` containing a `Student` object based on their unique ID. <br>
**Delete:** Remove a `Student` from the tree while maintaining the BST properties.<br>
**Traversals:** Includes a `print()` method that performs a level-order (breadth-first) traversal of the tree.<br>
**Object-Oriented:** Uses a custom-built `StudentQueue` class to support the level-order traversal.<br>

## 📂 Project Structure

`BinarySearchTree.java`: The main class containing the `main` method. This file is used to test the tree's functionality.<br>
`BinaryTree.java`: The core class containing all the Binary Search Tree logic (`insert`, `remove`, `search`, `print`).<br>
`IBinaryTree.java`: The interface that `BinaryTree` implements, defining the required public methods.<br>
`BinaryTreeNode.java`: Represents a single node in the tree, holding `Student` data.<br>
`Student.java`: The data model that holds student information (`studentId`, `name`, `year`).<br>
`StudentQueue.java`: A custom queue implementation (using a doubly-linked list) built to hold `BinaryTreeNode` objects for traversal.

## 📝 Usage
**Correct output of main() function:**
```java

There are no nodes in the tree.

Student Id: 284  Name: Alice  Class: Freshman
Student Id: 16  Name: Denise  Class: Junior
Student Id: 606  Name: Bob  Class: Senior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 139  Name: Eric  Class: Freshman
Student Id: 363  Name: Gail  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 749  Name: Henry  Class: Senior
Student Id: 992  Name: Frank  Class: Sophomore
Student Id: 802  Name: Ingrid  Class: Junior

Ingrid
Jack
Gail
Frank
NULL

Student Id 444 not found

Student 139 removed
Student Id: 284  Name: Alice  Class: Freshman
Student Id: 16  Name: Denise  Class: Junior
Student Id: 606  Name: Bob  Class: Senior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 363  Name: Gail  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 749  Name: Henry  Class: Senior
Student Id: 992  Name: Frank  Class: Sophomore
Student Id: 802  Name: Ingrid  Class: Junior

Student 749 removed
Student Id: 284  Name: Alice  Class: Freshman
Student Id: 16  Name: Denise  Class: Junior
Student Id: 606  Name: Bob  Class: Senior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 363  Name: Gail  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 802  Name: Ingrid  Class: Junior
Student Id: 992  Name: Frank  Class: Sophomore

Student 363 removed
Student Id: 284  Name: Alice  Class: Freshman
Student Id: 16  Name: Denise  Class: Junior
Student Id: 606  Name: Bob  Class: Senior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 821  Name: Carol  Class: Junior
Student Id: 802  Name: Ingrid  Class: Junior
Student Id: 992  Name: Frank  Class: Sophomore

Student 606 removed
Student Id: 284  Name: Alice  Class: Freshman
Student Id: 16  Name: Denise  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 802  Name: Ingrid  Class: Junior
Student Id: 992  Name: Frank  Class: Sophomore

Student 284 removed
Student Id: 802  Name: Ingrid  Class: Junior
Student Id: 16  Name: Denise  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 6  Name: Jack  Class: Sophomore
Student Id: 992  Name: Frank  Class: Sophomore

Student 992 removed
Student Id: 802  Name: Ingrid  Class: Junior
Student Id: 16  Name: Denise  Class: Junior
Student Id: 821  Name: Carol  Class: Junior
Student Id: 6  Name: Jack  Class: Sophomore

Student 802 removed
Student Id: 821  Name: Carol  Class: Junior
Student Id: 16  Name: Denise  Class: Junior
Student Id: 6  Name: Jack  Class: Sophomore

Student 16 removed
Student Id: 821  Name: Carol  Class: Junior
Student Id: 6  Name: Jack  Class: Sophomore

Student 821 removed
Student Id: 6  Name: Jack  Class: Sophomore

Student 6 removed
There are no nodes in the tree.

Student Id 888 not found
