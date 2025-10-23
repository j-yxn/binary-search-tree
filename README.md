# Java Binary Search Tree for Student Records

This project is a Java implementation of a Binary Search Tree (BST) designed to manage student records efficiently.
The tree incorporates each student's unique ID as the key, allowing for efficient insertion, search, and deletion functions.

This was created and finalized as a project for my high school Data Structures and Algorithms (DSA) course.

## ✨ Features

**Insert:** Add a new `Student` object to the tree.
**Search:** Find and return a `Student` object based on their unique ID.
**Delete:** Remove a `Student` from the tree while maintaining the BST properties.
**Traversals:** Includes methods for In-order, Pre-order, Post-order, and Level-order (breadth-first) traversal.
**Object-Oriented:** Uses a `Student.java` class as the data model, making the structure easy to understand and maintain.

## 📂 Project Structure

`Student.java`: The data model (POJO) that holds student information (e.g., `studentID`, `name`).
`BinaryTreeNode.java`: Represents a single node in the tree, holding a `Student` and references to left/right children.
`BinarySearchTree.java`: The core class containing all BST logic (`insert`, `search`, `delete`, etc.).
`StudentQueue.java`: A custom queue implementation used for the level-order (breadth-first) traversal.
`IBinaryTree.java` / `BinaryTree.java`: The interface and base class definitions for the tree.
