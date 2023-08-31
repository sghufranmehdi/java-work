
class MyThr extends Thread{
    public MyThr(String name) {
        super(name);
    }
    public void run()
    {
        int i = 34;
        System.out.println("Value of i is "+i);

//        while (true)
//        {
//            System.out.println("I am Thread");
//        }
    }
}
public class L73_Constructor_Threads {
    public static void main(String[] args) {
        MyThr t = new MyThr("Ghufran");
        t.start();
        System.out.println("The id of Thread t is "+t.getId());
        System.out.println("The name of Thread t is "+t.getName());

        MyThr t2 = new MyThr("Mehdi");
        t2.start();
        System.out.println("The id of Thread t is "+t2.getId());
        System.out.println("The name of Thread t is "+t2.getName());
    }
}
