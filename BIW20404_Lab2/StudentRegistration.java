package BIW20404_Lab2;

import java.util.Scanner;

public class StudentRegistration 
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter age: ");
        String age = scan.nextLine();
        
        System.out.print("Enter Course: ");
        String course = scan.nextLine();
        
        System.out.print("Enter section: ");
        String section = scan.nextLine();
        
        System.out.println("\nStudent Registration");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
        System.out.println("Section : " + section);

    }
}