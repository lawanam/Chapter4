package com.Chapter_Q1;

/**
 * Created by student on 2016/03/27.
 */
public class Bus_Extnd extends Bus {
    private String Bus_type;

    public Bus_Extnd(){
    }

    public Bus_Extnd(String Bus_maker, int Bus_year, String Bus_type) {
        super(Bus_maker, Bus_year);
        this.Bus_type = Bus_type;
    }

    public String getB_type() {
        return Bus_type;
    }

    public void setB_type(String Bus_type) {
        this.Bus_type = Bus_type;
    }


}
