//creating threads by implementing runnable intrface
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<4000;i++)
        {
            System.out.println("I am a thread1 not a threat");
        }

    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<4000;i++)
        {
            System.out.println("I am a thread2 not a threat");
        }


    }
}
public class L71_Thread {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
//
//        //cant start directly
//        t1.start();
//        t2.start();

        gun1.start();
        gun2.start();

    }
}
