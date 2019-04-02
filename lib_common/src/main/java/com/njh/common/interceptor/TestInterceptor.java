package com.njh.common.interceptor;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

@Interceptor(priority = 1, name = "登录拦截器拦截器")
public class TestInterceptor implements IInterceptor {
    Context mContext;
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if ("/test/activity4".equals(postcard.getPath())) {
            //添加路径判断
        } else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
    // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
        mContext=context;
    }
}