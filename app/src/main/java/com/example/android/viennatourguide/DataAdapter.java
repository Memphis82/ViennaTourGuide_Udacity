package com.example.android.viennatourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {

    /**
     * mColorResourceId is used to store the color of the list item.
     */
    private int mColorResourceId;

    /**
     * Constructor used to initialise the Data object.
     *
     * @param context
     * @param data
     * @param colorResourceId
     */
    public DataAdapter(Activity context, ArrayList<Data> data, int colorResourceId) {
        super(context, 0, data);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Data currentHotel = getItem(position);
//
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentHotel.getName());
        TextView locationTextView = listItemView.findViewById(R.id.location);
        locationTextView.setText(currentHotel.getLocation());
        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentHotel.hasImage()) {
            imageView.setImageResource(currentHotel.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
