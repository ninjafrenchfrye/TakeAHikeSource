package game;

import java.util.Scanner;
public class Board //Class without main method
{
    public static int gameWin=1; //Integer Variable
    public static double jahCoin=75;
    public static int space; //self commenting identifier
    static int rollDice;
    public static String sherpa; //String
    static Scanner myScanner = new Scanner (System.in); //Scanner
    public static int year = 1;

    public static int diceRoll()
    {
        rollDice=(int)(Math.random()*6+1); //Random number generator & math class method
        return rollDice;
    }

    public static int cardPick()
    {
        int cardNumber = (int)(Math.random()*21+1);
        return cardNumber;
    }

    public static void cardPrompt() //void method that prints statement
    {
        System.out.println("Press enter to pick a card.");
    }

    public static void getMoney()
    {
        System.out.println(jahCoin);
    }

    public static void displayMoney()
    {
        System.out.println("Your current JahCoin:");
    }

    public static int sherpa1()
    {
        if (jahCoin >= 100)
        {
            space += 4; //Math operator
            getSpace();
            jahCoin -= 100;
            return space;
        }

        else
        {
            System.out.println("You do not have enough JahCoin.");
            return space;
        }

    }

    public static int sherpa2()
    {
        if (jahCoin >= 100)
        {
            space += 5;
            getSpace();
            jahCoin -= 100;
            return space;
        }

        else
        {
            System.out.println("You do not have enough JahCoin.");
            return space;
        }
    }

    public static int sherpa3()
    {
        if (jahCoin >= 100)
        {
            space += 10;
            getSpace();
            jahCoin -= 100;
            return space; //Method with return statement
        }

        else
        {
            System.out.println("You do not have enough JahCoin.");
            return space;
        }
    }

    public static int sherpa4()
    {
        if (jahCoin >= 100)
        {
            space += 8;
            getSpace();
            jahCoin -= 100;
            return space;
        }

        else
        {
            System.out.println("You do not have enough JahCoin.");
            return space;
        }
    }

    public static int sherpa5()
    {
        if (jahCoin >= 50)
        {
            System.out.println("The shifty sherpa flashes you a smile as you approach. You gladly hand over your coins.\nUh oh! The shifty sherpa has betrayed you! He took all of your Jah Coin, and you have been sent to a Take a Hike Space!");
            System.out.println("Take a Hike!");
            space -=16;
            getSpace();
            jahCoin = 0;
            return space;
        }

        else
        {
            System.out.println("You do not have enough JahCoin.");
            return space;
        }
    }

    public static void getSpace()
    {
        System.out.println("You are at space "+space+" out of 100."); //Concatenation
    }

    public static void getRolledSpace()
    {
        System.out.println("You have rolled a "+diceRoll()+". Advance "+rollDice+" space(s)!\nYou are now at space "+(rollDice + space)+" out of 100.");
        space = space + rollDice;
    }

    public static void sherpaCheck()
    {
        if (space == 4)
        {
            sherpaPrompt(); //Method call inside of a method
            sherpa = myScanner.nextLine();
            if (sherpa.equalsIgnoreCase("yes"))
            {
                sherpa1();
            }
        }
        if (space == 20)
        {
            sherpaPrompt();
            sherpa = myScanner.nextLine();
            if (sherpa.equalsIgnoreCase("yes"))
            {
                sherpa2();
            }
        }
        if (space == 49)
        {
            sherpaPrompt();
            sherpa = myScanner.nextLine();
            if (sherpa.equalsIgnoreCase("yes"))
            {
                sherpa3();
            }
        }
        if (space == 72)
        {
            sherpaPrompt();
            sherpa = myScanner.nextLine();
            if (sherpa.equalsIgnoreCase("yes"))
            {
                sherpa4();
            }
        }
        if (space == 28)
        {
            System.out.println("You see a very suspicious sherpa standing in the shadows under a large snow drift. A shifty sherpa, one could say. He beckons you over, promising to move you up a few spaces for 50 Jah Coins. Would you like to accept his offer?");
            sherpa = myScanner.nextLine();
            if (sherpa.equalsIgnoreCase("yes"))
            {
                sherpa5();
            }
        }
    }

