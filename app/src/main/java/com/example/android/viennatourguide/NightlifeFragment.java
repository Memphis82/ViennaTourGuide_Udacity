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
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar1)), (getActivity().getResources().getString(R.string.address_hotel1)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar2)), (getActivity().getResources().getString(R.string.address_hotel2)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar3)), (getActivity().getResources().getString(R.string.address_hotel3)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar4)), (getActivity().getResources().getString(R.string.address_hotel4)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar5)), (getActivity().getResources().getString(R.string.address_hotel5)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar6)), (getActivity().getResources().getString(R.string.address_hotel6)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar7)), (getActivity().getResources().getString(R.string.address_hotel7)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar8)), (getActivity().getResources().getString(R.string.address_hotel8)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar9)), (getActivity().getResources().getString(R.string.address_hotel9)), R.drawable.ic_local_bar_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_bar10)), (getActivity().getResources().getString(R.string.address_hotel10)), R.drawable.ic_local_bar_black_24dp));
        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}