package com.czm.xcapprouter;

import android.app.Application;

import com.czm.xcrouterlib.AppConfig;
import com.czm.xcrouterlib.IAppComponent;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class MainApp extends Application implements IAppComponent{
    private static Application sInstance;
    public static Application getApplication() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        appInit(this);
    }

    @Override
    public void appInit(Application application) {
        sInstance = (MainApp)application;
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponent) {
                    ((IAppComponent)object).appInit(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
