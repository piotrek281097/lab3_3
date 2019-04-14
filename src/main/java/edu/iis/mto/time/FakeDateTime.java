package edu.iis.mto.time;

import org.joda.time.DateTime;

public class FakeDateTime {

    DateTime dateTime;

    FakeDateTime(int y, int m, int d, int h, int min) {
        dateTime = new DateTime(y,m,d,h,min);
    }

    public void setFakeDateTime(int y, int m, int d, int h, int min) {
        dateTime = new DateTime(y,m,d,h,min);
    }

    public DateTime getFakeDateTime() {
        return dateTime;
    }

}
