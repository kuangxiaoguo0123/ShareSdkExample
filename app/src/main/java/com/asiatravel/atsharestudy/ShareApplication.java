package com.asiatravel.atsharestudy;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;


/**
 * Created by asiatravel on 2016/11/22.
 */

public class ShareApplication extends Application {

    private static final String APP_KEY = "193e71d0869ce";

    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this, APP_KEY);
    }
}
