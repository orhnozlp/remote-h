package com.tigers.remote_h;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set_on_click_buttons();
    }

    void set_on_click_buttons(){
        LinearLayout layout = (LinearLayout)findViewById(R.id.statistics);
        layout.setClickable(true);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,Statistics.class);
                 startActivity(intent);
            }
        });

        LinearLayout environment_layout = (LinearLayout)findViewById(R.id.environment);
        environment_layout.setClickable(true);
        environment_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Environment.class);
                startActivity(intent);
            }
        });

        LinearLayout motivation_layout = (LinearLayout)findViewById(R.id.motivation);
        motivation_layout.setClickable(true);
        motivation_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuoteActivity.class);
                intent.putExtra("isQuotes", true);
                startActivity(intent);
            }
        });
        LinearLayout my_info_layout = (LinearLayout)findViewById(R.id.my_info);
        my_info_layout.setClickable(true);
        my_info_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MyInfo.class);
                startActivity(intent);
            }
        });

    }

}