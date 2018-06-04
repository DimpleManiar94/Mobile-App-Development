package com.example.dimple.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SnacksFragment extends Fragment {
    private String snacks[] = {"apple", "banana"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.snacks_fragment, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.snacksListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), R.layout.list_item_layout, snacks);
        lv.setAdapter(adapter);

        return rootView;
    }

    private String[] getFruits(){
        return snacks;

    }

    @Override
    public String toString() {
        String title = "Snacks";
        return title;
    }
}
