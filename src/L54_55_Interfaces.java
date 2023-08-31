interface Bicycle{
    int a = 45;//also allowed to dec some variables inside the interface
    void applyBrake(int dec);
    void speedUp(int inc);
}

interface HornBicycle{
    void blow();
    void br();
}
class GhufranBicycle implements Bicycle,HornBicycle{
    int speed = 7;

    @Override
    public void applyBrake(int dec) {
        speed = speed - dec;
        System.out.println("Brakes applied!!! now speed is: "+speed );

    }

    @Override
    public void speedUp(int inc) {
        speed = speed +inc;
        System.out.println("Speed up!! Go Go Go.... now the spee is: "+speed);

    }
    void blowHorn()
    {
        System.out.println("pee peee peeeee");
    }

    @Override
    public void blow() {
        System.out.println("Blow from HornBicycle");
    }

    @Override
    public void br() {

        System.out.println("Br from HornBicycle");
    }
}

public class L54_55_Interfaces {
    public static void main(String[] args) {

        GhufranBicycle b = new GhufranBicycle();
        b.speedUp(3);
        b.blowHorn();
        b.applyBrake(4);

        b.speedUp(3);
        b.blow();
        b.br();

        //you can create properties in interfaces
        System.out.println(b.a);
        //you cant modify the properties in interfaces as they are final
       // b.a = 456;
        System.out.println(b.a);
    }
}
