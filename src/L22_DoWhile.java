import java.util.Scanner;

public class L22_DoWhile {
    public static void main(String[] args) {
        /*
        int a =10;
        while (a<5) //condition false so didnt enter in the loop
        {//first check condition
            System.out.println(a);
            a++;
        }
       // --------------------
        int b =0;

        do{//without checking condition not checked for 0
            System.out.println(b);
            b++;

        }while (b<5);
        //-----------------------

        b=10;
        do{//without checking condition not checked for 0
            System.out.println(b);
            b++;

        }while (b<5);
        */
        //------------------------
       // Practice Question:  n number print using do while
        System.out.println("Enter n number you want to print on screen");
        Scanner sc = new Scanner(System.in);
        int n,count = 0;
        n = sc.nextInt();
        do {
            System.out.println(count);
            count++;


            }while (count<n);





    }
}
