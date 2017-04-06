package com.company;

/**
 * Created by ridita on 4/5/17.
 */
public class StringTimes {

    public String stringTimes(String str, int n) {

        String total = "";

        for (int i = 0; i < n; i++) {
            total += str;
        }

        return total;

    }

}
