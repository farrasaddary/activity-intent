package com.example.activitiyintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kotlinx.coroutines.channels.Receive;

public class SendingActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSend;
    private EditText edtTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending);

        edtTextMessage = (EditText) findViewById(R.id.edt_text_message);
        btnSend = (Button) findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String message = edtTextMessage.getText().toString();
        Intent extraIntent = new Intent(SendingActivity.this, ReceiveActivity.class);
        extraIntent.putExtra("extra_message", message);
        startActivity(extraIntent);
    }
}