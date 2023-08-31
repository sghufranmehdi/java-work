class Cylinder{
    private int radius;
    private int height;
    //command +n for setter getters

    public Cylinder() {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }


}
public class L44_Excercise {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4,5);
        c.setHeight(555);
        c.setRadius(78);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());

    }




}
