package com.cs.time;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class GetMidnightTime {
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        long howMany = (c.getTimeInMillis()-System.currentTimeMillis());
        System.out.println("Midnight Millis --> " + c.getTimeInMillis());
        System.out.println("Current Millis --> " + System.currentTimeMillis());
        System.out.println("Time --> " + new Date(c.getTimeInMillis()));
        System.out.println("Calculated Time --> " + new Date(System.currentTimeMillis() + howMany));
        
        LocalTime now = LocalTime.now();
        System.out.println(now.getHour());
        
        System.err.println();
	}
}