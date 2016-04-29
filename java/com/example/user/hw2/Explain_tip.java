package com.example.user.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explain_tip extends AppCompatActivity {

    Button runtip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_tip);

        runtip = (Button)findViewById(R.id.runtip);

        runtip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // tip-calculator method call
                Intent intent = new Intent(Explain_tip.this, Tip_calculator.class);
                startActivity(intent);
            }
        });
    }
}
