package com.example.android.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView old = (TextView) findViewById(R.id.old);

        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, OldSongActivity.class);

                startActivity(numbersIntent);
            }
        });
        TextView medium = (TextView) findViewById(R.id.medium);

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, MediumSongActivity.class);

                startActivity(numbersIntent);
            }
        });
        TextView latest = (TextView) findViewById(R.id.latest);

        latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, LatestSongActivity.class);

                startActivity(numbersIntent);
            }
        });
        TextView remix = (TextView) findViewById(R.id.remix);

        remix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, RemixSongActivity.class);

                startActivity(numbersIntent);
            }
        });
    }
}