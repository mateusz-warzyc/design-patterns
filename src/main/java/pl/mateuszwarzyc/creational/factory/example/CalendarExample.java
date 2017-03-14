package pl.mateuszwarzyc.creational.factory.example;

import java.util.Calendar;

/**
 * Created by Coffee13.
 */
public class CalendarExample {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //Calendar calendar = Calendar.

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
