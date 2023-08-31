class prac1 extends Thread{
    @Override
    public void run()
    {
            while(true)
            {
                System.out.println("GoodMorning");
            }
        }
    }
class prac2 extends Thread{
    @Override
    public void run()
    {
//        while(true)
//        {
//
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}
public class L76_Practice {
    public static void main(String[] args) {
        prac1 p1 = new prac1();
        prac2 p2 = new prac2();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
//
//        p1.start();
//        p2.start();




    }
}
