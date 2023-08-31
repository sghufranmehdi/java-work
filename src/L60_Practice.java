abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("write");

    }

    @Override
    void refill() {
        System.out.println("refill");

    }
    void changeNib()
    {
        System.out.println("changing Nib");

    }
}

class Monkey{
    void jump()
    {
        System.out.println("Monkey Jumping");

    }
    void bite()
    {

        System.out.println("Monkey Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    void jump()
    {
        System.out.println("Human Jumping");
    }
    void bite()
    {
        System.out.println("Human Biting");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human Sleeping");

    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends TelePhone{

    @Override
    void ring() {
        System.out.println("Ringing");
    }

    @Override
    void lift() {
        System.out.println("Phone lifted");

    }

    @Override
    void disconnect() {
        System.out.println("Phone Disconnected");

    }
    void camera()
    {
        System.out.println("Opening camera");
    }
}

interface TvRemote{
    void incVol();
    void decVolume();
    void upChanel();
    void downChanel();


}
interface SmartTvRemote extends TvRemote{
    void netflix();

    default void showNetworkSpeed() {
        System.out.println("Default speed is 10 Mbps");
    }

}

class TV implements SmartTvRemote{

    @Override
    public void incVol() {
        System.out.println("Vol++");
    }

    @Override
    public void decVolume() {
        System.out.println("Vol--");

    }

    @Override
    public void upChanel() {
        System.out.println("Ch++");

    }

    @Override
    public void downChanel() {
        System.out.println("Ch--");

    }

    @Override
    public void netflix() {
        System.out.println("Opening Netflix");


    }

//    @Override
//    public void showNetworkSpeed() {
//        System.out.println("Showing Network Speed");
//
//    }
}

public class L60_Practice {
    public static void main(String[] args) {
        //Q1+Q2
//        FountainPen f = new FountainPen();
//        f.changeNib();
//        f.write();
//        f.refill();



        //Q3
//        Monkey m = new Monkey();
//        m.bite();
//        m.jump();
//        Human h = new Human();
//        h.bite();
//        h.eat();
//        h.jump();
//        h.sleep();

        //Q5
//        Monkey m1 = new Human(); // applying polymarphism
//        m1.jump();
//        m1.bite();
//        BasicAnimal a = new Human();
//        a.eat();
//        a.sleep();

        //Q4
//        TelePhone t = new SmartTelePhone();
//        t.ring();
//        t.lift();
//        t.disconnect();
//
//        SmartTelePhone t1 = new SmartTelePhone();
//        t1.camera();
//        t1.ring();
//        t1.lift();
//        t1.disconnect();

        TV t = new TV();
        t.showNetworkSpeed();
        t.netflix();
        t.decVolume();t.incVol();
        t.downChanel();t.upChanel();


    }
}
