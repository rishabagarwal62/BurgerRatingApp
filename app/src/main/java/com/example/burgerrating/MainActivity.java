package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar= findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void Submit(View view){

        float ratingValue = ratingBar.getRating();

        if (ratingValue < 2){
            textView.setText("Rating: " + ratingValue + "\nWe will try better next time");
        }
        else if (ratingValue <=3 && ratingValue>=2){
            textView.setText("Rating: " + ratingValue + "\nWe are constantly improving");
        }
        else if (ratingValue <=4 && ratingValue >=3){
            textView.setText("Rating: " + ratingValue + "\nThanks! Will make it better");
        }
        else
            textView.setText("Rating: " + ratingValue + "\nExcellent! We love our customer");

    }
}
