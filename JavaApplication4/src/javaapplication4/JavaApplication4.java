package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
        String[] lists = {"Nguyen Thi Phuong Hien", "Huynh Tan Luc", "Pham Minh Tan"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Full name need to check: ");
        String fullnamecheck = sc.nextLine();
        boolean exist = false;
        for (String name : lists) {
            if (name.equalsIgnoreCase(fullnamecheck)) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }   
}
