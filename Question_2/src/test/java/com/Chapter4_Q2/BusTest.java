package com.Chapter4_Q2;

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
        bus = new Bus_Extnd();
    }

    @Test
    public void testBus() throws Exception {
       bus.setBus("Mercedes",2011,"Double deck");
       Bus_Extnd otherBus = new Bus_Extnd("Mercedes Benz",2011, "Mini Bus");

      /*  bus.setB_make("Mercedes Benz");
        bus.setB_year(2010);
        bus.setB_type("Mini Bus");

        Assert.assertSame(bus.getB_type(), otherBus.getB_type());*/
    }

    @After
    public void tearDown() throws Exception {


    }

}