import java.util.Scanner;

public class L23_ForLoop {
    public static void main(String[] args) {
        /*
        int i,n, odd;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (i=1;i<n;i++)
        {
            if(i%2!=0)
            {
                odd=i;
                System.out.println(odd);
            }

        }


        //------------


        int i;
        int no=5;
        for (i=0;i<no;i++)
        {
            System.out.println("Even "+ 2*i);

        }

         */


        int no=5;
        for (int j=0;j<no;j++)
        {
            System.out.println("Odd "+ (2*j+1));

        }

        //------------------



        //Quiz n natural number in reverse order
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            System.out.println(i);
        }





    }
}
