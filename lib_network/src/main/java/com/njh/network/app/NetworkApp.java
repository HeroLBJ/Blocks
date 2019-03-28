package com.njh.network.app;

import com.njh.base.app.BaseApp;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;

public class NetworkApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitUrlManager.getInstance().setDebug(true);
    }
}
