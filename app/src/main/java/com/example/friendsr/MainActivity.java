package com.example.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            int aryaInt = this.getResources().getIdentifier("arya", "drawable", getPackageName());
            Friend arya = new Friend("Arya Stark", "She is no one.\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n" +
                    "\n" +
                    "Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.", aryaInt);
            friends.add(arya);

            int cerseiInt = this.getResources().getIdentifier("cersei", "drawable", getPackageName());
            Friend cersei = new Friend("Cersei Lannister", "Protector of the realm.", cerseiInt);
            friends.add(cersei);

            int daenerysInt = this.getResources().getIdentifier("daenerys", "drawable", getPackageName());
            Friend daenerys = new Friend("Daenerys Targaryen", "Mother of dragons.", daenerysInt);
            friends.add(daenerys);

            int jaimeInt = this.getResources().getIdentifier("jaime", "drawable", getPackageName());
            Friend jaime = new Friend("Jaime Lannister", "Kingslayer.", jaimeInt);
            friends.add(jaime);

            int jonInt = this.getResources().getIdentifier("jon", "drawable", getPackageName());
            Friend jon = new Friend("Jon Snow", "Knows nothing.", jonInt);
            friends.add(jon);

            int jorahInt = this.getResources().getIdentifier("jorah", "drawable", getPackageName());
            Friend jorah = new Friend("Jorah of Mormont", "Greyscale survivor.", jorahInt);
            friends.add(jorah);

            int margaeryInt = this.getResources().getIdentifier("margaery", "drawable", getPackageName());
            Friend margaery = new Friend("Margaery Tyrell", "Died.", margaeryInt);
            friends.add(margaery);

            int melisandreInt = this.getResources().getIdentifier("melisandre", "drawable", getPackageName());
            Friend melisandre = new Friend("Melisandre", "Annoying.", melisandreInt);
            friends.add(melisandre);

            int sansaInt = this.getResources().getIdentifier("sansa", "drawable", getPackageName());
            Friend sansa = new Friend("Sansa Stark", "Used to be married to Tyrion.", sansaInt);
            friends.add(sansa);

            int tyrionInt = this.getResources().getIdentifier("tyrion", "drawable", getPackageName());
            Friend tyrion = new Friend("Tyrion Lannister", "Drinks and knows things.", tyrionInt);
            friends.add(tyrion);
        } else {
            friends = (ArrayList<Friend>) savedInstanceState.getSerializable("friends");
        }

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        GridView gridje = findViewById(R.id.mainGrid);
        gridje.setAdapter(adapter);


        // Listener for clicks on the individual tiles in the grid.
        GridView gv = findViewById(R.id.mainGrid);
        gv.setOnItemClickListener(new GridItemClickListener());

    }


    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Log.d("click", "we clicked in the grid!" + clickedFriend.getName());

            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);
        }
    }



    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putSerializable("friends", friends);

    }

}
