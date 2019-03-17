package com.czm.login;

import android.app.Application;

import com.czm.xcrouterlib.IAppComponent;
import com.czm.xcrouterlib.XCAppRouter;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class LoginApp extends Application implements IAppComponent{
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
        XCAppRouter.getInstance().register("com.czm.login.LoginActivity",new LoginService());
    }
}
