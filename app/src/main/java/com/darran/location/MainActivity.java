package com.darran.location;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnGetGps;
    TextView tvLong;
    Location currentLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(MainActivity.this, com.darran.location.MyService.class));

        btnGetGps = findViewById(R.id.btnGetGps);
        tvLong = findViewById(R.id.tvLong);;

        btnGetGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvLong.setText(MyService.getLocation().toString());
            }
        });


    }
}
