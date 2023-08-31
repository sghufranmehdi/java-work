import java.util.Date;

public class L96_97_Time_Date {
    public static void main(String[] args) {
//        System.out.println(
//                System.currentTimeMillis()/1000/3600/24/365);
//        //1000 for sec, 3600 for min, 24 for days and 365 for yrs

        //safe to store ms in long value
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
