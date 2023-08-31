class Base{
    int x;
    Base()
    {
        System.out.println("X Constructor called");
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

class Derived extends Base{
    int y ;

    Derived() {
        System.out.println("Y Constructor called");
    }
    Derived(int y) {
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class Animal{
    Animal()
    {
        System.out.println("Animal constructor called");
    }
    void speaks()
    {
        System.out.println("Animal Speaks");
    }

}
class Dog extends Animal{
    Dog()
    {
        System.out.println("Dog constructor called");
    }
    void bark()

    {
        speaks();
        System.out.println("Dog barks");
    }

}
public class L45_Inheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(56);
//        System.out.println(b.getX());
//
//        Derived d = new Derived();
//        d.setX(23);
//        System.out.println(d.getX());
//
//        b.setX(700);
//        System.out.println(b.getX());
//        System.out.println(d.getX());

        Animal a = new Animal();
        a.speaks();
        Dog d = new Dog();
        d.speaks();
        d.bark();



    }
}
