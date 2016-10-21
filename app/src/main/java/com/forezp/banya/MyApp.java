package com.forezp.banya;

import android.app.Application;
import android.content.Context;

/**
 *
 */
public class MyApp extends Application {
    private static final String DB_NAME = "weibo.db";
    public static MyApp mMyApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyApp = this;
    }

    public static MyApp getInstance() {
        return mMyApp;
    }
}
