package com.example.projectexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, String> > arrayList = new ArrayList<>();

    HashMap <String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        hashMap = new HashMap<>();
        hashMap.put("name","Sanikingsrs");
        hashMap.put("mobile","999");
        hashMap.put("email","sani@gmail.com");

        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Bil gates");
        hashMap.put("monile","111");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Elon Mask");
        hashMap.put("mobile","333");

        arrayList.add(hashMap);

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    }

    private class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            




            return null;
        }
    }


}