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
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight1)), (getActivity().getResources().getString(R.string.address_sight1)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight2)), (getActivity().getResources().getString(R.string.address_sight2)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight3)), (getActivity().getResources().getString(R.string.address_sight3)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight4)), (getActivity().getResources().getString(R.string.address_sight4)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight5)), (getActivity().getResources().getString(R.string.address_sight5)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight6)), (getActivity().getResources().getString(R.string.address_sight6)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight7)), (getActivity().getResources().getString(R.string.address_sight7)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight8)), (getActivity().getResources().getString(R.string.address_sight8)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight9)), (getActivity().getResources().getString(R.string.address_sight9)), R.drawable.ic_local_see_black_24dp));
        data.add(new Data((getActivity().getResources().getString(R.string.name_sight10)), (getActivity().getResources().getString(R.string.address_sight10)), R.drawable.ic_local_see_black_24dp));
        DataAdapter adapter = new DataAdapter(getActivity(), data, R.color.colorPrimaryDark);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
