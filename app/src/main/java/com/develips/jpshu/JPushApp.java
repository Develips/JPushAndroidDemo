package com.develips.jpshu;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @Author: slp
 * @E-Mail: siilip@qq.com
 * @Created: 2019/06/19
 * @Description:
 * @Version: 1.0
 */
public class JPushApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /** 极光推送初始化 Begin */
        JPushInterface.setDebugMode(BuildConfig.DEBUG);
        JPushInterface.init(this);
        /** 极光推送初始化 End */
    }
}
