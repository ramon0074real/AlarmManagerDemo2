package com.example.alarmmanagerdemo2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        findViewById(R.id.buttonSetAlarm).setOnClickListener
                (new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Calendar calendar= Calendar.getInstance();




            }
        });
    }
}