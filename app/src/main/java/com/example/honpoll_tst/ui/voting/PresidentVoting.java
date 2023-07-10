package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.honpoll_tst.R;

public class PresidentVoting extends Activity {
    private Button saveandcontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presidentvoting);

        initUI();

        saveandcontinue.setOnClickListener(view -> startActivity(new Intent(PresidentVoting.this, ViceVoting.class)));

    }

    public void initUI(){
        saveandcontinue = findViewById(R.id.savecon);
    }
}
