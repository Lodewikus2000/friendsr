package com.example.friendsr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    private int resource;
    private ArrayList<Friend> friends;

    // constructor
    public FriendsAdapter(Context context, int resource, ArrayList<Friend> objects) {
        super(context, resource, objects);

        this.friends = objects;
        this.resource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // Get the views for the image and text so we can fill them.
        ImageView image = convertView.findViewById(R.id.galleryPic);
        TextView text = convertView.findViewById(R.id.galleryName);

        // Get the friend that we will use to fill the views with.
        Friend currentFriend = friends.get(position);

        // Give the grid item at position the correct picture and name.
        image.setImageResource(currentFriend.getDrawableId());
        text.setText(currentFriend.getName());


        return convertView;
    }
}
