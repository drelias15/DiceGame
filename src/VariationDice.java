import java.util.Random;
import java.util.Scanner;

public class VariationDice {

    public static void main(String[] args){
        int score = 0;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Press any key to start. Press Q to quit rolling. Press Y to continue rolling");
        String input = keyboard.next();
        int ran1;
        int ran2;
        int sum = 0;



     do {


            if (!input.equalsIgnoreCase("q")){

            ran1 = 1 + rand.nextInt(6);
            ran2 = 1 + rand.nextInt(6);
            sum = (ran1+ran2)/2;
            score = sum*25;

            System.out.println(" You roll: " + ran1 + " " + ran2+". Your score is " + score);
            System.out.println("press Y to try ");
            input = keyboard.next();

            }else{
                System.out.println("");
                break;
            }

        }  while (score < 100);

        System.out.println("Thank you. Your score is " + score + ". Game ends here");
    }

}
