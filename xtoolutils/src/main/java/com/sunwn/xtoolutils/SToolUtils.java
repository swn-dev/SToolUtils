package com.sunwn.xtoolutils;

import android.app.Application;
import android.content.Context;

public class SToolUtils {
    private static Application sContext;

    public static void init(Application application) {
        sContext = application;
    }

    public static Context getContext() {
        return sContext;
    }
}
