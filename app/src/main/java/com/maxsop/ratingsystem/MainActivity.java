package com.maxsop.ratingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find
        ratingBar = findViewById(R.id.rb_id);
        textView = findViewById(R.id.tv_id);

        // set rating
        ratingBar.setRating(Float.parseFloat("3.0"));

        // show rating
        textView.setText(ratingBar.getRating() + "/" + ratingBar.getNumStars());

        // work with rating bar
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(rating + "/" + ratingBar.getNumStars());
            }
        });

    }


}
