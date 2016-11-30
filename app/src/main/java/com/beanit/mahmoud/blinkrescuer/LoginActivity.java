package com.beanit.mahmoud.blinkrescuer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends BaseActivity implements View.OnClickListener {
Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login= (Button) findViewById(R.id.btnlogin);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, StatusActivity.class);
        startActivity(i);
    }
}
