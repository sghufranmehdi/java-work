import java.util.Random;
import java.util.Scanner;
public class L21_WhileLoop {
    public static void main(String[] args) {
        /*
        int i = 0;
        while (i<=3)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("End of while");

        --------------------------

        while (true)
        {
            System.out.println("infinite while loop");

        }
        --------------------------

        while (1)//boolean onlly
        {
            System.out.println("infinite while loop");

        }



        --------------------------------------

        int j,i=0,number;
        Random rn = new Random();
        i= rn.nextInt(2)+1;
        for (j=1;j<=5;j++) {


            while (i != 1 || i != 2 || i != 3) {
                System.out.println(i);
                break;

            }
            break;
        }
        --------------------------------------------------
        

        Scanner sc = new Scanner(System.in);
        int entered = 0;
        int number = 0;
        number = sc.nextInt();
        while (number!=1||number!=2||number!=3)
        {
            if(number==1||number==2||number==3) {
                System.out.println("Choice is:"+number);
                entered = number;
                break;
            }
            if(number!=1 ||number!=2||number!=3)
            {
                System.out.println("Wrong input");
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

         */

        //Quiz prog of sum of 100 to 200
        int sum=0,count =100;
        while(count<=200)
        {
            sum=sum+count;
            System.out.println(sum);
            count++;
        }
        System.out.println("Total Sum "+sum);



    }
}
