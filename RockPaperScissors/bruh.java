import java.util.Scanner;
public class bruh
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        while(true)
        {
            System.out.print("Rock-Paper-Scissors - Pick your weapon [R, P, S]: ");
            String playerChoice = kb.next();
            int number = 0;

            String choices = "RPS";
            
            number = choices.indexOf(playerChoice) + 1;

            // if(playerChoice.equals("R"))
            //     number = 1;
            // else if(playerChoice.equals("P"))
            //     number = 2;
            // else if(playerChoice.equals("S"))
            //     number = 3;

            if(!(playerChoice.equals("R")||playerChoice.equals("P")||playerChoice.equals("S")))
            {
                System.out.println("please do not break my program.");
                continue;
            }

            //RockPaperScissors newGame  = new RockPaperScissors(playerChoice);
            Roshambest newGame  = new Roshambest(number, playerChoice);
            System.out.println(newGame);
            System.out.println(newGame.determineWinner2());
            System.out.println("");
            System.out.print("Do you want to play again? ");

            if(kb.next().equals("n"))
                break;
            System.out.println("");
        }

    }
}