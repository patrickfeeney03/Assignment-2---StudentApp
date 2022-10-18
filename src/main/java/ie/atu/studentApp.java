package ie.atu;

import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        studentInputTemplate student1 = new studentInputTemplate();
        System.out.println("Please enter the name of the first student: ");

        student1.setName(input.nextLine());
        System.out.println(student1.getName());



        System.out.println("Please enter the email of the first student: ");
        System.out.println("Please enter the course of the first student: ");


    }
}
