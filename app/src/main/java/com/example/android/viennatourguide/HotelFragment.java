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
        data.add(new Data("Hollmann Beletage Design & Boutique Hotel", "Köllnerhofgasse 6, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Hotel Sacher Wien", "Philharmoniker-Straße 4, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Boutiquehotel Das Tyrol", "Mariahilfer Straße 15, 1060 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("The Guesthouse Vienna", "Führichgasse 10, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Park Hyatt Vienna", "Am Hof 2, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Hotel Imperial", "Kärntner Ring 16, 1015 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Hotel Am Stephansplatz", "Stephansplatz 9, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Sofitel Vienna Stephansdom", "Praterstraße 1, 1020 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("The Ritz-Carlton", "Schubertring 5-7, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));
        data.add(new Data("Steigenberger Hotel Herrenhof", "Herrengasse 10, 1010 Wien", R.drawable.ic_local_hotel_black_24dp, 25.093163, 55.159065));

        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    }



