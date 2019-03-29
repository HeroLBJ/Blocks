package com.njh.base.ui.fmt;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionBar;
import com.jakewharton.rxbinding2.view.RxView;
import com.njh.base.listener.LifeCycleListener;
import com.njh.base.ui.view.BaseView;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.trello.rxlifecycle3.components.support.RxFragment;

import java.util.concurrent.TimeUnit;

import androidx.annotation.Nullable;
import io.reactivex.Observable;

/**
 * @author niejiahuan
 */
public abstract class BaseFmt extends RxFragment implements BaseView {

    protected ImmersionBar immersionBar;

    protected Context mContext;
    protected View mContentView;
    protected OperateFmtCompatDelegate compatDelegate;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @androidx.annotation.Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @androidx.annotation.Nullable ViewGroup container,
                             @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        if (null==mContentView) {
            mContentView = inflater.inflate(getLayoutId(), container, false);
        }
        return mContentView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        compatDelegate=new OperateFmtCompatDelegate(this);
        initStatusBar();
    }

    /**
     * 设置是否开启
     * @return
     */
    protected boolean isEnableStatusBar() {
        return true;
    }

    protected void initStatusBar() {
        if (isEnableStatusBar()) {
            immersionBar.statusBarDarkFont(true, 0.2f)
                    .navigationBarColorInt(Color.WHITE)
                    .navigationBarDarkIcon(true, 0.2f)
                    .init();
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (hidden) {
            immersionBar.init();
        }
        super.onHiddenChanged(hidden);
    }

    public Observable click(View view) {
        return throttleFirst(RxView.clicks(view));
    }
    /**
     * 防抖动，防止快速点击
     *
     * @param observable
     * @param <T>
     * @return
     */
    protected <T extends Object> Observable<T> throttleFirst(Observable<T> observable) {
        return observable.throttleFirst(500, TimeUnit.MILLISECONDS);
    }

    /**
     * 将事件与生命周期绑定
     *
     * @param observable
     * @return
     */
    protected <T extends Object> Observable<T> bindLife(Observable<T> observable) {
        return (Observable<T>) observable.compose(bindToLifecycle());
    }

    /**
     * 指定事件在哪个生命周期结束
     *
     * @param observable
     * @param event      生命周期
     * @return
     */
    protected <T extends Object> Observable<T> bindUntil(Observable<T> observable, FragmentEvent event) {
        return (Observable<T>) observable.compose(bindUntilEvent(event));
    }

    LifeCycleListener mListener;

    public void setOnLifeCycleListener(LifeCycleListener lifeCycleListener) {
        this.mListener = lifeCycleListener;
    }
    @Override
    public void onStart() {
        super.onStart();
        if (mListener != null) {
            mListener.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mListener != null) {
            mListener.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mListener != null) {
            mListener.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mListener != null) {
            mListener.onStop();
        }
    }
}
