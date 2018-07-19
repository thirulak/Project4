package com.example.android.musi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Meenakshi on 7/9/2018.
 */

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        String nameSong = getIntent().getStringExtra("song");
        String nameOther = getIntent().getStringExtra("other");
        TextView textView1 = findViewById(R.id.name1);
        TextView textView2 = findViewById(R.id.name2);
        textView1.setText(nameSong);
        textView2.setText(nameOther);
    }
}

