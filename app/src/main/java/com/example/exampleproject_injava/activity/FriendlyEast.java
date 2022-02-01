package com.example.exampleproject_injava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import com.example.exampleproject_injava.R;
import com.example.exampleproject_injava.activity.adapter.CustomAdapter;
import com.example.exampleproject_injava.activity.listener.onBottomReachedListener;
import com.example.exampleproject_injava.activity.model.Friendly;

import java.util.ArrayList;
import java.util.List;

public class FriendlyEast extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    int positions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<Friendly> members = prepareMemerList();

        refreshAdapter(members);
    }

    private List<Friendly> prepareMemerList() {
        List<Friendly> members = new ArrayList<>();
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img1));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img3));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img4));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img5));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img6));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img7));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img8));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img9));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img10));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img11));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img12));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img13));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img14));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img15));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img16));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img17));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img18));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img19));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img20));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img21));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img22));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img23));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img24));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img25));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img26));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img27));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img28));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img29));
            members.add(new Friendly("Ilhombek" , "Ubaydullayev" ,R.drawable.img30));

        return members;
    }

    private void refreshAdapter(List<Friendly> members) {
        CustomAdapter adapter = new CustomAdapter(members,context,new onBottomReachedListener(){

            @Override
            public void onBottomReached(int position) {
                Log.d("@@@","@@@position"+position);
            }
        });


        recyclerView.setAdapter(adapter);
    }

    private void initView() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        }
    }

}