package com.example.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            int aryaInt = this.getResources().getIdentifier("@drawable/arya", "drawable", "android.demo");
            Friend arya = new Friend("Arya Stark", "She is no one.", aryaInt);
            friends.add(arya);

            int cerseiInt = this.getResources().getIdentifier("cersei", "drawable", "android.demo");
            Friend cersei = new Friend("Cersei Lannister", "Protector of the realm.", cerseiInt);
            friends.add(cersei);

            int daenerysInt = this.getResources().getIdentifier("daenerys", "drawable", "android.demo");
            Friend daenerys = new Friend("Daenerys Targaryen", "Mother of dragons.", daenerysInt);
            friends.add(daenerys);

            int jaimeInt = this.getResources().getIdentifier("jaime", "drawable", "android.demo");
            Friend jaime = new Friend("Jaime Lannister", "Kingslayer.", jaimeInt);
            friends.add(jaime);

            int jonInt = this.getResources().getIdentifier("jon", "drawable", "android.demo");
            Friend jon = new Friend("Jon Snow", "Knows nothing.", jonInt);
            friends.add(jon);

            int jorahInt = this.getResources().getIdentifier("jorah", "drawable", "android.demo");
            Friend jorah = new Friend("Jorah of Mormont", "Greyscale survivor.", jorahInt);
            friends.add(jorah);

            int margaeryInt = this.getResources().getIdentifier("margaery", "drawable", "android.demo");
            Friend margaery = new Friend("Margaery Tyrell", "Died.", margaeryInt);
            friends.add(margaery);

            int melisandreInt = this.getResources().getIdentifier("melisandre", "drawable", "android.demo");
            Friend melisandre = new Friend("Melisandre", "Annoying.", melisandreInt);
            friends.add(melisandre);

            int sansaInt = this.getResources().getIdentifier("sansa", "drawable", "android.demo");
            Friend sansa = new Friend("Sansa Stark", "Used to be married to Tyrion.", sansaInt);
            friends.add(sansa);

            int tyrionInt = this.getResources().getIdentifier("tyrion", "drawable", "android.demo");
            Friend tyrion = new Friend("Tyrion Lannister", "Drinks and knows things.", tyrionInt);
            friends.add(tyrion);
        }


        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        GridView gridje = findViewById(R.id.mainGrid);
        gridje.setAdapter(adapter);


    }
}
