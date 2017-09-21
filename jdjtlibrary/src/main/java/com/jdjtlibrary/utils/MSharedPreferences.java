package com.jdjtlibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.jdjtlibrary.base.BaseApplication;

public class MSharedPreferences {

    private static String SP_FILE_NAME = "app_sp_file";
    private static BaseApplication sApp = BaseApplication.getApp();
    private static SharedPreferences sSp = sApp.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);

    public static final String KEY_USER_INFO = "user";
    public static final String KEY_FIRST_ENTER = "first";
    public static final String LOGIN = "is_login";

//    public static final String KEY_PASSWD = "passwd";
//    public static final String KEY_DEFAULT_CITY = "default_city";
//    public static final String UUID = "uuid";
//    public static final String REG_ID = "reg_id";



    //--------------------雷石ktv(开始)---------------------
    public static final String BINDROOM = "bind_room";
    public static final String KTVSCAN = "erweima";//二维码
    public static final String KTVWXUID = "ktvwxuid";//二维码uid
    public static final String KTVUID = "ktvuid";//二维码uid
    //--------------------雷石ktv(结束)---------------------

    //-------------------xms(开始)-------------------
    public static final String XMSBIND_URL= "xms_bind_url";
    public static final String XMSBIND_NAME = "xms_bind_name";
    public static final String XMSBIND_HALLID = "xms_bind_hallid";
    public static final String XMSBIND_PLAYIP = "xms_bind_playip";
    public static final String XMSBIND_PLAYMAC = "xms_bind_playmac";
    //-------------------xms(结束)-------------------
    public static void remove(String key) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.remove(key);
        editor.commit();
    }

    public static void putInt(String key, int value) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void putFloat(String key, float value) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public static int getInt(String key, int defaultValue) {
        return sSp.getInt(key, defaultValue);
    }

    public static void putLong(String key, long value) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static long getLong(String key, long defaultValue) {
        return sSp.getLong(key, defaultValue);
    }

    public static Float getFloat(String key, float defaultValue) {
        return sSp.getFloat(key, defaultValue);
    }

    public static void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return sSp.getBoolean(key, defaultValue);
    }
    public static void putString(String key, String value) {
        SharedPreferences.Editor editor = sSp.edit();
        editor.putString(key, value);
        editor.commit();
    }
    public static String getString(String key, String defaultValue) {
        return sSp.getString(key, defaultValue);
    }
    public static boolean exist(String key) {
        return sSp.contains(key);
    }
}
