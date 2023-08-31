class Base1{
    int x;
    Base1()
    {
        System.out.println("Unparameterized X Constructor called");
    }

    Base1(int x) {
        System.out.println("Overloaded X Constructor called with "+x);
    }

    public void printMe()
    {
        System.out.println("Function");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived1 extends Base1{
    int y ;

    Derived1() {
        super(0);

        System.out.println("Unparameterized Y Constructor called");
    }
    Derived1(int x,int y) {

        super(x);// to call parameterized constructor of base 1 class
        System.out.println("Overloaded Y Constructor called with "+y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class Derived2 extends Derived1 {
    int z;
    Derived2()
    {
        System.out.println("Unparameterized Z Constructor called");
    }

    public Derived2(int x, int y, int z) {
        super(x, y);
        System.out.println("Overloaded Z Constructor called with "+z);
    }
}
public class L46_ConstructorInstructor {
    public static void main(String[] args) {
        Base1 b = new Base1();
        System.out.println();
        Base1 b1= new Base1(55);
        System.out.println();

        Derived1 d = new Derived1(1,25);
        System.out.println();

        Derived1 d1 = new Derived1();
        System.out.println();

        Derived2 d2 = new Derived2();
        System.out.println();
        Derived2 d3 = new Derived2(1, 66,5);


    }
}
