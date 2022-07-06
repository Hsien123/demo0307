import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @ClassName: DateStringUtils
 **/
public class DateStringUtils {
    private final static String DATETIME = "yyyy-MM-dd HH:mm:ss";
    private final static String DATE = "yyyy-MM-dd";
    private final static String TIME = "HH:mm:ss";
    /**
     * @Description: 字符串转日期
     * @Param: [str]
     * @return: java.util.Date
     */
    public static Date strToDate(String str) throws ParseException {
       SimpleDateFormat sf = new SimpleDateFormat(DATE);
        Date date = sf.parse(str);
        return date;
    }
    /**
     * @Description: 字符串转日期
     * @Param:
     * @return:
     */
    public static Date strToDate(String str,String format) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Date date = sf.parse(str);
        return date;
    }
    /**
     * @Description: 日期转字符串
     * @Param:
     * @return:
     */
    public static String dateToStr(Date date){
        SimpleDateFormat sf = new SimpleDateFormat(DATE);
        String str = sf.format(date);
        return str;
    }
    /**
     * @Description:
     * @Param:
     * @return:
     */
    public static String dateToStr(Date date,String format){
        SimpleDateFormat sf = new SimpleDateFormat(format);
        String str = sf.format(date);
        return str;
    }
}
