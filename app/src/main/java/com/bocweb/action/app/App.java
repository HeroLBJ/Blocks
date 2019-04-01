package com.bocweb.action.app;

import com.njh.common.CommonApp;
import com.njh.common.core.FilePath;

/**
 * @author niejiahuan
 */
public class App extends CommonApp {

    @Override
    public void onCreate() {
        super.onCreate();
        FilePath.init("blocks");
        CrashHandlerUtil.getInstance().init(this);
    }
}
