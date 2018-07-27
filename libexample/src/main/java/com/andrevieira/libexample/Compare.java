package com.andrevieira.libexample;

import android.util.Log;

public class Compare {
    private static  final String TAG_LOG = "compare";
    private static  final String MSG_POSITIVE = "Positive";
    private static  final String MSG_NEGATIVE = "Negative";



    public static void testeLib(String name){
        if (name.length() == 5){
            Log.d(TAG_LOG, name + " " + MSG_POSITIVE);
        }else{
            Log.d(TAG_LOG, name + " " + MSG_NEGATIVE);
        }
    }

}
