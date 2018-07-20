package com.example.android.musi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Meenakshi on 7/9/2018.
 */

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Song> songList = new ArrayList<>();
        songList.add(new Song("Hiphop thamizha", "Vadi pulla vadi"));
        songList.add(new Song("Shankar mahadhevan", "Vaadi en thanga selai"));
        songList.add(new Song("Anuradha sriram", "Anbendra mazhaiyle"));
        songList.add(new Song("Vandhana srinivasan", "karuvakkatu karuvaya"));
        songList.add(new Song("Ananthu", "Maya nadhi"));
        songList.add(new Song("Alap raju", "Ennamo edho"));
        songList.add(new Song("Thippu", "Ennai konjam maatri"));
        songList.add(new Song("Chinnakuyil chitra", "Malargal ketten"));
        SongAdapter adapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ArtistActivity.this, PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });
    }
}
