package com.lex.alcon.alejandro.lex.cardviewcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<String> tittle=new ArrayList<>();
    ArrayList<Integer> imgmini=new ArrayList<>();
    ArrayList<Integer> imgcentral=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittle.clear();
        imgmini.clear();
        imgcentral.clear();

        tittle.add("Abuelita");
        imgmini.add(R.drawable.abuelita);
        imgcentral.add(R.drawable.bosque);

        tittle.add("Rubia");
        imgmini.add(R.drawable.choca);
        imgcentral.add(R.drawable.cielito);

        tittle.add("Universitaria");
        imgmini.add(R.drawable.estudiosa);
        imgcentral.add(R.drawable.eifel);

        tittle.add("Varon");
        imgmini.add(R.drawable.libro);
        imgcentral.add(R.drawable.grito);

        tittle.add("Morocha");
        imgmini.add(R.drawable.morocha);
        imgcentral.add(R.drawable.musica);









        recyclerView=findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);//***************
        recyclerView.setLayoutManager(layoutManager);

        adapter=new RecyclerAdapter(this,tittle,imgmini,imgcentral);
        recyclerView.setAdapter(adapter);
    }
}
