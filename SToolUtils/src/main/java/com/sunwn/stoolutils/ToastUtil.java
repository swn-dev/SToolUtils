package com.sunwn.stoolutils;

import android.widget.Toast;

public class ToastUtil {
    public static void toast(String text) {
        Toast.makeText(SToolUtils.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
