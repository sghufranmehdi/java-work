public class L35_Practice {
    static void table(int n) //table of n number
    {
        for (int i = 1;i<=10;i++)
        {
            //System.out.println( n +" * "+ i + " = " + n*i);
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }


    static void pattern1 (int n)
    {
        for (int i = 0 ; i<n; i++) //i for rows
        {
            for (int j = 0; j<i+1 ; j++) //j for colums
            {
                System.out.print("*");
            }
            System.out.println();


        }

    }

    static int sumRec(int n) //recursive function to calculate sum of first n natural number
    {
        if (n == 1)//base condition to terminate recursion
        {
            return 1;
        }
        return n+sumRec(n-1);
    }

    static void pattern2 (int n)
    {
        for (int i = n ; i>0; i--)
        {
            for (int j = 0; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }

    }

    static int fibo(int n) {
        //recursion approch

//        if (n == 0 || n == 1 ) {
//            return 0;
//        }
//        if (n == 2) {
//            return 1;
//        } or 1 condition instead of 2
        if (n==1 ||n ==2)
        {
            return n-1;
        }

        else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }


    static float avg(int ...arr)
// find avg of set of number passed as argument
    {
        float count  = 0;
        float sum = 0;

//        for (int a:arr)//for each loop
//        {
//            count++;
//            sum+=a;
//        }

        for(int i = 0 ;i < arr.length;i++)
        {
            count++;
            sum+=arr[i];
        }

        float avg=sum/count;
        return avg;

    }


    static void pattern1_rec (int n)
    {

        if (n>0)
        {
            pattern1_rec(n-1);
            for (int i = 0; i<n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2_rec (int n)
    {
        if (n>0)
        {
            for (int i = n; i>0; i--)
            {

                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n-1);

        }
    }



    static double tempCtoF(float cel)
    {
        double fah;
        fah = (cel*9/5)+32;
        return fah;
    }

    static double tempFtoC(float fa)
    {
        double cel;
        cel = (fa-32)/1.8;
        return cel;
    }


    static int sumIter(int n) //iterative function to calculate sum of first n natural number
    {
        int sum = 0;
        for (int i = 0 ; i<=n ; i++)
        {
            sum+=i;
        }
        return sum;
    }




    public static void main(String[] args) {
//        table(5); //prob 1
        pattern1(5); //prob 2

//        int c = sumRec(3); //prob 3
//        System.out.println(c);

//        pattern2(5); //prob 4

//        int result = fibo(2); //prob 5
//        System.out.println(result);

//        System.out.println("avg of 3,4,5 and 6 is "+avg(3,4,5,6)); //prob 6

//        pattern2_rec(5); //prob 7

//        pattern1_rec(5); //prob 8

//        System.out.println(tempFtoC(98.6f)); //prob 9
//        System.out.println(tempCtoF(26));

//        int c = sumIter(3); //prob 10
//        System.out.println(c);





    }
}
