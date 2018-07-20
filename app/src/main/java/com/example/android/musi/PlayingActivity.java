package com.example.android.musi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
        // Find the back button that goes to MainActivity
        Button btnBack = (Button) findViewById(R.id.btn_back);
        // Set a click listener on that View
        btnBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                Intent btnIntent = new Intent(PlayingActivity.this, MainActivity.class);
                startActivity(btnIntent);
            }
        });
    }
}

