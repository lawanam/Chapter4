package com.Chapter4_Q3;
import com.Chapter4_Q3.AppConfig.AppConfig;
import com.Chapter4_Q3.ObayLSP.Motobike;
import com.Chapter4_Q3.ObayLSP.MotobikeImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/28.
 */
public class MotobikeTest {


    private Motobike m;
    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        m = (Motobike) ac.getBean("10");

    }

    @Test
    public void testMotobike() throws Exception{

        int gear =0;
        Assert.assertEquals(1, m.gearUp());
    }


}