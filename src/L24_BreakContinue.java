public class L24_BreakContinue {
    public static void main(String[] args) {
        //break n continue using loops
        for (int i =0; i<10; i++)
        {
            System.out.println(i);
            if(i==2)
            {
                System.out.println("Continue");
                continue;// terminate the current iteration
            }
            if(i==4)
            {
                System.out.println("Break");
                break;// terminates whole loop
            }
        }


    }
}
