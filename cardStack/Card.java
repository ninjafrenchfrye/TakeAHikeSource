package cardStack;

import java.util.Scanner;

import game.Board;

public class Card
{
    private static int choice; //Private modifier
    static Scanner myScanner = new Scanner(System.in);
    public static void card(int cardPick)
    {
        if (cardPick == 1)
        {
            System.out.println("There was a violent Sherpa uprising in the town. They've broken your legs and you're unable to continue for 1 year.");
            Board.year++;
        }

        if (cardPick == 2)
        {
            System.out.println("A wild troop of yetis has run upon you. Luckily, they are friendly and give a peace offering of 10 JahCoin.");
            Board.jahCoin += 10;
        }

        if (cardPick == 3)
        {
            System.out.println("The CIA has recently sponsored a Sherpa uprising in the area to over throw the communist government of Nepal. You were non-lethally crucified for a year.");
            Board.year++;
        }
        if (cardPick == 4)
        {
            System.out.println("The Dalai Lama has recently fled his previous safehouse and has come to the mountain seeking refuge. He is, however, being chased by the Chinese government.\nPress 1 to help the Dalai Lama\nPress 2 to turn him over to the Chinese.");
            choice = myScanner.nextInt();
            if (choice == 1)
            {
                System.out.println("How generous of you! 'May blessing rain upon you, my child' the Dalai Lama says as he takes shelter in a cave. He uses his powers to turn back the clock 3 years.");
                Board.year -= 3;
            }
            else if (choice == 2)
            {
                System.out.println("You must have a heart of steel. You turn the Dalai Lama over to the Chinese government. Instead of rewarding you, the Chinese throw you in an intense labor camp for 20 years on suspicions of being a capitalist.");
                Board.year += 20;
            }
            else
            {
                System.out.println("Uh oh! You didn't pick one of the options! You took too long to decide. The Dalai Lama can't risk getting caught, so he calls Buddhist assassins to prevent you from talking. You are hospitalized for 5 years and you pay 50 JahCoin.");
                Board.year += 5;
                Board.jahCoin -= 50;
            }
        }
        if (cardPick == 5)
        {
            System.out.println("There has been a terrible avalanche! You are snowed in your shelter for a year as you wait for the snow to clear.");
            Board.year++;
        }
        if (cardPick == 6)
        {
            System.out.println("The Sherpas have had a bountiful harvest this year. They give you 20 JahCoin, a prize yak, and a bushel of buckwheat.");
            Board.jahCoin += 20;
        }
        if (cardPick == 7)
        {
            System.out.println("The CIA has given you funds to help create a sherpa rebellion in the area. It's a sizeable sum of money that you wouldn't mind keeping for yourself.\n Press 1 to use the money for the Sherpa uprising\n Press 2 to keep the money"); //Escape sequence
            choice = myScanner.nextInt();
            if (choice == 1)
            {
                System.out.println("Uh oh! The Sherpas got a little rowdy during their uprising, and you got caught in the crossfire. You are hospitalized, recovering from your injuries, for 2 years.");
                Board.year += 2;
            }
            else if (choice == 2)
            {
                System.out.println("The CIA didn't appreciate you stealing from them, so they sent an extraction team to bring you back to the United States, where you are sent to Guantanamo Bay for 5 years. They eventually drop you off back at the mountain where they picked you up.");
                Board.year += 5;
            }
            else
            {
                System.out.println("Uh oh! You didn't pick one of the options! The Sherpas got impatient and they beat you up and took the money to invest in some new yaks. The CIA came to look for their money, and upon finding out that you didn't have it, they beat you up too. You spend 10 years recovering from your injuries.");
                Board.year += 10;
            }
        }
        if (cardPick == 8)
        {
            System.out.println("Coach Roe acends from the grave of the late Steve Prefontaine. Coach Potter is no where in sight to save you. You spend the next 4 years doing mile repeats, hill strides, and Daniel's Drills.");
            Board.year +=4;
        }
        if (cardPick == 9)
        {
            System.out.println("With a chorus of angels and the fanfare from the heavens, the angelic face of the jolly Coach Potter appears in the sky. 'Take a' *pause* 'hike! Hahahahahahah' he says. His jolly laughin makes you feel younger, as the clock turns back 10 years.");
            Board.year -= 10;
        }
        if (cardPick == 10)
        {
            System.out.println("Mr. Pribaz tells you he will not be collecting the chapter questions, so you do not do them. Come Friday, he tells you to turn in your questions. Pay 10 JahCoins to Mr. Pribaz to get full credit.");
            Board.jahCoin -= 10;
        }
        if (cardPick == 11)
        {
            System.out.println("A minecraft villager has come to trade. After some intense negotiations you trade him some z-bars for 25 JahCoin.");
            Board.jahCoin += 25;
        }
        if (cardPick == 12)
        {
            System.out.println("Sam Walhout has tweeted about you! You are briefly world famous, and someone donated 20 JahCoin to you!");
            Board.jahCoin += 20;
        }
        if (cardPick == 21)
        {
            System.out.println("You have angered the Flight kids! They harrass you on social media and relentlessly tell you how full their heart is. You are hospitalized with a migrane and brain cell lossage for a year.");
            Board.year++;
        }
        if (cardPick == 13)
        {
            System.out.println("Connor Zydek didn't do that well at the past meet, and he tells you all about it on Strava and roasts coach's workout. It took you a year to read the post.");
            Board.year++;
        }
        if (cardPick == 14)
        {
            System.out.println("You have the sudden urge to travel around the National Parks of Western United States. You spend the next year having a fantastic time touring national parks and kayaking.");
            Board.year++;
        }


        if (cardPick == 15)
        {
            System.out.println("Oh no! Your bank account has been raided by a Nigerian Prince. You lose all of your JahCoin. This is so sad.");
            Board.jahCoin = 0;
        }

        if (cardPick == 16)
        {
            System.out.println("A bout of mountain madness strikes you. You've wasted a whole year finding inner peace.");
            Board.year++;
        }

        if (cardPick == 17)
        {
            System.out.println("An old Hindi wise man has told you stories of hidden treasure. You spend years searching, but come up empty.");
            Board.year+=5;
        }

        if (cardPick == 18)
        {
            System.out.println("After some political upheaval, the new dictator of Nepal has given his most loyal supporters gifts of abuntant jahCoin! You recieve immense amounts of jahCoin.");
            Board.jahCoin += 1000000;
            Board.displayMoney();
            Board.getMoney();
            Board.dicePrompt();
            System.out.println("Uh oh! The dictator was taken out of power by Western Pigs, and all your jahCoin are devalued by an unprecidented inflation rate.");
            Board.jahCoin = 0;
        }

        if (cardPick == 19)
        {
            System.out.println("After the passage of some controversial legislation by the interum democratic government occupying Kathmandu, you get caught up in a 5-year civil war.");
            Board.year+=5;
        }

        if (cardPick == 20)
        {
            System.out.println("You've come down with the Wheaton North Plague. Not too big of a deal, but it is definitely minorly uncomfortable. Your prolonged achiness and congestion slows you "
                    + "wn.");
            Board.year ++;
        }
    }
}



