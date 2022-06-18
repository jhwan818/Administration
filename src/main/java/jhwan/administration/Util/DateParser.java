package jhwan.administration.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    private static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public static String dateToString(Date date){
        return format.format(date);
    }
    public static Date stringToDate(String str) throws ParseException {
        return format.parse(str);
    }

    public static void setFormatter(SimpleDateFormat new_format){
        format = new_format;
    }
    public static void setFormatter(String new_format_String){
        format = new SimpleDateFormat(new_format_String);
    }
}