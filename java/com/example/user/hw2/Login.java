package com.example.user.hw2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText pw1, pw2, pw3, pw4;
    Button login;
    String password="0000"; // password initialize
    SharedPreferences sh_Pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pw1 = (EditText)findViewById(R.id.pw1);
        pw2 = (EditText)findViewById(R.id.pw2);
        pw3 = (EditText)findViewById(R.id.pw3);
        pw4 = (EditText)findViewById(R.id.pw4);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp;

                temp = pw1.getText().toString() + pw2.getText().toString() + pw3.getText().toString() + pw4.getText().toString();

                sharedPreference(); // 설정되어있는 비밀번호 불러옴

                if (password.equals(temp)) { // 비밀번호 비교 후, 맞으면 mainactivity로 전환
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else { // 틀리면 edittext창 초기화
                    pw1.setText("");
                    pw2.setText("");
                    pw3.setText("");
                    pw4.setText("");

                    Toast.makeText(getApplicationContext(), "incorrect value! retry!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void sharedPreference()
    { //비밀번호 업데이트
        sh_Pref = getSharedPreferences("Login Credentials", MODE_PRIVATE);
        if(sh_Pref != null && sh_Pref.contains("pwd")){
            password = sh_Pref.getString("pwd","");
        }
    }
}