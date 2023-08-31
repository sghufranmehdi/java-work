import java.util.Random;
import java.util.Scanner;
public class L20_RockPaperScisorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerCount=0,playerCount=0, drawCount=0;
        for (int i=1; i<=5;i++)
        {
            System.out.println("Game"+i);
            System.out.println("Enter you choice");
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissor");
            int entered = 0;
            int number = 0;
            number = sc.nextInt();
            while (number!=1||number!=2||number!=3)
            {
                if(number==1||number==2||number==3) {
                    //System.out.println("Choice is:"+number);
                    entered = number;
                    break;
                }
                if(number!=1 ||number!=2||number!=3)
                {
                    System.out.println("Wrong input! Please Enter again");
                    number = sc.nextInt();

                }
            }

            String choice = null;
            while (entered != 1 || entered != 2 || entered != 3) {

                if (entered == 1) {
                    choice = "Rock";
                    System.out.println("Your Choice:" + choice);
                    break;
                } else if (entered == 2) {
                    choice = "Paper";
                    System.out.println("Your Choice:" + choice);
                    break;
                } else if (entered == 3) {
                    choice = "Scissor";
                    System.out.println("Your Choice:" + choice);
                    break;
                } else {
                    System.out.println("Entered number is wrong");
                    break;


                }

            }

            Random rn = new Random();
            int ans = rn.nextInt(2) + 1;
            String Cchoice = null;


            while (ans == 1 || ans == 2 || ans == 3) {

                if (ans == 1) {
                    Cchoice = "Rock";
                    System.out.println("Computer's Choice:" + Cchoice);
                    break;
                } else if (ans == 2) {
                    Cchoice = "Paper";
                    System.out.println("Computer's Choice:" + Cchoice);
                    break;
                } else if (ans == 3) {
                    Cchoice = "Scissor";
                    System.out.println("Computer's Choice:" + Cchoice);
                    break;
                } else {
                    System.out.println("Entered number is wrong");


                }

            }

            System.out.println("Results");
            if (choice == "Rock" && Cchoice == "Rock") {
                System.out.println("Draw");
                drawCount=drawCount+1;
                System.out.println("----------------------");
            }
            if (choice == "Rock" && Cchoice == "Paper") {
                System.out.println("Computer wins");
                computerCount=computerCount+1;
                System.out.println("----------------------");
            }
            if (choice == "Rock" && Cchoice == "Scissor") {
                System.out.println("you Wins");
                playerCount=playerCount+1;
                System.out.println("----------------------");
            }


            if (choice == "Paper" && Cchoice == "Rock") {
                System.out.println("Computer Wins");
                computerCount=computerCount+1;
                System.out.println("----------------------");

            }
            if (choice == "Paper" && Cchoice == "Paper") {
                System.out.println("Draw");
                drawCount=drawCount+1;
                System.out.println("----------------------");
            }
            if (choice == "Paper" && Cchoice == "Scissor") {
                System.out.println("you Wins");
                playerCount=playerCount+1;
                System.out.println("----------------------");
            }

            if (choice == "Scissor" && Cchoice == "Rock") {
                System.out.println("Computer Wins");
                computerCount=computerCount+1;
                System.out.println("----------------------");

            }
            if (choice == "Scissor" && Cchoice == "Paper") {
                System.out.println("you Wins");
                playerCount=playerCount+1;
                System.out.println("----------------------");
            }
            if (choice == "Scissor" && Cchoice == "Scissor") {
                System.out.println("Draw");
                drawCount=drawCount+1;
                System.out.println("----------------------");
            }


        }
        System.out.println("Final Results");
        System.out.println("player wins:"+playerCount);
        System.out.println("Computer wins:"+computerCount);
        System.out.println("Draws:"+drawCount);
        if (playerCount>computerCount && playerCount>drawCount)
        {
            System.out.println("player wins");
        }
        if (computerCount>playerCount && computerCount>drawCount)
        {
            System.out.println("Computer wins");
        }
        if (playerCount==computerCount||drawCount==5|| drawCount>playerCount && drawCount>computerCount)
        {
            System.out.println("Games draw");
        }





    }
}
