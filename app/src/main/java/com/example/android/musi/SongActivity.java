package com.example.android.musi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Meenakshi on 7/9/2018.
 */

public class SongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Song> songList = new ArrayList<>();
        songList.add(new Song("Vadi pulla vadi", "Hiphop thamizha"));
        songList.add(new Song("Vaadi en thanga selai", "Shankar mahadhevan"));
        songList.add(new Song("Anbendra mazhaiyle", "Anuradha sriram"));
        songList.add(new Song("karuvakkatu karuvaya", "Vandhana srinivasan"));
        songList.add(new Song("Maya nadhi", "Ananthu"));
        songList.add(new Song("Ennamo edho", "Alap raju"));
        songList.add(new Song("Ennai konjam maatri", "Thippu"));
        songList.add(new Song("Malargal ketten", "Chinnakuyil chitra"));

        SongAdapter adapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter((ListAdapter) adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(SongActivity.this, PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });

    }
}
