package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.honpoll_tst.MainActivity;
import com.example.honpoll_tst.R;

public class SecVoting extends Activity {

    private Button savencont, votabayi;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secvoting);

        initUI();
        savencont.setOnClickListener(view -> startActivity(new Intent(SecVoting.this, MainActivity.class)));
        votabayi.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "vote registered!", Toast.LENGTH_SHORT).show();
        });

        }
    public void initUI(){
        votabayi = findViewById(R.id.votebai);
        savencont = findViewById(R.id.savencont);
    }
}
