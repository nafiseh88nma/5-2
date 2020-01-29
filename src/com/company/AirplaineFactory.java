package com.company;

/**
 * Created by admin on 11/1/2019.
 */
public class AirplaineFactory {
    public static Airplain getAirplain(int c){
        switch (c)
        {
            case 1:
                return new AirBus();
            case 2:
                return new Topolof();

            default:
                return null;
        }
    }
}
