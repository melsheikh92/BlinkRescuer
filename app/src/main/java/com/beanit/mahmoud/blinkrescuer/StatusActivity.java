package com.beanit.mahmoud.blinkrescuer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatusActivity extends BaseActivity implements View.OnClickListener {
Button btn_offline,btn_online;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        btn_offline= (Button) findViewById(R.id.btn_offline);
        btn_online= (Button) findViewById(R.id.btn_online);
        btn_offline.setOnClickListener(this);
        btn_online.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,Main.class);
        startActivity(i);
    }
}
