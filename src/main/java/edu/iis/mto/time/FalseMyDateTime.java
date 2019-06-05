package edu.iis.mto.time;

import org.joda.time.DateTime;

public class FalseMyDateTime implements MyDateTimeInterface {

    DateTime dateTime;

    FalseMyDateTime() {
        dateTime = new DateTime(2019, 2, 1, 1, 1);
    }

    public DateTime getDateTime() {
        return dateTime;
    }

}
