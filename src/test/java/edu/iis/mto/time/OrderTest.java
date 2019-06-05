package edu.iis.mto.time;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void testShouldThrowOrderExpiredException() {

        Order order = new Order(new FalseMyDateTime());
        order.submit();
        order.confirm();
    }

}
