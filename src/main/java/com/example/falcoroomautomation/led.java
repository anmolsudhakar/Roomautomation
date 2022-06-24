package com.example.falcoroomautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class led extends AppCompatActivity {
    private static Button on1, on2, on3, on4, off1, off2, off3, off4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);

        on1 = (Button) findViewById(R.id.but1on);
        off1 = (Button) findViewById(R.id.but1off);
        on2 = (Button) findViewById(R.id.but2on);
        off2 = (Button) findViewById(R.id.but2off);
        on1 = (Button) findViewById(R.id.but3on);
        off1 = (Button) findViewById(R.id.but3off);
        on1 = (Button) findViewById(R.id.but4on);
        off1 = (Button) findViewById(R.id.but4off);

        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on1 process1 = new on1();
                process1.execute();

            }
        });

        on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on2 process1 = new on2();
                process1.execute();

            }
        });

        on3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on3 process1 = new on3();
                process1.execute();

            }
        });

        on4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on4 process1 = new on4();
                process1.execute();

            }
        });


        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off1 process1 = new off1();
                process1.execute();

            }
        });

        off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off2 process1 = new off2();
                process1.execute();

            }
        });

        off3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off3 process1 = new off3();
                process1.execute();

            }
        });

        off4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off4 process1 = new off4();
                process1.execute();

            }
        });
    }
}
