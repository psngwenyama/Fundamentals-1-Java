import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        System.out.println("");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Hello " + name + " " + surname);
    }
}