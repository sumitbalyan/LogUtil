package com.app.rsystems.snaplib;

import android.util.Log;

public class LogUtil {
    private static final String TAG="DebugLog";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
