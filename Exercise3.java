//Author: Derin
//Date: 08062022
//Printing division of user input values 
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int num1 = input.nextInt();
        System.out.print("Enter divisor: ");
        int num2 = input.nextInt();
        int quot = (num1/num2);
        System.out.println("The division comes out to: "+quot);

    }
    
}
