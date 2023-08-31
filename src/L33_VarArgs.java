public class L33_VarArgs {
//    static int sum(int a, int b)
//    {
//        int c = a+b;
//        return c;
//
//    }

    static int sum(int x,int ...arr)//atleat 1 argument as x
    //parameters available as int arr[]
    {
//        int result = x;
//        for (int a:arr)//for each loop
//        {
//            result +=a;
//        }
//
//        return result;

        int result = x;
        for (int i = 0;i< arr.length;i++)
        {
            result += arr[i];
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial");
        System.out.println("Sum of 2 is as it is "+sum(2));
        System.out.println("Sum of 3,4 is "+sum(3,4));
        System.out.println("Sum of 3,4 and 5 is "+sum(3,4,5));
        System.out.println("Sum of 3,4,5 and 6 is "+sum(3,4,5,6));
    }
}
