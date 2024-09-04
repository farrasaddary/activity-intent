package com.example.activitiyintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    public static String extra_message = "extra_message";
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        tvMessage = (TextView) findViewById(R.id.tv_message);
        String message = getIntent().getStringExtra(extra_message);
        tvMessage.setText(message);
    }
}