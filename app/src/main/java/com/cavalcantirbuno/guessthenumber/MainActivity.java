package com.cavalcantirbuno.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton= findViewById(R.id.start_button);

        startButton.setOnClickListener(v -> {
            Intent i  = new Intent(MainActivity.this, GameActivity.class);
            startActivity(i);
        });

    }



}