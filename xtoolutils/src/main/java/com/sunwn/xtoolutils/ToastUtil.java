package com.sunwn.xtoolutils;

import android.widget.Toast;

public class ToastUtil {
    private static void toast(String text, int duration) {
        Toast.makeText(SToolUtils.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
