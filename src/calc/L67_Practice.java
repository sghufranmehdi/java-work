//Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package

package calc;
import static java.lang.Math.sin;
import java.util.Scanner;


class Calculator{
    public void sum(int a , int b)
    {
        System.out.println("Sum is "+ a+b);
    }

}
class ScCalculator{
    public void sum(int a , int b)
    {
        System.out.println("Sin is "+ sin(a+b));
    }

}
class HyCalculator{
    public void sum(int a , int b)
    {
        System.out.println("Sum is "+ a+b);
        System.out.println("Sin is "+ sin(a+b));
    }

}
public class L67_Practice {
    public static void main(String[] args) {
       // System.out.println("I am main meth");

        //Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Displaying Message");

    }
}
