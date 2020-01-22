package com.hritik.rccontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class MainActivity extends AppCompatActivity {

    TextView ang,str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ang=findViewById(R.id.ang);
        str=findViewById(R.id.str);

        JoystickView joystick = (JoystickView) findViewById(R.id.js1);
        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
                ang.setText("Angle: "+angle);
                str.setText("Strength: "+strength);
            }
        });
    }
}
