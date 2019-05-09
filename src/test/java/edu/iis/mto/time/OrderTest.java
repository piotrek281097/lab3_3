package edu.iis.mto.time;

import org.junit.Test;


public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void testShouldThrowOrderExpiredException() {

        Order order = new Order();
        order.setSubbmitionMyDateTime(new MyDateTime(2019, 2, 1, 1, 1));
        order.submit();
        order.setMyDateTime(new MyDateTime(2019, 4, 1, 1, 1));
        order.confirm();
    }
}
