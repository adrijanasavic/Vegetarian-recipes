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


public class SalateAdapter extends RecyclerView.Adapter<SalateAdapter.ViewHolder> {
    private Context mContext;
    private List<Jela> mJela;

    private int mKategorija;

    public SalateAdapter(Context context, List<Jela> jela, int kategorija) {
        this.mContext = context;
        this.mJela = jela;
        this.mKategorija = kategorija;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.card_item_salate, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public int getItemCount() {
        return mJela.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nazivTextView;
        private CardView cardView;

        ViewHolder(View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.salate_slika );
            nazivTextView = itemView.findViewById( R.id.salate_naziv );
            cardView = itemView.findViewById( R.id.cardview_salate );
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Jela jela = mJela.get( position );
        Drawable drawable = ContextCompat.getDrawable( mContext, jela.getmJelaSlikaId() );
        holder.imageView.setBackground( drawable );
        holder.nazivTextView.setText( jela.getmJelaNaziv() );
        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
    }
}
