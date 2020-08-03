package com.example.vegetarianrecipes.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.objects.Jela;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<Jela> mJela;

    private int mKategorija;

    public RecyclerAdapter(Context context, List<Jela> jela, int kategorija) {
        this.mContext = context;
        this.mJela = jela;
        this.mKategorija = kategorija;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.card_item, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public int getItemCount() {
        return mJela.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nazivTextView;
        private TextView kratakOpisTextView;
        private CardView cardView;

        ViewHolder(View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.attraction_image_card );
            nazivTextView = itemView.findViewById( R.id.naziv_card );
            kratakOpisTextView = itemView.findViewById( R.id.kratak_opis_card );
            cardView = itemView.findViewById( R.id.cardview );
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Jela jela = this.mJela.get( position );
        Drawable drawable = ContextCompat.getDrawable( mContext, jela.getmJelaSlikaId() );
        holder.imageView.setBackground( drawable );
        holder.nazivTextView.setText( jela.getmJelaNaziv() );
        holder.kratakOpisTextView.setText( jela.getmJelaKratakOpis() );
        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
    }
}