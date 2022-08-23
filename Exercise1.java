//Author: Derin
//Date: 08062022
//Simple program that prints a greeting after recieving user's input

import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname);
    }
}