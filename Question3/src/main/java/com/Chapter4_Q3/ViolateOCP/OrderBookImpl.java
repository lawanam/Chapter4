package com.Chapter4_Q3.ViolateOCP;

/**
 * Created by student on 2016/03/28.
 */
public class OrderBookImpl implements OrderBook {
    public String getBookOrder() {
        return "Java";
    }
    public String payOption(int opt) {
        String msg="";
        if(opt==1)
            msg = "Cash";
        else
            msg ="Card";
        return msg;
    }

}
