/*
Create a class circle and use inheritance to create another class cylinder from it
Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
Create a method for area and volume in 1
create methods for area & volume in 2 also create getters and setters
 */
class Circle{
    public int radius;
    Circle()
    {
        System.out.println("I am non param of circle");
    }
    Circle(int r)
    {
        System.out.println("I am circle parameterized constructor: "+r);
        this.radius = r;
    }

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h)
    {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor "+h);
        this.height = h;
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}



        //Questions 2 and 4
class rectangle1
{
    private float width,breadth;
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    float area()
    {
        return width*breadth;
    }
}
class cuboid extends rectangle1
{
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    float volume()
    {
        return area()*height;
    }
}
public class L52_Practice {
    public static void main(String[] args)
    {
        // Problem 1
        // Circle objC = new Circle(12);
//        Cylinder1 obj = new Cylinder1(12, 4);

        rectangle1 rec=new rectangle1();

        cuboid objc=new cuboid();
        rec.setWidth(5);
        rec.setBreadth(8);
        objc.setHeight(10);
        objc.setWidth(6);
        objc.setBreadth(3);
        System.out.println("The width of the rectangle is "+rec.getWidth());
        System.out.println("The breadth of the rectangle is "+rec.getBreadth());
        System.out.println("The area of the rectangle is "+rec.area());
        System.out.println("The width of the cuboid is "+objc.getWidth());
        System.out.println("The breadth of the cuboid is "+objc.getBreadth());
        System.out.println("The height of the cuboid is "+objc.getHeight());
        System.out.println("The volume of the cuboid is "+objc.volume());

    }
}
