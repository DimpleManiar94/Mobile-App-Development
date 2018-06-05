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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FastfoodFragment extends Fragment{
    private String fastfood[] = {"apple", "banana"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fastfood_fragment, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.fastfoodListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), R.layout.list_item_layout, fastfood);
        lv.setAdapter(adapter);

        return rootView;
    }

    private void setUpDatabase(){



    }
    private String[] getFruits(){
        return fastfood;

    }

    @Override
    public String toString() {
        String title = "FastFood";
        return title;
    }
}
