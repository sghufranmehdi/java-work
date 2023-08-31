class MyNewThr1 extends Thread{

    public void run()
    {
        int i = 34;


        while (i<100)
        {
            //
            // System.out.println("I am Thread");
            System.out.println("ThankYou 1");

            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run()
    {
        int i = 34;


        while (i<100)
        {
            //
            // System.out.println("I am Thread");
            System.out.println("ThankYou 2");
            i++;
        }
    }
}
public class L75_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {t1.join();//until t1 ends

        }catch (Exception e)
        {
            System.out.println(e);
        }

        t2.start();

    }
}
