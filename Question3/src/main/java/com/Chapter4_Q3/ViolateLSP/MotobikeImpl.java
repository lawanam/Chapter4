package com.Chapter4_Q3.ViolateLSP;
import com.Chapter4_Q3.ObayLSP.Motobike;

/**
 * Created by student on 2016/03/28.
 */
public class MotobikeImpl implements Motobike {

    int gear=0;

    public String motoName() {
        return "Mzuvukile";
    }

    public int gearUp() {
        throw new UnsupportedOperationException() ;
    }

}
