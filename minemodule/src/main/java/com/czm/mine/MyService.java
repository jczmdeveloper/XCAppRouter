package com.czm.mine;

import android.content.Context;
import android.content.Intent;

import com.czm.xcrouterlib.service.IMyService;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class MyService implements IMyService{
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context,MyActivity.class);
        intent.putExtra("user_id",userId);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
