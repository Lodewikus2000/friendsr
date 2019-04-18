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

            String[] pictureNames = {"arya", "cersei", "daenerys", "jaime", "jon", "jorah", "margaery", "melisandre", "sansa", "tyrion"};
            String[] names = {"Arya Stark", "Cersei Lannister", "Daenerys Targaryen", "Jaime Lannister", "Jon Snow", "Jorah of Mormont", "Margaery Tyrell", "Melisandre", "Sansa Stark", "Tyrion Lannister"};
            String[] biographies = {"She is no one.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "Protector of the realm.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "I am the Mother of dragons.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "A.K.A. Kingslayer.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "I don't know anything.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "Please donate to the greyscale survivors fund.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "I was one of the coolest but now I'm dead.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "Meh.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "I was married to Tyrion and now I'm badass.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
                    "I drink and I know things.\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis egestas euismod sem et gravida. In hac habitasse platea dictumst. Nam sit amet pharetra nunc. Suspendisse ac diam at tellus viverra tristique eu in massa. Mauris ac quam varius, tristique libero nec, commodo dolor. Ut at ligula efficitur, sagittis arcu a, fringilla lorem. Nunc viverra augue eu turpis pharetra, quis viverra libero maximus. Etiam fermentum ipsum eget urna commodo, sit amet sagittis elit varius.\n Fusce rutrum efficitur commodo. Fusce vel neque lacus. Ut mattis, lacus nec efficitur ultricies, sapien quam dignissim urna, ut condimentum magna massa at risus. Aliquam arcu neque, placerat at interdum lobortis, imperdiet et felis. Proin a ligula sapien. Aliquam id diam non sem hendrerit congue ac quis mi. Nunc ac quam gravida, imperdiet tellus eget, rhoncus odio. Ut in nibh mattis, fermentum turpis et, malesuada justo.",
            };

            int counter = 0;
            for (String name : pictureNames) {
                int pictureInt = this.getResources().getIdentifier(name, "drawable", getPackageName());
                Friend currentFriend = new Friend(names[counter], biographies[counter], pictureInt);
                friends.add(currentFriend);
                counter++;
            }
        } else {
            friends = (ArrayList<Friend>) savedInstanceState.getSerializable("friends");
        }

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        GridView grid = findViewById(R.id.mainGrid);
        grid.setAdapter(adapter);


        // Listener for clicks on the individual tiles in the grid.
        GridView gv = findViewById(R.id.mainGrid);
        gv.setOnItemClickListener(new GridItemClickListener());

    }


    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Log.d("click", "user clicked on " + clickedFriend.getName());

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
