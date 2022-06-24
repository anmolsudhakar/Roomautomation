package com.example.falcoroomautomation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ipxx1;
    private static Button led;

    public static String texr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        led=(Button) findViewById(R.id.click);
        ipxx1=(TextView) findViewById(R.id.ipadd);

        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texr=ipxx1.getText().toString();
                Intent ht1 = new Intent(MainActivity.this,led.class);
                startActivity(ht1);
            }
        });
    }
}