package com.beanit.mahmoud.blinkrescuer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class SettingsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    LinearLayout layout_changepass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        layout_changepass= (LinearLayout) findViewById(R.id.layout_changepass);
        layout_changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),ChangePasswordActivity.class);
                startActivity(i);
            }
        });
        toolbar.setTitle("Blibk Rescuer");
        toolbar.setLogo(R.drawable.logoxml);



    }
}
