package com.example.balancejoystick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView angle_text = (TextView) findViewById(R.id.textView);
        TextView strength_text = (TextView) findViewById(R.id.textView2);

        balance_joystick joystick = (balance_joystick) findViewById(R.id.my_joystick);
        joystick.setOnMoveListener(new balance_joystick.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
                angle_text.setText(String.valueOf(angle));
                strength_text.setText(String.valueOf(strength));
            }
        },17);

    }
}