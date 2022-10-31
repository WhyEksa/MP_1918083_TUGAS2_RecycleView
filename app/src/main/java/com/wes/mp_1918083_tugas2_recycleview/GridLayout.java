package com.wes.mp_1918083_tugas2_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class GridLayout extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        recyclerView = findViewById(R.id.recyclerViewGrid);
        recyclerView.setHasFixedSize(true);

        recylerViewLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, GridLayoutManager.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i < MyItem.Headline.length; i++) {
            data.add(new ItemModel(
                    MyItem.Headline[i],
                    MyItem.Subhead[i],
                    MyItem.iconList[i]
            ));
        }

        recyclerViewAdapter = new AdapterRecyclerViewGrid(data);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}