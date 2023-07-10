package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.honpoll_tst.MainActivity;
import com.example.honpoll_tst.R;

public class SecVoting extends Activity {

    private Button savencont;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secvoting);

        initUI();

        savencont.setOnClickListener(view -> startActivity(new Intent(SecVoting.this, MainActivity.class)));
}
    public void initUI(){
        savencont = findViewById(R.id.savencont);
    }
}
