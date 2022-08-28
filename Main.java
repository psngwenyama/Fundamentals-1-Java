import java.util.Scanner;
import javax.swing.*;

public class Main{
    public static void main(String[] args)
    {
        /*String name;
        name =  "sthembiso";
        int age;
        age = 29;

        System.out.println("Hello world " + name + " your age is " + age);

        int num1, num2;
        num1 = 3;
        num2 = 9;

        int sum = num1 + num2;
        int mutliple = num1 * num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum);
        System.out.println("The mutliplication of " + num1 + " and " + num2 + " is : " + mutliple);

        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.println("");
        System.out.print("Please enter your name: ");
        String username = scanner.nextLine();

        System.out.println("Your name is : " + username);*/

        String firstNumber = JOptionPane.showInputDialog("Enter First integer");

        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "Sum is: " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);


    }
}