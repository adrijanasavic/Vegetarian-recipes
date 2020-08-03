package com.example.vegetarianrecipes.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.fragments.GlavnaJelaFragment;
import com.example.vegetarianrecipes.fragments.InformacijeFragment;
import com.example.vegetarianrecipes.fragments.PredjelaFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        drawerLayout = findViewById( R.id.drawer_layout );
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawerLayout.addDrawerListener( actionBarDrawerToggle );
        actionBarDrawerToggle.syncState();

        navigationView = findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );

        if (savedInstanceState == null) {
            onNavigationItemSelected( navigationView.getMenu().getItem( 0 ).setChecked( true ) );
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_info) {
            fragmentManager.beginTransaction()
                    .replace( R.id.content_fragment, new InformacijeFragment() )
                    .commit();

        } else if (id == R.id.predjela) {
            fragmentManager.beginTransaction()
                    .replace( R.id.content_fragment, new PredjelaFragment() )
                    .commit();

        } else if (id == R.id.glavna_jela) {
            fragmentManager.beginTransaction()
                    .replace( R.id.content_fragment, new GlavnaJelaFragment() )
                    .commit();
        }
        DrawerLayout drawer = findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }


}