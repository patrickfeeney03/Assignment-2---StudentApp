package ie.atu;

import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        studentInputTemplate student1 = new studentInputTemplate();
        System.out.println("\n\nPlease enter the name of the first student: ");
        student1.setName(input.nextLine());
        System.out.println("Please enter the email of the first student: ");
        student1.setEmail(input.nextLine());
        System.out.println("Please enter the course of the first student: ");
        student1.setCourse(input.nextLine());

        System.out.println("Please enter the name of the second student: ");
        String name2 = input.nextLine();
        studentInputTemplate student2 = new studentInputTemplate(name2);
        System.out.println("Please enter the email of the second student: ");
        student2.setEmail(input.nextLine());
        System.out.println("Please enter the course of the second student: ");
        student2.setCourse(input.nextLine());

        System.out.println("Please enter the name of the third student: ");
        String name3 = input.nextLine();
        System.out.println("Please enter the email of the third student: ");
        String email3 = input.nextLine();
        System.out.println("Please enter the course of the third student: ");
        String course3 = input.nextLine();
        studentInputTemplate student3 = new studentInputTemplate(name3, email3, course3);


        System.out.println("\nFirst student info\nName: " + student1.getName() + "\nEmail: " +
                student1.getEmail() + "\nCourse: " + student1.getCourse());

        System.out.println("\nSecond student info\nName: " + student2.getName() + "\nEmail: " +
                student2.getEmail() + "\nCourse: " + student2.getCourse());

        System.out.println("\nThird student info\nName: " + student3.getName() + "\nEmail: " +
                student3.getEmail() + "\nCourse: " + student3.getCourse());
    }
}
