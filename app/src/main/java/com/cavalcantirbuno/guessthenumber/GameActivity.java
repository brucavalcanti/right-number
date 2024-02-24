package com.cavalcantirbuno.guessthenumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

   private TextView secretNumber;
   private EditText playerNumber;
   private Button guessButton,tryAgain;

   private int number;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        secretNumber = findViewById(R.id.text_secretNumber);
        playerNumber = findViewById(R.id.player_guess);
        guessButton = findViewById(R.id.guessButton);
        tryAgain = findViewById(R.id.btn_tryAgain);
        tryAgain.setVisibility(View.INVISIBLE);

        number = new Random().nextInt(101);

        guessButton.setOnClickListener(v -> {

            String hintNumber = playerNumber.getText().toString();

            if(!hintNumber.isEmpty()){

                if( Integer.parseInt(hintNumber) == number)
                {
                    secretNumber.setText("Você acertou era: " + number);
                    guessButton.setVisibility(View.INVISIBLE);
                    tryAgain.setVisibility(View.VISIBLE);

                }else
                {
                    secretNumber.setText("Você errou era : " + number);
                    guessButton.setVisibility(View.INVISIBLE);
                    tryAgain.setVisibility(View.VISIBLE);
                }
            }else
            {
                Toast toast;
                toast = Toast.makeText(GameActivity.this,"Digite um valor",
                        Toast.LENGTH_LONG);
                toast.show();
            }

        });

        tryAgain.setOnClickListener(v -> {
            recreate();
        });

    }

}