    public static void sherpaPrompt()
    {
        System.out.println("You have reached a sherpa station. Would you like to pay 100 JahCoin for him to take you further up the mountain?");
    }

    public static void getYear()
    {
        System.out.println("Year " + year);
    }

    public static void dicePrompt()
    {
        System.out.println("Press enter to roll the die.");
        myScanner.nextLine();
    }

    public static void cliffCheck()
    {
        if (space == 16) //If statement
        {
            System.out.println("Oh no! The ground underneath you has given way and you're falling down a cliff! You reach for a rock to save yourself...");
            System.out.println("Roll the die to save your life!");
            dicePrompt();
            diceRoll();
            if (rollDice == 1 || rollDice == 6) //Nested if statement, compound condition
            {
                System.out.println("You saved yourself!");
            }
            else
            {
                System.out.println("You missed the rock, falling a long way down and landing with 2 broken legs. You stay here for a year, healing your wounds.");
                space -= 13;
                year++;
            }
        }
        if (space == 39)
        {
            System.out.println("Oh no! The ground underneath you has given way and you're falling down a cliff! You reach for a rock to save yourself...");
            System.out.println("Roll the die to save your life!");
            dicePrompt();
            diceRoll();
            if (rollDice == 1 || rollDice == 6)
            {
                System.out.println("You saved yourself!");
            }
            else
            {
                System.out.println("You missed the rock, falling a long way down and landing with 2 broken legs. You stay here for a year, healing your wounds.");
                space -= 11;
                year++;
            }
        }
        if (space == 84)
        {
            System.out.println("Oh no! The ground underneath you has given way and you're falling down a cliff! You reach for a rock to save yourself...");
            System.out.println("Roll the die to save your life!");
            dicePrompt();
            diceRoll();
            if (rollDice == 1 || rollDice == 6)
            {
                System.out.println("You saved yourself!");
            }
            else
            {
                System.out.println("You missed the rock, falling a long way down and landing with 2 broken legs. You stay here for a year, healing your wounds.");
                space -= 15;
                year++;
            }
        }
    }

    public static void greeting()
    {
        System.out.println("Welcome to Take A Hike!");
        System.out.println("");
    }

    /* This sections moves the
     * circle that represents the player's
     * icon on the board
     */

