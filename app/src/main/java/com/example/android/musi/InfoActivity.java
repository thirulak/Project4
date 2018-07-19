package com.example.android.musi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Meenakshi on 7/20/2018.
 */

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Find the back button that goes to MainActivity
        Button btnBack = (Button) findViewById(R.id.btn_back);
        // Set a click listener on that View
        btnBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                Intent btnIntent = new Intent(InfoActivity.this, MainActivity.class);
                startActivity(btnIntent);
            }
        });
    }
}
