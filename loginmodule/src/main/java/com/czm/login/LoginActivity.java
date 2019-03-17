package com.czm.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class LoginActivity extends Activity{
    public static final String EXTRA_TARGET_CLASS = "extra_target_class";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
