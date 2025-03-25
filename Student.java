public class Student {
    String name;
    String year;
    int studentId;
    Student(String n, String y, int s) {
        name = n;
        year = y;
        studentId = s;
    }

    public void print(Student student) {
        System.out.println("Id: " + student.studentId + " Name: " +
        student.name + " Class: " + student.year);
    }
}
    
