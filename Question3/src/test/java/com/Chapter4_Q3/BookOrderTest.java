package com.Chapter4_Q3;
import com.Chapter4_Q3.AppConfig.AppConfig;
import com.Chapter4_Q3.ObayOCP.OrderBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/28.
 */
public class BookOrderTest {

    private OrderBook ob;
    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ob = (OrderBook)ac.getBean("order");
    }

    @Test
    public void testBookOrder() throws Exception {
        Assert.assertEquals("Card",((OrderBook) ob).payBook());

    }

}
