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
public class SightseeingFragment extends Fragment {


    public SightseeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        // Create a list of restaurants
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data("Schloss Schönbrunn", "Schönbrunner Schloßstraße 47, 1130 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Naschmarkt", "Naschmarkt, 1060 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Schloss Belvedere", "Prinz Eugen-Straße 27, 1030 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Stephansdom", "Stephansplatz 3, 1010 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Museumsquartier", "Museumsplatz 1, 1070 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Wiener Prater", "Prater, 1020 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Hofburg", "Michaelerkuppel, 1010 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Kunsthistorisches Museum", "Maria-Theresien-Platz, 1010 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Tiergarten Schönbrunn", "Maxingstraße 13b, 1130 Wien", R.drawable.ic_local_see_black_24dp));
        data.add(new Data("Albertina", "Albertinaplatz 1, 1010 Wien", R.drawable.ic_local_see_black_24dp));

        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
