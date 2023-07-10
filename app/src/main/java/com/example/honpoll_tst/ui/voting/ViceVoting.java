package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.honpoll_tst.R;


public class ViceVoting extends Activity {

    private Button SaveNcontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vicevoting);
        initUI();

        SaveNcontinue.setOnClickListener(view -> startActivity(new Intent(ViceVoting.this, SecVoting.class)));
}

    public void initUI(){
        SaveNcontinue = findViewById(R.id.snc);
    }
}
