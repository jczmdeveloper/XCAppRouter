package com.czm.login;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.czm.xcrouterlib.service.ILoginService;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class LoginService implements ILoginService{
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        intent.putExtra(LoginActivity.EXTRA_TARGET_CLASS,targetClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();
        return fragment;
    }
}
