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

        ImageView image = convertView.findViewById(R.id.galleryPic);
        TextView text = convertView.findViewById(R.id.galleryName);

        Friend currentFriend = friends.get(position);

        

        image.setImageResource(currentFriend.getDrawableId());
        text.setText(currentFriend.getName());



        return convertView;
    }
}
