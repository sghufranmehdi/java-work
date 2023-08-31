import java.util.Scanner;
public class L18_ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age > 56) {
            System.out.println("Experienced");

        } else if (age>45) {
            System.out.println("Semmi Experienced");

        }
        else if (age>35)
        {
            System.out.println("Semmi Semmi");
        }
        else {
            System.out.println("Not much experienced");
        }
    }
}
