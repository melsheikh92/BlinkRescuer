package com.beanit.mahmoud.blinkrescuer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Mahmoud on 15/10/2016.
 */

public class HistoryListAdapter extends ArrayAdapter implements View.OnClickListener {
    Context context;
    String[] names = {"Cheese", "Cheese","Pepperoni", "Black Olives"};
    public HistoryListAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
        this.context=context;

    }

    View view;
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = ( LayoutInflater )
                context. getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(position==0)
         view= inflater.inflate(R.layout.history_listitem_red,null);
        else if(position==1)
          view  = inflater.inflate(R.layout.history_listitem_gray,null);

        else {
            view = inflater.inflate(R.layout.history_listitem_green, null);
            view = inflater.inflate(R.layout.history_listitem_green, null);
         }


        view.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {
        Intent i =new Intent(context,AccidentInfo.class);
        context.startActivity(i);
    }
}
