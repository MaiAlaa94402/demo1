package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity4 extends AppCompatActivity {
    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    content o[];

    String s1[],s2[];
    int images[]={R.drawable.brokenicon,R.drawable.brokenicon,R.drawable.download,R.drawable.brokenicon,R.drawable.brokenicon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ButterKnife.bind(this);

        s1=getResources().getStringArray(R.array.names);
        s2=getResources().getStringArray(R.array.project);
        o=new content[s1.length];
        for(int i=0; i<s1.length;i++){
            o[i]=new content(s1[i],s2[i],images[i]);
        }

        MyAdapter myAdapter=new MyAdapter(this,o);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}