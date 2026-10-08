import java.util.Scanner;
class Student {
    private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;
    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    public double calculateFee() {
        return courseCredits * 1500.0;
    }
    public boolean checkEligibility() {
        return marks >= 50;
    }
    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85) {
            return fee * 0.20;
        } else if (marks >= 70) {
            return fee * 0.10; 
        } else {
            return 0.0; 
        }
    }
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }
    public void displayDetails() {
        System.out.println("\n--- Student & Course Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Course Fee: Rs. " + calculateFee());
        System.out.println("Scholarship Amount: Rs. " + calculateScholarship());
        System.out.println("Final Fee to Pay: Rs. " + calculateFinalFee());
    }
}
      public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();
        Student student = new Student(name, rollNumber, marks, courseName, credits);
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration (Marks are below 50).");
        }
        scanner.close();
    }
}
