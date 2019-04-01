package com.njh.common.core;

import android.os.Environment;
import android.text.TextUtils;

import java.io.File;

/**
 * @author niejiahuan
 */
public class FilePath {

    public static void init(String proName) {
        if (null==proName||TextUtils.isEmpty(proName)){
          new Throwable("Project name cannot be empty");
        }
        mProName=proName;
    }
    private static String mProName;

    protected static String getProName() {
        return mProName;
    }

    private static String  PRO_PATH= Environment.getExternalStorageDirectory()+"/"+getProName();

    public static File getLogPath(){
        File file = new File(PRO_PATH + "/log");
        if (!file.exists()){
            file.mkdirs();
        }
        return file;
    }
}
