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
