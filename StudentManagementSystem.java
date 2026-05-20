import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    String grade;

    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    students.add(new Student(name, rollNo, grade));

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {
                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.rollNo == searchRoll) {
                            s.displayStudent();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll No to Remove: ");
                    int removeRoll = sc.nextInt();

                    students.removeIf(s -> s.rollNo == removeRoll);

                    System.out.println("Student Removed Successfully!");
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}
