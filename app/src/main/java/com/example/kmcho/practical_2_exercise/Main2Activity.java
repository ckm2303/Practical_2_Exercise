package com.example.kmcho.practical_2_exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editTextMessage;
    EditText editTextMessage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
        editTextMessage1 = (EditText)findViewById(R.id.editTextMessage1);
    }

    public void submitMessage(View V){

        String message = editTextMessage.getText().toString();
        String message1 = editTextMessage1.getText().toString();
        Intent intentMessage = new Intent();

        intentMessage.putExtra("NAME",message);
        intentMessage.putExtra("PHONE",message1);
        setResult(2,intentMessage);
        finish();
    }
}
