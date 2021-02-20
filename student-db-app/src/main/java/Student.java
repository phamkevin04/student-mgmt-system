import java.util.Scanner;

public class Student
{

    // using encapsulation, we make the variables private
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor: to prompt user to enter student name and year
    public Student() {
        Scanner in = new Scanner(System.in); // bringing in the scanner to get user input

        System.out.print("Enter Student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman \n 2 - Sophmore \n 3 - Junior \n 4 - Senior \nEnter Student's grade year: ");
        this.gradeYear = in.nextInt();

        System.out.println("Student Information");
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }

    // generate a unique ID

    // enroll in courses

    // view balance

    // pay tuition

    // show the status
}
