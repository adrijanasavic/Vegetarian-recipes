package com.example.vegetarianrecipes.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.adapters.RecyclerAdapter;
import com.example.vegetarianrecipes.objects.Jela;

import java.util.ArrayList;
import java.util.List;


public class GlavnaJelaFragment extends Fragment {

    private List<Jela> glavna_jela;

    private static final int GLAVNA_JELA = 2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_item, container, false );

        getActivity().setTitle( getString( R.string.glavna_jela ) );

        RecyclerView recyclerView = rootView.findViewById( R.id.recyclerview );
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( layoutManager );

        glavna_jela = new ArrayList<>();

        addAttractions();

        recyclerView.setAdapter( new RecyclerAdapter( getActivity(), glavna_jela, GLAVNA_JELA ) );

        return rootView;
    }

    private void addAttractions() {
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo1 ),
                getString( R.string.glavno_jelo1_opis ),
                getString( R.string.glavno_jelo1_detail_opis ) ) );
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo2 ),
                getString( R.string.glavno_jelo2_opis ),
                getString( R.string.glavno_jelo2_detail_opis ) ) );
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo3 ),
                getString( R.string.glavno_jelo3_opis ),
                getString( R.string.glavno_jelo3_detail_opis ) ) );
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo4 ),
                getString( R.string.glavno_jelo4_opis ),
                getString( R.string.glavno_jelo4_detail_opis ) ) );
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo5 ),
                getString( R.string.glavno_jelo5_opis ),
                getString( R.string.glavno_jelo5_detail_opis ) ) );
        glavna_jela.add( new Jela( R.drawable.vege,
                getString( R.string.glavno_jelo6 ),
                getString( R.string.glavno_jelo6_opis ),
                getString( R.string.glavno_jelo6_detail_opis ) ) );
    }
}
