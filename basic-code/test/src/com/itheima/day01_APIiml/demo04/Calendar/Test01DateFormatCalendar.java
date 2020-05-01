package com.itheima.day01_APIiml.demo04.Calendar;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test01DateFormatCalendar {
    public static void main(String[] args) throws ParseException {

        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d);

        System.out.println(format);

        String date = "1988年12月07日 15:12:03";
        Date date1= sdf.parse(date);

        System.out.println(date1);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        c.set(Calendar.MONTH, 11);
        int monthSet = c.get(Calendar.MONTH );
        System.out.println(monthSet + 1);


        c.add(Calendar.YEAR, 2);
        System.out.println(c.get(Calendar.YEAR));

    }
}
