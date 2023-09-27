package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String hoten = sc.nextLine();
        System.out.print("Enter your middle name: ");
        String tendem = sc.nextLine();
        System.out.print("Enter your last name: ");
        String ten = sc.nextLine();
        System.out.println(String.format("Full name: %s %s %s", hoten,tendem, ten));

    }
}
