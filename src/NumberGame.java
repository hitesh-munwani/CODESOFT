import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class NumberGame {
    public static void main(String[] args) {
        NumberGame numberGame=new NumberGame();

        numberGame.guessNumber();
    }

        static public int random ()
        {
            Random ramGenerator = new Random();
            return ramGenerator.nextInt(1, 100);
        }
        public void guessNumber ()
        {
            System.out.println("-----------------------Guess Number Game ------------------------");
            int randomNumber = random();    //storing random number
            Scanner scanner = new Scanner(System.in);
            int score=0;   //intiallization of score is 0
            int attempt=0;

            for (int i = 1; i <= 3; i++) {   //Guess number will be ask three times
                System.out.println("Enter the Guess Number");
                int guessInput = scanner.nextInt();
                if (guessInput == randomNumber) {
                    System.out.println("You Guess the Correct Number After  " + attempt + " attempts");
                    score++; //if guess number correct then score+1
                    attempt++;
                } else if (randomNumber > guessInput ) {
                    System.out.println("Too high : Try again");
                    attempt++;
                } else {
                    System.out.println("Too low  : Try again");
                    attempt++;
                }
            }
            System.out.println("Do you want to Play again? \n1)Type Yes \n2)Type No");
            String again=scanner.next();

            if(again.equalsIgnoreCase("Yes"))
            {
                guessNumber();

            }
            else
            {
                System.out.println("Thank you for Playing");
                System.out.println("Your Score is ==> "+score);
                System.out.println("Random Number is = "+ randomNumber);
            }
        }
    }
