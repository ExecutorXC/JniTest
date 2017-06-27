package com.design.chenxiao.jnitest;

/**
 * Created by chenxiao on 17/6/27.
 */

public class NativeMoce {
    static {
        System.loadLibrary("ChenxiaoJniLibName");   //defaultConfig.ndk.moduleName
    }
    public native int getHe(int i, int j) ;
}
