//You have a class Student(rollNum,name,grade). Use Scanner class to read the data of each student and store the data in a map where key is rollNum and value is student
import java.util.*;

class Student {
    private int rollNum;
    private String name;
    private String grade;

    public Student(int rollNum, String name, String grade) {
        this.rollNum = rollNum;
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    // toString method to print Student details
    public String toString() {
        return "Roll Number: " + rollNum + ", Name: " + name + ", Grade: " + grade;
    }
}

public class CollectionTask13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Student> studentMap = new HashMap<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNum = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            Student student = new Student(rollNum, name, grade);
            studentMap.put(rollNum, student);
        }

        // Displaying the student details stored in the map
        System.out.println("\nStudent details stored in the map:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Student: " + entry.getValue());
        }

        scanner.close(); // Close the scanner
    }
}
