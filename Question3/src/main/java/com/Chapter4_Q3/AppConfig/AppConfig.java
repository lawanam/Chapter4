package com.Chapter4_Q3.AppConfig;
import com.Chapter4_Q3.ObayLSP.Motobike;
import com.Chapter4_Q3.ObayOCP.OrderBook;
import com.Chapter4_Q3.ObaySRP.HourAttended;
import com.Chapter4_Q3.ObaySRP.HourAttendedImpl;
import com.Chapter4_Q3.ObaySRP.StudDetails;
import com.Chapter4_Q3.ObaySRP.StudImpl;
import com.Chapter4_Q3.ViolateLSP.MotobikeImpl;
import com.Chapter4_Q3.ViolateOCP.OrderBookImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/28.
 */

    @Configuration
    public class AppConfig {
        /*********************************************
         SRP
         *********************************************/

        /*@Bean(name ="order")
        public OrderBook getBookOder(){ return new OrderBookImpl();}*/

        @Bean(name ="hourAttended")
        public HourAttended getHourAttended(){ return new HourAttendedImpl();}

        @Bean(name ="stuDesc")
        public StudDetails getStudDetails(){ return new StudImpl();}
        /*********************************************
         OCP
         *********************************************/

        @Bean(name ="Java")
        OrderBook getBookOrder(){ return new com.Chapter4_Q3.ObayOCP.OrderBookImpl();}
        @Bean(name ="pay")
        public OrderBook payBook(){ return new com.Chapter4_Q3.ObayOCP.OrderBookImpl(); }
        /*********************************************
         LS
         *********************************************/
        @Bean(name="BMU")
        public Motobike motoName(){ return new MotobikeImpl();}
        @Bean(name="10")
        public Motobike gearUp(){ return new MotobikeImpl();}

    }




