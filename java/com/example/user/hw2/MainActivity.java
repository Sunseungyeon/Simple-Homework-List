package com.example.user.hw2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] list = { //menu list
            "Time-Table",
            "Tip-Counter",
            "Calculator",
            "Change Pwd"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new MobileArrayAdapter(this, list));// 이미지 포함된 class불러오며 list 더해줌
    }

    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        Intent intent;
        //Toast.makeText(this, "You have selected " + list[position], Toast.LENGTH_SHORT).show();
        switch (position)
        {
            case 0: //timetable 메뉴가 눌렸을 때 activity 전환
                intent = new Intent(MainActivity.this, Explain_timetable.class);
                startActivityForResult(intent, 222);
                break;
            case 1: //tip calculator 메뉴가 눌렸을 때 activity 전환
                intent = new Intent(MainActivity.this, Explain_tip.class);
                startActivityForResult(intent, 333);
                break;
            case 2: //calculator 메뉴가 눌렸을 때 activity 전환
                intent = new Intent(MainActivity.this, Explain_calculator.class);
                startActivityForResult(intent, 444);
                break;
            case 3: //change password 메뉴가 눌렸을 때 activity 전환
                intent = new Intent(MainActivity.this, ChangePw.class);
                startActivityForResult(intent, 555);
                break;
        }
    }
}

