package com.example.user.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class TimeTable extends AppCompatActivity {

    TextView mon, tue, wed, thu, fri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        Calendar oCalendar = Calendar.getInstance( );//day check

        mon = (TextView)findViewById(R.id.mon);
        tue = (TextView)findViewById(R.id.tue);
        wed = (TextView)findViewById(R.id.wed);
        thu = (TextView)findViewById(R.id.thu);
        fri = (TextView)findViewById(R.id.fri);

        if(oCalendar.get(Calendar.DAY_OF_WEEK) == 2)//if today is monday, monday TextView is changing color
        {
            mon.setBackgroundResource(R.color.colorAccent);
        }
        else if(oCalendar.get(Calendar.DAY_OF_WEEK) == 3)//if today is tuesday, monday TextView is changing color
        {
            tue.setBackgroundResource(R.color.colorAccent);
        }
        else if(oCalendar.get(Calendar.DAY_OF_WEEK) == 4)//if today is wednesday, monday TextView is changing color
        {
            wed.setBackgroundResource(R.color.colorAccent);
        }
        else if(oCalendar.get(Calendar.DAY_OF_WEEK) == 5)//if today is thursday, monday TextView is changing color
        {
            thu.setBackgroundResource(R.color.colorAccent);
        }
        else if(oCalendar.get(Calendar.DAY_OF_WEEK) == 6)//if today is friday, monday TextView is changing color
        {
            fri.setBackgroundResource(R.color.colorAccent);
        }
    }
}