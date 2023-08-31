 abstract class base1{
    base1()
    {
        System.out.println("I am base1 constructor");
    }

    void sayHello()
    {
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();


}

class derived2 extends base1{
    public derived2() {
        System.out.println("I aam derived2 constructor");
    }

    @Override
    public void greet() {
        System.out.println("Good Morning greet1");

    }

    @Override
    public void greet2() {
        System.out.println("Good Morning greet2");
    }
}
abstract class derived3 extends base1{
    public derived3() {
        System.out.println("I aam derived3 constructor");
    }

    public void th()
    {

        System.out.println("I am good in th method");
    }

}
public class L53_Abstract {
    public static void main(String[] args) {

        //base1 b = new base1();// not allowed as class is abstract
        derived2 d = new derived2();
        //derived3 d1 = new derived3();


    }
}
