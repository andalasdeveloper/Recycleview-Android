package com.dicoding.assosiate.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.assosiate.recyclerviewapp.adapter.ListPresidentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCatergory;
    private ArrayList<PresidentData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCatergory = findViewById(R.id.rv_category);
        rvCatergory.setHasFixedSize(true);

        list.addAll(PresidentData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvCatergory.setLayoutManager(new LinearLayoutManager(this));
        ListPresidentAdapter listPresidentAdapter = new ListPresidentAdapter(this);
        listPresidentAdapter.setListPresident(list);
        rvCatergory.setAdapter(listPresidentAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_list:
                break;
            case R.id.action_grid :
                break;
            case R.id.action_cardview:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
