import java.util.Scanner;
public class L13_Strings {
    public static void main(String[] args) {
        /*
        A string is a sequence of characters.
        Strings are objects that represent a char array. For example

            char[] str = {'H','A','R','R','Y'};
            String s = new String(str);

             same as

            String s = "Harry";

    Strings are immutable and cannot be changed.
    java.lang.String class is used to create a String object.
    The string is a class but can be used as a data type

    See the examples given below to get a better understanding of String literal and String object :

        String str1 = "CodeWithHarry";
        String str2 = "CodeWithHarry"
        System.out.println(str1 == str2);
Output :
True
        Returns true because str1 and str2 are referencing the same object present in the string constant pool. Now, let's see the case of the String object :

        String str1 = new String("Keep coding");
        String str2 = new String("Keep coding"");
        System.out.println(str1 == str2);
Output :
False

    Although the value of both the string object is the same,
    still false is displayed as output
    because str1 and str2 are two different string objects created in the heap.
    That's why it is not considered a good practice two compare two strings using the == operator.
    Always use the equals() method to compare two strings in Java.

        String name = new String();
        name= "Ghufran";
        System.out.println(name);
        String name2 = new String("Muhammad");
        System.out.println(name2);
        String name3 = "Ghufran Mehdi";
        System.out.println(name3);


         Scanner sc = new Scanner(System.in);
         //String s = sc.next(); // that function only reads one word not a whole line(use space for descriminate word)
         String s = sc.nextLine();// for whole line
         System.out.println(s);
 */
        int a = 6;
        float b = 5.6456f;
        System.out.printf("Value of a is %d and value of b is %f",a,b);// format specifier
        System.out.printf("Value of a is %d and value of b is %.2f",a,b); // after point 2 values only
        System.out.printf("Value of a is %d and value of b is %8.2f",a,b); // left 8 spaces includes ur number and after point shows 2 values
    }
}
