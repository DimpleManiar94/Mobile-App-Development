package com.example.dimple.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;

public class DryfruitsFragment extends Fragment{

    FirebaseDatabase mFireBaseDatabase;
    DatabaseReference databaseDryFruits;

    private String dryfruits[] = {"apple", "banana"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpDatabase();
        View rootView = inflater.inflate(R.layout.dryfruits_fragment, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.dryfruitsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), R.layout.list_item_layout, dryfruits);
        lv.setAdapter(adapter);

        return rootView;
    }

    private void setUpDatabase(){
        mFireBaseDatabase = FirebaseDatabase.getInstance();
        databaseDryFruits = mFireBaseDatabase.getReference("product");

        databaseDryFruits.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                

            }
        });


    }

    private String[] getDryfruits(){
        return dryfruits;

    }

    @Override
    public String toString() {
        String title = "Dry Fruits";
        return title;
    }
}
