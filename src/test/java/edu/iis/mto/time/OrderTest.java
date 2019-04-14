package edu.iis.mto.time;

import org.junit.Test;


public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void testShouldThrowOrderExpiredException() {

        Order order = new Order();
        order.setSubbmitionFakeDateTime(new FakeDateTime(2019, 2, 1, 1, 1));
        order.submit();
        order.setFakeDateTime(new FakeDateTime(2019, 4, 1, 1, 1));
        order.confirm();
    }
}
