package com.example.user.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explain_timetable extends AppCompatActivity {

    Button runtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_timetable);

        runtime = (Button)findViewById(R.id.runtime);

        runtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // timetable method call
                Intent intent = new Intent(Explain_timetable.this, TimeTable.class);
                startActivity(intent);
            }
        });
    }
}