    public static void playerMover()
    {

        if (Board.space == 100)
        {
            BoardGraphics.p = 180;
            BoardGraphics.q = 108;
        }
        if (Board.space == 99)
        {
            BoardGraphics.p = 210;
            BoardGraphics.q = 108;
        }
        if (Board.space == 98)
        {
            BoardGraphics.p = 195;
            BoardGraphics.q = 140;
        }
        if (Board.space == 97)
        {
            BoardGraphics.p = 165;
            BoardGraphics.q = 155;
        }
        if (Board.space == 96)
        {
            BoardGraphics.p = 135;
            BoardGraphics.q = 170;
        }
        if (Board.space == 95)
        {
            BoardGraphics.p = 125;
            BoardGraphics.q = 195;
        }
        if (Board.space == 94)
        {
            BoardGraphics.p = 140;
            BoardGraphics.q = 220;
        }
        if (Board.space == 93)
        {
            BoardGraphics.p = 170;
            BoardGraphics.q = 215;
        }
        if (Board.space == 92)
        {
            BoardGraphics.p = 195;
            BoardGraphics.q = 205;
        }
        if (Board.space == 91)
        {
            BoardGraphics.p = 220;
            BoardGraphics.q = 195;
        }
        if (Board.space == 90)
        {
            BoardGraphics.p = 245;
            BoardGraphics.q = 185;
        }
        if (Board.space == 89)
        {
            BoardGraphics.p = 275;
            BoardGraphics.q = 165;
        }
        if (Board.space == 88)
        {
            BoardGraphics.p = 305;
            BoardGraphics.q = 155;
        }
        if (Board.space == 87)
        {
            BoardGraphics.p = 335;
            BoardGraphics.q = 145;
        }
        if (Board.space == 86)
        {
            BoardGraphics.p = 365;
            BoardGraphics.q = 160;
        }
        if (Board.space == 85)
        {
            BoardGraphics.p = 395;
            BoardGraphics.q = 170;
        }
        if (Board.space == 84)
        {
            BoardGraphics.p = 425;
            BoardGraphics.q = 195;
        }
        if (Board.space == 83)
        {
            BoardGraphics.p = 455;
            BoardGraphics.q = 170;
        }
        if (Board.space == 82)
        {
            BoardGraphics.p = 485;
            BoardGraphics.q = 185;
        }
        if (Board.space == 81)
        {
            BoardGraphics.p = 515;
            BoardGraphics.q = 195;
        }
        if (Board.space == 80)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 205;
        }
        if (Board.space == 79)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 230;
        }
        if (Board.space == 78)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 255;
        }
        if (Board.space == 77)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 280;
        }
        if (Board.space == 76)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 305;
        }
        if (Board.space == 75)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 330;
        }
        if (Board.space == 74)
        {
            BoardGraphics.p = 545;
            BoardGraphics.q = 355;
        }
        if (Board.space == 73)
        {
            BoardGraphics.p = 515;
            BoardGraphics.q = 355;
        }
        if (Board.space == 72)
        {
            BoardGraphics.p = 490;
            BoardGraphics.q = 335;
        }
        if (Board.space == 71)
        {
            BoardGraphics.p = 465;
            BoardGraphics.q = 315;
        }
        if (Board.space == 70)
        {
            BoardGraphics.p = 440;
            BoardGraphics.q = 315;
        }
        if (Board.space == 69)
        {
            BoardGraphics.p = 415;
            BoardGraphics.q = 295;
        }
        if (Board.space == 68)
        {
            BoardGraphics.p = 385;
            BoardGraphics.q = 295;
        }
        if (Board.space == 67)
        {
            BoardGraphics.p = 355;
            BoardGraphics.q = 295;
        }
        if (Board.space == 66)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 310;
        }
        if (Board.space == 65)
        {
            BoardGraphics.p = 295;
            BoardGraphics.q = 330;
        }
        if (Board.space == 64)
        {
            BoardGraphics.p = 265;
            BoardGraphics.q = 330;
        }
        if (Board.space == 63)
        {
            BoardGraphics.p = 235;
            BoardGraphics.q = 330;
        }
        if (Board.space == 62)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 345;
        }
        if (Board.space == 61)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 370;
        }
        if (Board.space == 60)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 395;
        }
        if (Board.space == 59)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 420;
        }
        if (Board.space == 58)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 445;
        }
        if (Board.space == 57)
        {
            BoardGraphics.p = 205;
            BoardGraphics.q = 470;
        }
        if (Board.space == 56)
        {
            BoardGraphics.p = 235;
            BoardGraphics.q = 480;
        }
        if (Board.space == 55)
        {
            BoardGraphics.p = 265;
            BoardGraphics.q = 495;
        }
        if (Board.space == 54)
        {
            BoardGraphics.p = 295;
            BoardGraphics.q = 510;
        }
        if (Board.space == 53)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 495;
        }
        if (Board.space == 52)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 470;
        }
        if (Board.space == 51)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 445;
        }
        if (space == 50)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 420;
        }
        if (space == 49)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 395;
        }
        if (space == 48)
        {
            BoardGraphics.p = 350;
            BoardGraphics.q = 375;
        }
        if (space == 47)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 355;
        }
        if (space == 46)
        {
            BoardGraphics.p = 400;
            BoardGraphics.q = 355;
        }
        if (space == 45)
        {
            BoardGraphics.p = 425;
            BoardGraphics.q = 355;
        }
        if (space == 44)
        {
            BoardGraphics.p = 450;
            BoardGraphics.q = 355;
        }
        if (space == 43)
        {
            BoardGraphics.p = 475;
            BoardGraphics.q = 375;
        }
        if (space == 42)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 395;
        }
        if (space == 41)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 420;
        }
        if (space == 40)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 445;
        }
        if (space == 39)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 470;
        }
        if (space == 38)
        {
            BoardGraphics.p = 475;
            BoardGraphics.q = 470;
        }
        if (space == 37)
        {
            BoardGraphics.p = 450;
            BoardGraphics.q = 485;
        }
        if (space == 36)
        {
            BoardGraphics.p = 425;
            BoardGraphics.q = 500;
        }
        if (space == 35)
        {
            BoardGraphics.p = 400;
            BoardGraphics.q = 515;
        }
        if (space == 34)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 530;
        }
        if (space == 33)
        {
            BoardGraphics.p = 400;
            BoardGraphics.q = 545;
        }
        if (space == 32)
        {
            BoardGraphics.p = 425;
            BoardGraphics.q = 560;
        }
        if (space == 31)
        {
            BoardGraphics.p = 450;
            BoardGraphics.q = 560;
        }
        if (space == 30)
        {
            BoardGraphics.p = 475;
            BoardGraphics.q = 560;
        }
        if (space == 29)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 545;
        }
        if (space == 28)
        {
            BoardGraphics.p = 525;
            BoardGraphics.q = 530;
        }
        if (space == 27)
        {
            BoardGraphics.p = 550;
            BoardGraphics.q = 515;
        }
        if (space == 26)
        {
            BoardGraphics.p = 575;
            BoardGraphics.q = 505;
        }
        if (space == 25)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 490;
        }
        if (space == 24)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 515;
        }
        if (space == 23)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 540;
        }
        if (space == 22)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 565;
        }
        if (space == 21)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 590;
        }
        if (space == 20)
        {
            BoardGraphics.p = 600;
            BoardGraphics.q = 615;
        }
        if (space == 19)
        {
            BoardGraphics.p = 575;
            BoardGraphics.q = 625;
        }
        if (space == 18)
        {
            BoardGraphics.p = 550;
            BoardGraphics.q = 635;
        }
        if (space == 17)
        {
            BoardGraphics.p = 525;
            BoardGraphics.q = 645;
        }
        if (space == 16)
        {
            BoardGraphics.p = 500;
            BoardGraphics.q = 655;
        }
        if (space == 15)
        {
            BoardGraphics.p = 475;
            BoardGraphics.q = 645;
        }
        if (space == 14)
        {
            BoardGraphics.p = 450;
            BoardGraphics.q = 635;
        }
        if (space == 13)
        {
            BoardGraphics.p = 425;
            BoardGraphics.q = 625;
        }
        if (space == 12)
        {
            BoardGraphics.p = 400;
            BoardGraphics.q = 625;
        }
        if (space == 11)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 630;
        }
        if (space == 10)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 655;
        }
        if (space == 9)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 680;
        }
        if (space == 8)
        {
            BoardGraphics.p = 375;
            BoardGraphics.q = 705;
        }
        if (space == 7)
        {
            BoardGraphics.p = 350;
            BoardGraphics.q = 715;
        }
        if (space == 6)
        {
            BoardGraphics.p = 325;
            BoardGraphics.q = 725;
        }
        if (Board.space == 5)
        {
            BoardGraphics.p = 300;
            BoardGraphics.q = 735;
        }
        if (Board.space == 4)
        {
            BoardGraphics.p = 275;
            BoardGraphics.q = 745;
        }
        if (Board.space == 3)
        {
            BoardGraphics.p = 250;
            BoardGraphics.q = 755;
        }
        if (Board.space == 2)
        {
            BoardGraphics.p = 225;
            BoardGraphics.q = 765;
        }
        if (Board.space == 1)
        {
            BoardGraphics.p = 200;
            BoardGraphics.q = 775;
        }
        if (Board.space == 0)
        {
            BoardGraphics.p = 175;
            BoardGraphics.q = 785;
        }
    }
    public static void continuePrompt()
    {
        System.out.println("Press Enter to continue");
    }
}



