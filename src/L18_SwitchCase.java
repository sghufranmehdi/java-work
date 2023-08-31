import java.util.Scanner;
public class L18_SwitchCase {
    public static void main(String[] args) {
        /*int age ;
        Scanner sc = new Scanner(System.in);

        age  = sc.nextInt();
        switch (age)
        {
            case 18:
                System.out.println("Adult");
                break;
            case 21:
                System.out.println("Adult+");
                break;
            case 25:
                System.out.println("Adult++");
                break;
            default:
                System.out.println("Enjoyy");
        }

         */
        char var1 = 0,var2 = 'c';// valid for string too
        switch (var1)
        {
            case 'c':
                System.out.println("C matched");
                break;
            case 'd':
                System.out.println("D matched");
                break;
            default:
                System.out.println("Not matched");
        }

        switch (var2) {//Enhanced switch method
            case 'c' -> {
                System.out.println("C matched");
                System.out.println("congrats");
            }
            case 'd' -> System.out.println("D matched");
            default -> System.out.println("Not matched");
        }


    }
}
