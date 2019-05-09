package edu.iis.mto.time;

import org.joda.time.DateTime;

public class MyDateTime {

    DateTime dateTime;

    MyDateTime(int y, int m, int d, int h, int min) {
        dateTime = new DateTime(y,m,d,h,min);
    }

    public void setMyDateTime(int y, int m, int d, int h, int min) {
        dateTime = new DateTime(y,m,d,h,min);
    }

    public DateTime getMyDateTime() {
        return dateTime;
    }

}
