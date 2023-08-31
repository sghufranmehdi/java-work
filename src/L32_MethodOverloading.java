public class L32_MethodOverloading {

    static void rev(int [] array) //function to reverse an array
    {

        int mid= array.length/2;
        for (int j = 1;j<= mid;j++)
        {
            int temp = array[mid+j];
            array[mid+j] = array[mid-j];
            array[mid-j]=temp;

        }
        for (int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    static void tellJoke()
            //staticc to associate with class
            //if not static thn assosiate with obj of class
            //void no return
    {
        System.out.println("A Joke");
    }


    static void change (int a)
    {
        a=23;
    }

    static void changeArr (int [] arr)
    {
        arr[0]=23;//change the value because in array prog manipulates with a reference not make a copy like in case of int
    }


    //overloading
    //same name same return type but diff body
    static void foo()
    {
        System.out.println("Running foo with no parameters");
    }

    static void foo(int a)// a and b are parameters
    {
        System.out.println("Running foo with 1 parameter that is "+ a + " bro");

    }
    static void foo(int a,int b)// a and b are parameters
    {
         System.out.println("Running foo with 2 parameter that is "+ a + " and "+ b + " bro");
    }
    //overloading is done through parameters change no through return type change


    public static void main(String[] args) {
        int [] array1 = {1,2,3,45,56};
        rev(array1);
        //tellJoke();

        //changing int

//        int x=45;
//        change(x);//passing copy not change the value of x to a
//        System.out.println("After change "+x);


//        int[]marks={1,2,3,4,5};
//        System.out.println("Before change");
//        for (int i = 0 ; i<marks.length; i++)
//        {
//            System.out.println(marks[i]);
//        }
//        //changing arr
//        changeArr(marks);
//        //changing index
//        System.out.println(marks[0]);
//        System.out.println("After change");
//        for (int i = 0 ; i<marks.length; i++)
//        {
//            System.out.println(marks[i]);
//        }

        //Method Overloading
//        foo();
//        foo(200);
//        foo(3000,2000);
//        //here they are arguments
//        //Arguments are actual and parameters are copies

    }
}
