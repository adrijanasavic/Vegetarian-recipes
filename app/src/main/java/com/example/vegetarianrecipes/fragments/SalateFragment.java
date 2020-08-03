package com.example.vegetarianrecipes.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.adapters.SalateAdapter;
import com.example.vegetarianrecipes.objects.Jela;

import java.util.ArrayList;
import java.util.List;


public class SalateFragment extends Fragment {

    private List<Jela> salate;

    private static final int SALATE = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_item, container, false );

        getActivity().setTitle( getString( R.string.salate ) );

        RecyclerView recyclerView = rootView.findViewById( R.id.recyclerview );
        int numberOfColumns = 2;
        GridLayoutManager layoutManager = new GridLayoutManager( getActivity(), numberOfColumns );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( layoutManager );

        salate = new ArrayList<>();

        addAttractions();

        recyclerView.setAdapter( new SalateAdapter( getActivity(), salate, SALATE ) );

        return rootView;
    }


    private void addAttractions() {
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata1 ),
                getString( R.string.salata1_opis ),
                getString( R.string.salata1_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata2 ),
                getString( R.string.salata2_opis ),
                getString( R.string.salata2_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata3 ),
                getString( R.string.salata3_opis ),
                getString( R.string.salata3_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata4 ),
                getString( R.string.salata4_opis ),
                getString( R.string.salata4_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata5 ),
                getString( R.string.salata5_opis ),
                getString( R.string.salata5_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata6 ),
                getString( R.string.salata6_opis ),
                getString( R.string.salata6_opis_detalji ) ) );
        salate.add( new Jela( R.drawable.vege,
                getString( R.string.salata7 ),
                getString( R.string.salata7_opis ),
                getString( R.string.salata7_opis_detalji ) ) );
    }
}
