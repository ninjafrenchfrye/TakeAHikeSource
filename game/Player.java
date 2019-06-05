package game;

import java.util.Scanner;
import javax.swing.JFrame;

public class Player {


    public static void main(String [] args)
    {
        Board.greeting();
        while (Board.space < 100) //While loop
        {

            if (Board.year <= 0)
            {
                Board.year = 0;
            }
            Board.getYear();
            if (Board.year >= 100)
            {
                Board.gameWin = 2;
                break; //Break statement
            }
            Board.dicePrompt();
            Board.diceRoll();
            Board.getRolledSpace();
            if (Board.space >= 100)
            {
                break;
            }
            if (Board.space == 8)
            {
                System.out.println("Take a hike!");
                Board.space -= 4;
                Board.year++;
                continue; //Continue statement
            }
            if (Board.space == 24)
            {
                System.out.println("Take a hike!");
                Board.space -= 3;
                Board.year++;
                continue;
            }
            if (Board.space == 32)
            {
                System.out.println("Take a hike!");
                Board.space -= 20;
                Board.year++;
                continue;
            }
            if (Board.space == 65)
            {
                System.out.println("Take a hike!");
                Board.space -= 5;
                Board.year++;
                continue;
            }
            if (Board.space == 98)
            {
                System.out.println("Take a hike!");
                Board.space -= 10;
                Board.year++;
                continue;
            }
            Board.cliffCheck();
            JFrame frame= new JFrame("Take A Hike!");
            frame.getContentPane().add(new BoardGraphics());
            frame.setSize(650, 850);
            frame.setVisible(true);
            Board.playerMover();
            Scanner myScanner = new Scanner (System.in);
            Board.continuePrompt();
            myScanner.nextLine();
            frame.dispose();
            Board.cardPrompt();
            myScanner.nextLine();
            Card.card(Board.cardPick());
            Board.displayMoney();
            Board.getMoney();
            Board.sherpaCheck();
            Board.year ++;

        }

        if (Board.gameWin == 1)
        {
            System.out.println("Congratulations! You Win! It took you " + Board.year + " years to reach the top!");
        }

        else if (Board.gameWin == 2) //Else if
        {
            System.out.println("Uh oh! You appear to have keeled over and kicked the bucket. You just fell over and died like the old geezer you are. You lose.");
        }

    }

}



