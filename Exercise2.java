//Author: Derin
//Printing the sum of two user-input integers

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int num1 = input.next();
        System.out.print("Enter another value: ");
        int num2 = input.next();
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);

    }
}