import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class L102_Practice {
    public static void main(String[] args) {

        //Question 1: Create an ArrayList and store the names of ten students inside it.
        // Print it using a for each loop.
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);


        //Question 2: Use the Date class in Java to print the time in the following format : 21:47:02
            Date d = new Date();
            System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Question 3: Repeat question number 2 using the Calendar class.
            Calendar c = Calendar.getInstance();
            System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //Question 4: Repeat question number 2 using java.time API.
            LocalDateTime dt = LocalDateTime.now(); // This is the date
            DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
            String myDate = dt.format(df); // Creating date string using date and format
            System.out.println(myDate);

        //Question 5: Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
            HashSet<Integer> s = new HashSet();
            s.add(5);
            s.add(6);
            s.add(46);
            s.add(60);
            s.add(9);
            s.add(6);
            System.out.println(s);
        }
    }
}
