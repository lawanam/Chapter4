package com.Chapter4_Q2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by student on 2016/03/27.
 */
@Configuration

public class AppConf {
    @Bean(name ="Mini Bus")
    public Bus getBus(){
        return new Bus();
    }


}
