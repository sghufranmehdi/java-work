public class L34_Recursion {

    static int factorial(int n) {
        //recursion approch = factorial(n)=n*factorial(n-1)

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        //iterative approch = factorial(n)=n*(n-1)*(n-2)...1


        if (n == 0 || n == 1) {
            return 1;
        }
        else {

            int fact = 1;
            for(int i = 1;i<=n;i++)
            {
                fact=fact*i;
                //System.out.println(fact);
            }

            return fact;
        }
    }

    static void fibo(int n) {
        //iterative approch
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 2;
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        while (count <= n) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            System.out.println(nextTerm);

            count++;
        }
    }

        public static int fibonacciRecursion(int n) {
            //recursion approch
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
        }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
        System.out.println(factorial_iterative(5));


        fibo(9);


//        int maxNumber = 10;
//        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
//        for (int i = 0; i < maxNumber; i++) {
//            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
