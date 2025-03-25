public class BinarySearchTree {
    private static final int DATA_SIZE = 10;

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.print();
        System.out.println();
        
        Student[] data = new Student[DATA_SIZE];
        data[0] = new Student("Alice", "Freshman", 284);
        data[1] = new Student("Bob", "Senior", 606);
        data[2] = new Student("Carol", "Junior", 821);
        data[3] = new Student("Denise", "Junior", 16);
        data[4] = new Student("Eric", "Freshman", 139);
        data[5] = new Student("Frank", "Sophomore", 992);
        data[6] = new Student("Gail", "Junior", 363);
        data[7] = new Student("Henry", "Senior", 749);
        data[8] = new Student("Ingrid", "Junior", 802);
        data[9] = new Student("Jack", "Sophomore", 6);
        
        for (int i = 0; i < DATA_SIZE; i++) {
            bst.insert(data[i]);
        }
        bst.print();
        System.out.println();
        
        BinaryTreeNode student = bst.search(802);
        if (student == null)
            System.out.println("NULL");
        else
            System.out.println(student.data.name);
        student = bst.search(6);
        if (student == null)
            System.out.println("NULL");
        else
            System.out.println(student.data.name);
        student = bst.search(363);
        if (student == null)
            System.out.println("NULL");
        else
            System.out.println(student.data.name);
        student = bst.search(992);
        if (student == null)
            System.out.println("NULL");
        else
            System.out.println(student.data.name);
        student = bst.search(13);
        if (student == null)
            System.out.println("NULL");
        else
            System.out.println(student.data.name);
        
        System.out.println();
        boolean removed = bst.remove(444);
        if (removed) {
            System.out.println("Student 444 removed");
            bst.print();
        } else {
            System.out.println("Student Id 444 not found");
        }
        System.out.println();
        removed = bst.remove(139);
        if (removed) {
            System.out.println("Student 139 removed");
            bst.print();
        } else {
            System.out.println("Student Id 139 not found");
        }
        System.out.println();
        removed = bst.remove(749);
        if (removed) {
            System.out.println("Student 749 removed");
            bst.print();
        } else {
            System.out.println("Student Id 749 not found");
        }
        System.out.println();
        removed = bst.remove(363);
        if (removed) {
            System.out.println("Student 363 removed");
            bst.print();
        } else {
            System.out.println("Student Id 363 not found");
        }
        System.out.println();
        removed = bst.remove(606);
        if (removed) {
            System.out.println("Student 606 removed");
            bst.print();
        } else {
            System.out.println("Student Id 606 not found");
        }
        System.out.println();
        removed = bst.remove(284);
        if (removed) {
            System.out.println("Student 284 removed");
            bst.print();
        } else {
            System.out.println("Student Id 284 not found");
        }
        System.out.println();
        removed = bst.remove(992);
        if (removed) {
            System.out.println("Student 992 removed");
            bst.print();
        } else {
            System.out.println("Student Id 992 not found");
        }
        System.out.println();
        removed = bst.remove(802);
        if (removed) {
            System.out.println("Student 802 removed");
            bst.print();
        } else {
            System.out.println("Student Id 802 not found");
        }
        System.out.println();
        removed = bst.remove(16);
        if (removed) {
            System.out.println("Student 16 removed");
            bst.print();
        } else {
            System.out.println("Student Id 16 not found");
        }
        System.out.println();
        removed = bst.remove(821);
        if (removed) {
            System.out.println("Student 821 removed");
            bst.print();
        } else {
            System.out.println("Student Id 821 not found");
        }
        System.out.println();
        removed = bst.remove(6);
        if (removed) {
            System.out.println("Student 6 removed");
            bst.print();
        } else {
            System.out.println("Student Id 6 not found");
        }
        System.out.println();
        removed = bst.remove(888);
        if (removed) {
            System.out.println("Student 888 removed");
            bst.print();
        } else {
            System.out.println("Student Id 888 not found");
        }
        System.out.println();

        /*
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
        */
    }
}
