public class L31_Methods {
    //DRY(Dont Repeat yourself)
    static int logic (int x, int y)// access modifier default here
    // static to be called by only static
    //if not static you have to make an obj and call that method
    {
        int z;
        if(x>y)
        {
            z= (x+y)*5;
        }
        else
        {
            z=x+y;
        }
        x = 566;
        return z;
    }
    int logic1 (int x, int y)// not static method so you have to create obj

    {
        int z;
        if(x>y)
        {
            z= (x+y)*5;
        }
        else
        {
            z=x+y;
        }
        return z;
    }

    static void tellJoke()
    {
        System.out.println("A Joke");
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c,c1;
        //static call
        //shared function for all
        c= logic(a,b);
        System.out.println(c);

        L31_Methods obj = new L31_Methods();
        c1= obj.logic1(a,b);
        System.out.println(c1);
        //int call every obj has own function named logic
        // calling by creating an obj of class


        tellJoke();




    }
}
