package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.honpoll_tst.R;


public class ViceVoting extends Activity {

    private Button SaveNcontinue, votebayiv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vicevoting);
        initUI();

        SaveNcontinue.setOnClickListener(view -> startActivity(new Intent(ViceVoting.this, SecVoting.class)));
        votebayiv.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "vote registered!", Toast.LENGTH_SHORT).show();
        });
}

    public void initUI(){
        votebayiv = findViewById(R.id.votabayiv);
        SaveNcontinue = findViewById(R.id.snc);
    }
}
