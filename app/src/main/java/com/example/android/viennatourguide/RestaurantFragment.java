package com.example.android.viennatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        // Create a list of restaurants
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data("Spelunke", "Taborstraße 1, 1020 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Flatchers Steakhouse", "Kaiserstraße 113-115, 1070 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Weinschenke", "Franzensgasse 11, 1050 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Gasthaus Wild", "Radetzkyplatz 1, 1030 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Skopik & Lohn", "Leopoldsgasse 17, 1020 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Wein.Raum", "Piaristengasse 41, 1080 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("1500 Foodmakers", "Lerchenfelder Strasse 1-3, 1070 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Zum alten Fassl", "Ziegelofengasse 37, 1050 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Kent", "Brunnengasse 67, 1160 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Plachuttas Gasthaus zur Oper", "Walfischgasse 5-7, 1010 Wien", R.drawable.ic_local_dining_black_24dp, 25.093163, 55.159065));

        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}