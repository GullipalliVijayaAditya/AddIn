package com.example.aditya.addin.utils;


public class StringUtils {

    public static String cut(String str, int len) {
        if (str.length() > len - 3) {
            return str.substring(0, len - 3) + "...";
        } else return str;
    }
}
