


import java.util.Scanner;

public class Main {


    public static void guessingNumberGame() {

        Scanner input = new Scanner(System.in);

       
        int number = 1 + (int) (100 * Math.random());

        int X = 5;

        int i, guess;

        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

        for (i = 0; i < X; i++) {

            System.out.println("Guess the number:");

     
            guess = input.nextInt();
            
            if (number == guess) {
                System.out.println("Congratulations!"+ " You guessed the number.");
                System.out.println("You Won the Game");
                break;
            } else if (number > guess&& i != X - 1) {
                System.out.println("The number is "+ "greater than " + guess);
            } else if (number < guess&& i != X - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == X) {
            System.out.println("You have exhausted"+ " " + X + " trials.");
            System.out.println("The number was " + number);
        }
        System.out.println("Ohhhh You Lost the game \n Try Again");
    }

    public static void main(String arg[]) {

        guessingNumberGame();
    }
}
