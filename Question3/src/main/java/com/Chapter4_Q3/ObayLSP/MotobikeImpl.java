package com.Chapter4_Q3.ObayLSP;

/**
 * Created by student on 2016/03/28.
 */
public class MotobikeImpl implements Motobike{

    int gear=0;

    public String motoName() {
        return "BMW";
    }

    public int gearUp() {
        return ++gear ;
    }



}
