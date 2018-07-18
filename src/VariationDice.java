import java.util.Random;
import java.util.Scanner;

public class VariationDice {

    public static void main(String[] args) {
        int score = 0;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rolling Dice....\nPress any key to start. Press Q to quit rolling. Press Y to continue rolling");
        String input = keyboard.next();
        int ran1;
        int ran2;
        int sum = 0;


        do {
            ran1 = 1 + rand.nextInt(6);
            ran2 = 1 + rand.nextInt(6);

            if (ran1 != 1 && ran2 != 1) {
                score = (ran1 + ran2) + score;

                System.out.println(" You roll: " + ran1 + " " + ran2 + ". Your score is " + score);
                System.out.println("press Y to try  or Q to end.");

                input = keyboard.next();


            } else if (ran1 == 1 && ran2 != 1) {
                score = ran2 + score;

                System.out.println(" You roll: " + ran1 + " " + ran2 + ". Your score is " + score);
                System.out.println("press Y to try ");

                input = keyboard.next();

            } else if (ran1 != 1 && ran2 == 1) {
                score = ran1 + score;

                System.out.println(" You roll: " + ran1 + " " + ran2 + ". Your score is " + score);
                System.out.println("press Y to try ");

                input = keyboard.next();

            } else {
                score = 25 + score;

                System.out.println(" You roll: " + ran1 + " " + ran2 + ". Your score is " + score);
                System.out.println("press Y to try ");

                input = keyboard.next();

            }


        } while (!input.equalsIgnoreCase("q") && score < 100);


        if (input.equalsIgnoreCase("q")){
            System.out.println("Thank you for playing the game. Your score was " + score +"." );
        }else{
            System.out.println("Congratulations! Your score is " + score + ".");
        }

    }

}
