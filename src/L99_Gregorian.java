import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class L99_Gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar g = new GregorianCalendar();
        int year =2020;
        System.out.println(g.isLeapYear(year));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
    }

}
