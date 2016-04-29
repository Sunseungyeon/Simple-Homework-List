package com.example.user.hw2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePw extends AppCompatActivity {

    EditText chpw;
    Button okay, cancel;
    SharedPreferences sh_Pref;
    SharedPreferences.Editor toEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pw);

        chpw = (EditText)findViewById(R.id.chpw);
        okay = (Button)findViewById(R.id.ok);
        cancel = (Button)findViewById(R.id.cancel);

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //정보를 저장하기 위해 sharedPreferences() method call
                sharedPreferences();
            }
        });

       cancel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { // cancel 눌렀을때 edittext창 초기화
               chpw.setText("");
           }
       });
    }
    public void sharedPreferences(){ //바뀐 비밀번호 저장
        String pwd = chpw.getText().toString();
        sh_Pref = getSharedPreferences("Login Credentials", MODE_PRIVATE);
        toEdit = sh_Pref.edit();
        toEdit.putString("pwd", pwd);
        toEdit.commit();
        finish();
    }
}
