package com.example.user.hw2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Explain_calculator extends AppCompatActivity {

    Button runcal;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_calculator);
        runcal = (Button)findViewById(R.id.runcal);

        runcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //calculator method call, 다시 받아오는 정보가 있기 때문에 startActivityForResult() 사용
                intent = new Intent(Explain_calculator.this, Calculator.class);
                startActivityForResult(intent, 777);
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    { // calculator method에서 리턴받는 값 처리, 토스트 띄움
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case (777):
                if (resultCode == Activity.RESULT_OK) {
                    String selectedContact = data.getExtras().getString("var");
                    Toast.makeText(getApplicationContext(), selectedContact, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
