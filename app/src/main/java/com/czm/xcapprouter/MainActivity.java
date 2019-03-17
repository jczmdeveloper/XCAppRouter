package com.czm.xcapprouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.czm.login.LoginService;
import com.czm.mine.MyService;
import com.czm.xcrouterlib.XCAppRouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.launch_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LoginService)XCAppRouter.getInstance().route("com.czm.login.LoginActivity")).launch(MainActivity.this,"");
            }
        });
        findViewById(R.id.launch_my).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MyService)XCAppRouter.getInstance().route("com.czm.mine.MyService")).launch(MainActivity.this,10024);

            }
        });
        findViewById(R.id.show_ui).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                ((LoginService)XCAppRouter.getInstance().route("com.czm.login.LoginActivity")).newUserInfoFragment(
                        getFragmentManager(),R.id.fl_container,bundle);
            }
        });
    }
}
