package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        double AttendanceGrades, MidtermGrades, FinalGrade, CourseScore;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter AttendanceGrades: ");
        AttendanceGrades = sc.nextDouble();
        System.out.println("Enter MidtermGrades: "); 
        MidtermGrades = sc.nextDouble();
        System.out.println("Enter FinalGrade: ");
        FinalGrade = sc.nextDouble();
        CourseScore = AttendanceGrades * 0.3 + MidtermGrades * 0.3 + FinalGrade * 0.4;
        System.out.println("Course score: " + CourseScore); 
    }
    
}
