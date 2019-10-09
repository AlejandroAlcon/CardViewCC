package com.lex.alcon.alejandro.lex.cardviewcc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{

    ArrayList<String> tittle=new ArrayList<>();
    ArrayList<Integer> imgmini=new ArrayList<>();
    ArrayList<Integer> imgcentral=new ArrayList<>();
    Context context;

    public RecyclerAdapter(Context acontext,ArrayList<String> atittle,
                           ArrayList<Integer> aimgmini,ArrayList<Integer> aimgcentral)
    {
        this.context=acontext;
        this.tittle=atittle;
        this.imgmini=aimgmini;
        this.imgcentral=aimgcentral;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        RecyclerAdapter.ViewHolder viewHolder=new RecyclerAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position)
    {
        viewHolder.txtvTittle.setText(tittle.get(position));
        viewHolder.imgvPhotoMini.setImageResource(imgmini.get(position));
        viewHolder.imgvPhotoCentral.setImageResource(imgcentral.get(position));


    }

    @Override
    public int getItemCount() {
        return tittle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtvTittle;
        ImageView imgvPhotoMini;
        ImageView imgvPhotoCentral;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtvTittle=itemView.findViewById(R.id.textViewTittleCard);
            imgvPhotoMini=itemView.findViewById(R.id.imageViewPhotoCard);
            imgvPhotoCentral=itemView.findViewById(R.id.imageViewPhotoCentralCard);
        }
    }
}
