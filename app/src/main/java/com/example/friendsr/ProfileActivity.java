package com.example.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    Friend retrievedFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Intent intent = getIntent();
        retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");


        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        float storedRating = prefs.getFloat(retrievedFriend.getName() + "rating", -1);


        TextView profileName = findViewById(R.id.profileName);
        profileName.setText(retrievedFriend.getName());

        ImageView profilePic = findViewById(R.id.profilePic);
        profilePic.setImageResource(retrievedFriend.getDrawableId());

        TextView profileText = findViewById(R.id.profileText);
        profileText.setText(retrievedFriend.getBio());


        RatingBar profileRating = findViewById(R.id.ratingBar);
        if (storedRating != -1) {
            profileRating.setRating(storedRating);
        } else {
            Log.d("rating", "no saved rating was found");
        }

        profileRating.setOnRatingBarChangeListener(new OnRatingBarChangeListener());
    }


    private class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener{
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();

            editor.putFloat(retrievedFriend.getName() + "rating", rating);
            editor.apply();

            Log.d("rating", "we should have just saved a rating");
        }
    }

}
