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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        // Create a hotellist
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data("Steigenberger", "Herrengasse", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Hilton", "Ring", -1, 25.093163, 55.159065));
        data.add(new Data("Ritz", "Donauufer", -1, 25.093163, 55.159065));
        data.add(new Data("25 Hours", "Graben", -1, 25.093163, 55.159065));
        data.add(new Data("Imperial", "Schottentor", -1, 25.093163, 55.159065));
        data.add(new Data("Steigenberger", "Herrengasse", -1, 25.093163, 55.159065));
        data.add(new Data("Hilton", "Ring", -1, 25.093163, 55.159065));
        data.add(new Data("Ritz", "Donauufer", -1, 25.093163, 55.159065));
        data.add(new Data("25 Hours", "Graben", -1, 25.093163, 55.159065));
        data.add(new Data("Imperial", "Schottentor", -1, 25.093163, 55.159065));

        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    }



