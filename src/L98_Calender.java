import java.util.Calendar;
import java.util.TimeZone;

public class L98_Calender {
    public static void main(String[] args) {

        //Calender is an abstract class so we didnt create his instance directly
//
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
