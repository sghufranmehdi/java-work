class c1{
    public int x = 5;
    protected int y = 7;
    int z = 9;
    private int p = 77;

    public void meth1()
    {
        // in same class all x,y,z,p are accessable
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
    }

}
class c2{

}
public class L66_AccessModifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();// in same class all
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.p); //as it is private

    }
}
