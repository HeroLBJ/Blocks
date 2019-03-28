package com.njh.network.api;

import android.content.Context;
import android.util.ArrayMap;

import com.njh.network.utils.RetrofitUtils;

/**
 * Created by xdj on 16/3/14.
 * 接口管理
 */
public class ServiceManager {
    static Context mContext;
    public static void initServiceManager(Context context){
        mContext=context;
    }
    private static final ArrayMap<Class, Object> mServiceMap = new ArrayMap<>();

    public static void clearMap(){
        mServiceMap.clear();
    }
    public static <T> T create(Class<T> serviceClass) {
        Object service = mServiceMap.get(serviceClass);
        if (service == null) {
            service = RetrofitUtils.get(mContext).retrofit().create(serviceClass);
            mServiceMap.put(serviceClass, service);
        }

        return (T) service;
    }
    public static <T> T defCreate(){
        return (T) create(ApiService.class);
    }
}
