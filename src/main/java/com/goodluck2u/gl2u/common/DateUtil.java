package com.goodluck2u.gl2u.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date getDateFromInt(long time){
        Calendar c=Calendar.getInstance();
        long millions=time * 1000;
        c.setTimeInMillis(millions);
        return c.getTime();
    }

    public static String getStringFromDate(Date time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(time);
        return dateString;
    }

    public static Date getUTCTimeFromDate(Date time){
        Calendar cal = Calendar.getInstance();
        //获得时区和 GMT-0 的时间差,偏移量
        int offset = cal.get(Calendar.ZONE_OFFSET);
        //获得夏令时  时差
        int dstoff = cal.get(Calendar.DST_OFFSET);
        Date date = new Date(time.getTime() - (offset + dstoff));//获得当前是UTC时区的时间毫秒值
        return date;
    }

    public static long getTimeRange(TimeRange timeRange){
        long time = 0;
        Calendar calendar = Calendar.getInstance();
        switch (timeRange){
            case TODAY:
                calendar.setTime(new Date());
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
            case WEEK:
                calendar.setTime(new Date());
                calendar.add(Calendar.DATE, - 7);
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
            case MONTH:
                calendar.setTime(new Date());
                calendar.add(Calendar.DATE, - 30);
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
            case THREEMONTH:
                calendar.setTime(new Date());
                calendar.add(Calendar.DATE, - 90);
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
        }
        return calendar.getTime().getTime();
    }
}
