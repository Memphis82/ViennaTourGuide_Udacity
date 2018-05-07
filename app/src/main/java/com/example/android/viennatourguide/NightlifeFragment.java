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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        // Create a list of restaurants
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data("Look Bar", "Salzgries 17, 1010 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("First Floor", "Seitenstettengasse 5, 1010 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("If Dogs Run Free", "Gumpendorfer Straße 10, 1060 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("Chillout Lounge", "Salvatorgasse 6, 1010 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("Kruger’s American Bar", "Krugerstraße 5, 1010 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("Lutz Bar", "Mariahilfer Straße 3, 1060 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("25hours Hotel Dachboden", "Lerchenfelderstraße 1-3, 1070 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("Loosbar", "Kärntner Durchgang 10, 1010 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("Puff Bar", "Girardigasse 10, 1060 Wien", R.drawable.ic_local_bar_black_24dp));
        data.add(new Data("The Sign", "Liechtensteinstraße 104 – 106", R.drawable.ic_local_bar_black_24dp));

        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}