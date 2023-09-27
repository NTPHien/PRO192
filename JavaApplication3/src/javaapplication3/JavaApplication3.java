package javaapplication3;
import java.util.Scanner;

public class JavaApplication3{
    public static void main(String[] args) {
        double a, b;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a: ");
        a = Integer.parseInt (sc.nextLine());
        System.out.println("Enter b: ");
        b = Integer.parseInt (sc.nextLine());
        double Total = a + b;
        System.out.println(a + " + " + b + " = " + Total);
        double Minus = a - b;
        System.out.println(a + " - " + b + " = " + Minus);
        double Multiply = a * b;
        System.out.println(a + " * " + b + " = " + Multiply);
        double Divide = a / b;
        System.out.println(a + " / " + b + " = " + Divide); 
    } 
}
