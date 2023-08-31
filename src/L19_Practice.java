
import java.util.Scanner;
public class L19_Practice {
    public static void main(String[] args) {
        //Q2 Result 33% in each and avg 40% overall
       /*
        Scanner sc = new Scanner(System.in);
        float m1,m2,m3,avg;
        System.out.println("Enter chem");
        m1= sc.nextInt();
        System.out.println("Enter physics");
        m2= sc.nextInt();
        System.out.println("Enter maths");
        m3= sc.nextInt();
        avg = (m1+m2+m3)/3.0f;
        System.out.println("overall percentage is "+ avg);
        if(m1>=33 && m2>=33 && m3>=33 && avg>= 40){
            System.out.println("pass");
        }
        else
            System.out.println("fail");


        //Q3 Calculate income tax
        Scanner sc = new Scanner(System.in);
        double income = 0,input;
        input= sc.nextDouble();
        if(input>=250000)
        {
            income = input;
        }
        else {
            System.out.println("Your income is less");
            System.exit(0);
        }
        double tax ;
        if( income>=250000 && income<=490000)
        {
            tax = income*5/100;
            System.out.println("Income is "+income+"and Tax 5% calculate is "+tax);
        }
        else if (income>=500000 && income<=999999) {
            tax = income*20/100;
            System.out.println("Income is "+income+"and Tax 20% calculate is "+tax);
        }
        else if (income>=1000000) {
            tax = income*30/100;
            System.out.println("Income is "+income+"and Tax 30% calculate is "+tax);
        }
        else {
            System.out.println("your income is less or not valid");
        }

        ------
                // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);



        //Q4 find out the days as 1 is monday

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {//Enhanced switch method
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednessday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


        //Q5 year entered is leap or not
        Scanner sc = new Scanner(System.in);
        int year;
        year= sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("Leap");
                }
                else
                {
                    System.out.println(" not Leap");
                }
            }
            else
            {
                System.out.println("Leap");
            }
        }
        else
        {
            System.out.println("Not leap");
        }


        //Q6 Finds out the type of website
        Scanner sc = new Scanner(System.in);
        String website=sc.next();
        if (website.endsWith(".org"))
        {
            System.out.println("Organizational website");

        }
        else if (website.endsWith(".edu")) {
            System.out.println("Educational website");
        }
        else if (website.endsWith(".pkr")) {
            System.out.println("Pakistani website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("Comercial website");
        }
        else {
            System.out.println("Not in record");
        }

        */


    }
}
