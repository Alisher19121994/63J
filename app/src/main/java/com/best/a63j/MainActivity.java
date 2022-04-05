package com.best.a63j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.best.a63j.Adapter.AdapterA;
import com.best.a63j.Module.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
        ArrayList <Member> list = get();
        refresh(list);
    }

    public void open() {
        recyclerView  = findViewById(R.id.recyclerViewMain);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        recyclerView.setNestedScrollingEnabled(false);
    }

    public void refresh(ArrayList<Member> list) {
        AdapterA adapterA = new AdapterA(context, list);
        recyclerView.setAdapter(adapterA);

    }

    public ArrayList<Member> get() {
        ArrayList<Member> list = new ArrayList<Member>();

        for (int i = 0; i < 20; i++) {
            if (i == 1 || i == 10) {
                list.add(new Member("First screen", "Second Screen"));

            } else {
                list.add(new Member("First screen", "Second Screen"));

            }
        }
        return list;
    }
}