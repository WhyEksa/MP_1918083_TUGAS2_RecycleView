package com.wes.mp_1918083_tugas2_recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button LinearLayout,GridLayout,StaggeredLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout = findViewById(R.id.LinearLayoutManager);
        GridLayout = findViewById(R.id.GridLayoutManager);
        StaggeredLayout = findViewById(R.id.StaggeredGridLayoutManager);

        LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinearLayout = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(LinearLayout);
            }
        });
        GridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GridLayout = new Intent(MainActivity.this, GridLayout.class);
                startActivity(GridLayout);
            }
        });
        StaggeredLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StaggeredLayout = new Intent(MainActivity.this, StaggeredLayout.class);
                startActivity(StaggeredLayout);
            }
        });

    }
}