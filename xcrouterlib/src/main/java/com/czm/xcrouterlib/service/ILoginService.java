package com.czm.xcrouterlib.service;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by caizhiming on 2017/3/17.
 */

public interface ILoginService extends IService{

    void launch(Context context,String targetClass);
    Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
