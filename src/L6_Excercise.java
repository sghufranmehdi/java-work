import java.util.Scanner;
public class L6_Excercise {
    public static void main(String[] args) {
     /*
       int sub1,sub2,sub3,sub4,sub5;
       int total,marks, prcnt;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int m1 = sc.nextInt();
        System.out.println("Enter marks are out of?");
        int t1= sc.nextInt();
        System.out.println("Enter subject 2 marks");
        int m2 = sc.nextInt();
        System.out.println("Enter marks are out of?");
        int t2= sc.nextInt();
        System.out.println("Enter subject 3 marks");
        int m3 = sc.nextInt();
        System.out.println("Enter marks are out of?");
        int t3= sc.nextInt();
        System.out.println("Enter subject 4 marks");
        int m4 = sc.nextInt();
        System.out.println("Enter marks are out of?");
        int t4= sc.nextInt();
        System.out.println("Enter subject 5 marks");
        int m5 = sc.nextInt();
        System.out.println("Enter marks are out of?");
        int t5= sc.nextInt();
        marks=m1+m2+m3+m4+m5;
        total= t1+t2+t3+t4+t5;
        System.out.print("Your marks obtained are "+marks);
        System.out.println(" out of "+ total);
        prcnt= marks/total*100;
        System.out.println("percentage is "+ prcnt);

      */

        //-------------------
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter your Physics marks : ");
     int physics = scan.nextInt();
     System.out.println("Enter your English marks : ");
     int English = scan.nextInt();
     System.out.println("Enter your Chemistry marks : ");
     int chemistry = scan.nextInt();
     System.out.println("Enter your Mathematics marks : ");
     int mathematics = scan.nextInt();
     System.out.println("Enter your Computer Science marks : ");
     int computer = scan.nextInt();

     float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

     System.out.println("percentage : ");
     System.out.println(percentage);


    }
}
