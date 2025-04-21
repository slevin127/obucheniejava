package lesson9;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class lesson9_1 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int era = calendar.get(Calendar.ERA);//Эра
        int year = calendar.get(Calendar.YEAR);//Год
        int month = calendar.get(Calendar.MONTH);//Месяц Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);//День месяца
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);//День недели
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);//Неделя года
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//Неделя месяца

        int hour = calendar.get(Calendar.HOUR);//Час в 12 часовом формате
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);//Час в 24 часовом формате
        int minute = calendar.get(Calendar.MINUTE);//Минуты
        int second = calendar.get(Calendar.SECOND);//Секунды
        int millisecond = calendar.get(Calendar.MILLISECOND);//Миллисекунды
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy dd MMM HH:mm:ss");


        System.out.println("Неделя в году: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Неделя в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));

    }

    public void after(Object calendar) {

    }
}
