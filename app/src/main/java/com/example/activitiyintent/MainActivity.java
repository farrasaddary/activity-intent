package com.example.activitiyintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSendingData;
    private Button btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendingData = (Button) findViewById(R.id.btn_sending_data);
        btnSendingData.setOnClickListener(this);
        btnDialNumber = (Button) findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sending_data:
                Intent moveIntent = new Intent(MainActivity.this, SendingActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "082118192038";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}