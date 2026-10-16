import java.util.Scanner;

class Course {
    String code;
    String name;
    String day;
    String time;

    Course(String code, String name, String day, String time) {
        this.code = code;
        this.name = name;
        this.day = day;
        this.time = time;
    }

    void display() {
        System.out.println(code + "\t" + name + "\t\t" + day + "\t" + time);
    }
}

public class CourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Course " + (i + 1));

            System.out.print("Enter course code: ");
            String code = sc.nextLine();

            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            System.out.print("Enter day: ");
            String day = sc.nextLine();

            System.out.print("Enter time: ");
            String time = sc.nextLine();

            courses[i] = new Course(code, name, day, time);
        }

        System.out.println("\n======================================");
        System.out.println("       COURSE REGISTRATION");
        System.out.println("======================================");
        System.out.println("Student Name: " + studentName);

        System.out.println("\nCode\tCourse Name\t\tDay\tTime");
        System.out.println("--------------------------------------");

        for (int i = 0; i < n; i++) {
            courses[i].display();
        }

        System.out.println("\nTimetable created successfully!");

        sc.close();
    }
}