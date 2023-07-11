package com.example.honpoll_tst;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.honpoll_tst.ui.dashboard.DashboardFragment;
import com.example.honpoll_tst.ui.dashboard.DashboardViewModel;
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
    private Button voteabayi;


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

//        voteabayi.setOnClickListener(view -> {
//            CardView cardView = new CardView(MainActivity.this);
//            cardView.setCardBackgroundColor(Color.WHITE);
//            cardView.setRadius(10.0f);
//            // Add some text to the card
//            TextView textView = new TextView(MainActivity.this);
//            textView.setText("This is a card!");
//            textView.setTextColor(Color.BLACK);
//            // Add the text view to the card
//            cardView.addView(textView);
//            // Add the card to the layout
//            LinearLayout layout = findViewById(R.id.navigation_dashboard);
//            layout.addView(cardView);
//        });
    }

    public void initUI(){
        voteabayi = findViewById(R.id.abayibutton);
        president = findViewById(R.id.president);
        vicepres = findViewById(R.id.vicepres);
        secretary = findViewById(R.id.secretary);
    }




}