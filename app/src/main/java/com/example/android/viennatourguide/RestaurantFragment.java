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
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant1)), (getActivity().getResources().getString(R.string.address_restaurant1)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant2)), (getActivity().getResources().getString(R.string.address_restaurant2)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant3)), (getActivity().getResources().getString(R.string.address_restaurant3)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant4)), (getActivity().getResources().getString(R.string.address_restaurant4)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant5)), (getActivity().getResources().getString(R.string.address_restaurant5)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant6)), (getActivity().getResources().getString(R.string.address_restaurant6)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant7)), (getActivity().getResources().getString(R.string.address_restaurant7)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant8)), (getActivity().getResources().getString(R.string.address_restaurant8)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant9)), (getActivity().getResources().getString(R.string.address_restaurant9)), R.drawable.ic_local_dining_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_restaurant10)), (getActivity().getResources().getString(R.string.address_restaurant10)), R.drawable.ic_local_dining_black_24dp));
        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}