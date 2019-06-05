package edu.iis.mto.time;

import org.joda.time.DateTime;

public class RealMyDateTime implements MyDateTimeInterface {

    DateTime dateTime;

    RealMyDateTime() {
        dateTime = new DateTime(System.currentTimeMillis() + 10000);
    }

    public DateTime getDateTime() {
        return dateTime;
    }

}
