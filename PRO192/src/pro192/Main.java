package pro192;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Birth Year: ");
        String birthYear = sc.nextLine();
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        ArrayList<String> subjects = new ArrayList<>();
        System.out.println("Enter Subjects: ");
        String subject = sc.nextLine();
        subjects.add(subject);
        System.out.println("Enter major: ");
        String major = sc.nextLine();
       
        System.out.println("Techer: ");
        Teacher tc = new Teacher(name, email, birthYear, gender, phoneNumber, address, subjects);
        tc.display();
        System.out.println("Enter Email to search: ");
        String emailSearch = sc.nextLine();
        tc.search(emailSearch);
        tc.search(new ArrayList<>(Arrays.asList("SE")));
        
        System.out.println("Student: ");
        Student s =new Student(name, email, birthYear, gender, phoneNumber, address,major);
        s.display();
        
        }
    }
    
