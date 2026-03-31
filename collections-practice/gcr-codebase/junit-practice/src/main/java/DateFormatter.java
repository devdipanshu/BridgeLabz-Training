import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public String formatDate(String inputDate) {
        if(inputDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);

        } catch(ParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
