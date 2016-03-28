package com.Chapter_Q1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by student on 2016/03/27.
 */
public class BusTest {

    private Bus_Extnd bus;
    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new AnnotationConfigApplicationContext(AppConf.class);
        bus = (Bus_Extnd)ac.getBean("Mini Bus");

    }

    @Test
    public void testBus() throws Exception {

        Bus_Extnd otherBus = new Bus_Extnd("Mercedes Benz",2010, "Mini Bus");

        bus.setB_maker("Mercedes Benz");
        bus.setB_year(2010);
        bus.setB_type("Mini Bus");

        Assert.assertSame(bus.getB_type(), otherBus.getB_type());
    }

    @After
    public void tearDown() throws Exception {

    }

}
