package com.Chapter4_Q2;

/**
 * Created by student on 2016/03/27.
 */
public class Bus_Extnd {

    Bus bus ;

    private String Bus_make;
    private int Bus_year;

    public Bus_Extnd() {
        bus = new Bus();
    }

    public Bus_Extnd(String Bus_make, int Bus_year, String Bus_type) {
        bus = new Bus();
        this.Bus_make = Bus_make;
        this.Bus_year = Bus_year;
        bus.setB_type(Bus_type);
    }
    public String getB_type(){ return bus.getB_type(); }



    public void setB_make(String Bus_make) {
        this.Bus_make = Bus_make;
    }

    public void setB_year(int Bus_year) {
        this.Bus_year = Bus_year;
    }


    public int getB_year() {
        return Bus_year;
    }

    public String getB_make() {
        return Bus_make;
    }


    public void setBus(String mercedes, int i, String s) {
    }
}

