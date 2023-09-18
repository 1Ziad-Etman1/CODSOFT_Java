import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int Number = rand.nextInt(100) + 1;
        System.out.println("Welcome to the Guess Number Game!\n");

        boolean flag = false;
        int counter = 0;

        while (!flag) {
            System.out.print("Your guess is: ");
            int User_guess = in.nextInt();
            counter++;

            if (User_guess < Number) {
                System.out.println("No, Higher!");
            } else if (User_guess > Number) {
                System.out.println("No, Lower!");
            } else {
                System.out.println("Excellent!");
                System.out.println("Your Score is: " + counter);
                flag = true;
            }
        }
    }
}