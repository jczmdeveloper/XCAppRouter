package com.czm.mine;

import android.app.Application;

import com.czm.xcrouterlib.IAppComponent;
import com.czm.xcrouterlib.XCAppRouter;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class MyApp extends Application implements IAppComponent{
    private static Application sInstance;
    public static Application getApplication() {
        return sInstance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        appInit(this);
    }

    @Override
    public void appInit(Application application) {
        sInstance = application;
        XCAppRouter.getInstance().register("com.czm.mine.MyService",new MyService());
    }
}
