package com.beanit.mahmoud.blinkrescuer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Main extends BaseActivity {
    private Toolbar toolbar;
    Button btn_settings;
    Button btn_notify;
ListView lv;
    String[] names = {"Cheese", "Cheese","Pepperoni", "Black Olives"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv= (ListView) findViewById(R.id.listview);
        lv.setAdapter(new HistoryListAdapter(this,R.layout.history_listitem_green,names));
        btn_settings= (Button) toolbar.findViewById(R.id.btn_settings);
        btn_notify= (Button) toolbar.findViewById(R.id.btn_notify);
        btn_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),AccReqActivity.class);
                startActivity(i);
            }
        });
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),SettingsActivity.class);
                startActivity(i);            }
        });
        setSupportActionBar(toolbar);
        toolbar.setTitle("Blibk Rescuer");
      //  getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setLogo(R.drawable.logoxml);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);//Menu Resource, Menu
//        return true;
//
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.menu_settings:
//
//                   return true;
//            case R.id.menu_msg:
//                    return true;
//                default:
//                    return false;
//        }
//        }

}
