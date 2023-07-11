package com.example.honpoll_tst;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.honpoll_tst.ui.voting.PresidentVoting;
import com.example.honpoll_tst.ui.voting.SecVoting;
import com.example.honpoll_tst.ui.voting.ViceVoting;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.honpoll_tst.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private CardView president, vicepres, secretary;


    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        initUI();

        president.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, PresidentVoting.class)));
        vicepres.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, PresidentVoting.class)));
        secretary.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, PresidentVoting.class)));
    }

    public void initUI(){
        president = findViewById(R.id.president);
        vicepres = findViewById(R.id.vicepres);
        secretary = findViewById(R.id.secretary);
    }




}