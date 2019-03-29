package com.njh.common.flux.actions;


import com.njh.base.listener.LifeCycleListener;
import com.njh.base.ui.view.BaseView;
import com.njh.common.flux.dispatcher.Dispatcher;

import java.lang.ref.Reference;


/**
 * @author niejiahuan
 */
public class ActionsCreator<V extends BaseView>{
    protected V mView;
    protected final Dispatcher dispatcher;
    public ActionsCreator(Dispatcher dispatcher,V v) {
        this.dispatcher = dispatcher;
        this.mView=v;
    }

}
