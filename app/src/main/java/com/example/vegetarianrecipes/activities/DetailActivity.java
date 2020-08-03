package com.example.vegetarianrecipes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vegetarianrecipes.R;

public class DetailActivity extends AppCompatActivity {
    private String opis;


    private int kategorija;

    private static final int PREDJELA = 1;
    private static final int GLAVNA_JELA = 2;
    private static final int SALATE = 3;
    private static final int DEZERTI = 4;

    private static final int DEFAULT_NUMBER = 0;
    private static final int NO_IMAGE_PROVIDED = -1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );


        Intent detailIntent = getIntent();

        kategorija = detailIntent.getIntExtra( getString( R.string.kategorija ), DEFAULT_NUMBER );

        int imageId = detailIntent.getIntExtra( getString( R.string.image_id ), NO_IMAGE_PROVIDED );
        String name = detailIntent.getStringExtra( getString( R.string.naziv ) );
        opis = detailIntent.getStringExtra( getString( R.string.opis ) );


        setTitle( name );

        ImageView imageView = findViewById( R.id.detalji_image_view );
        imageView.setImageResource( imageId );

        setDescriptionTextView();


    }


    private void setDescriptionTextView() {

        TextView descriptionTextView = findViewById( R.id.detaljiiii_opis );


        descriptionTextView.setText( opis );

        switch (kategorija) {
            case PREDJELA:
                descriptionTextView.setBackgroundResource( R.color.color_predjelo );
                descriptionTextView.setTextColor( getResources().getColor( R.color.color_predjelo_tekst ) );
                break;

            case GLAVNA_JELA:
                descriptionTextView.setBackgroundResource( R.color.color_glavno_jelo );
                descriptionTextView.setTextColor( getResources().getColor( R.color.color_glavno_jelo_tekst ) );
                break;

            case SALATE:
                descriptionTextView.setBackgroundResource( R.color.color_salate );
                descriptionTextView.setTextColor( getResources().getColor( R.color.color_salate_tekst ) );
                break;

            case DEZERTI:
                descriptionTextView.setBackgroundResource( R.color.color_dezert );
                descriptionTextView.setTextColor( getResources().getColor( R.color.color_dezert_text ) );
                break;

            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected( item );
    }
}