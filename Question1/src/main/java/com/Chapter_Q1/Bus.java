package com.Chapter_Q1;

/**
 * Created by student on 2016/03/27.
 */
public class Bus {


    private String Bus_maker;
    private int Bus_year;


    public Bus(){

    }
    public Bus(String Bus_maker, int Bus_year) {
        this.Bus_maker = Bus_maker;
        this.Bus_year = Bus_year;
    }

    public String getB_maker() {
        return Bus_maker;
    }

    public void setB_maker(String Bus_maker) {
        this.Bus_maker = Bus_maker;
    }

    public int getB_year() {
        return Bus_year;
    }

    public void setB_year(int Bus_year) {
        this.Bus_year = Bus_year;
    }

}
