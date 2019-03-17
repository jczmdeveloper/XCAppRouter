package com.czm.mine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        int userid = getIntent().getIntExtra("user_id",0);
        Toast.makeText(this,"user id="+userid,Toast.LENGTH_SHORT).show();
    }
}
