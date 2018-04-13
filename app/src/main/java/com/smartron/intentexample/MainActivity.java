package com.smartron.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_MESSAGE = "";
    EditText message_et;
    Button send_message_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message_et = findViewById(R.id.message_et);
        send_message_btn = findViewById(R.id.send_message_btn);
        send_message_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_message_btn:
                String message = message_et.getText().toString();
                Intent i = new Intent(this, DisplayMessageActivity.class);
                i.putExtra(EXTRA_MESSAGE, message);
                startActivity(i);
        }
    }
}
