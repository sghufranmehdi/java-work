import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class L101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
