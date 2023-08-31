class MyThr1 extends Thread{
    public MyThr1(String name) {
        super(name);
    }
    public void run()
    {
        int i = 34;


        while (true)
        {
            //
            // System.out.println("I am Thread");
            System.out.println("ThankYou "+this.getName());
        }
    }
}
public class L74_Thread_Priorities {
    public static void main(String[] args) {
        //ready queue =  T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Syed");
        MyThr1 t2 = new MyThr1("Muhammad");
        MyThr1 t3 = new MyThr1("Ghufran");
        MyThr1 t4 = new MyThr1("Mehdi");
        MyThr1 t5 = new MyThr1("Shah (Most Imp)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
