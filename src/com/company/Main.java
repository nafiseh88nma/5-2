package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Airplain airplain=AirplaineFactory.getAirplain(Airplain.AIRBUS);
        airplain.fly();
    }
}
