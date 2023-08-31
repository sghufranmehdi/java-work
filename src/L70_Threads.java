//creating thread extending a thread class
class MyThread1 extends Thread{
    @Override
    public void run()
    {
        int i =0;
        while(i<10)
        {
            System.out.println("My thread1 is for cooking");
            System.out.println("I am happy");
            i++;
        }


    }
}
class MyThread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("My thread2 is chatting with her");
            System.out.println("I am sad");
            i++;
        }


    }
}
public class L70_Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();//some time this runs
        t2.start();//sometimes this ran



    }
}
