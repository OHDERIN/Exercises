//Author: Derin
//Date: 08062022
//Printing the sum of two user-input integers

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter value: ");
        int num1 = input.nextInt();
        System.out.print("Enter another value: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);
    }
}