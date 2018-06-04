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

public class FrozenFragment extends Fragment {
    private String frozen[] = {"apple", "banana"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frozen_fragment, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.frozenListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), R.layout.list_item_layout, frozen);
        lv.setAdapter(adapter);

        return rootView;
    }

    private String[] getFruits(){
        return frozen;

    }

    @Override
    public String toString() {
        String title = "Frozen Food";
        return title;
    }
}
