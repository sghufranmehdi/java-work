
class Ekclass{
    int a;

    Ekclass(int a) {
        this.a = a;// if no this then prog shows a as 0
    }

    public void setA(int a) {
        this.a =a;// if no this then prog shows value of constructor
    }

    public int getA() {
        return a;
    }
}
public class L47_ThisKeyword {
    public static void main(String[] args) {
        Ekclass a = new Ekclass(34);
        a.setA(88);

        System.out.println(a.getA());


    }
}
