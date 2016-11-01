package com.example.kmcho.practical_2_exercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getMessage(View v){
        Intent intentGetMessage = new Intent(this, Main2Activity.class);
        startActivityForResult(intentGetMessage, 2);

    }

    public void callMessage(View v){
        TextView tv = (TextView)findViewById(R.id.textViewMessage1);
        String message = tv.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + message ));
        //startActivityOnResult(intent,22);
        startActivityForResult(intent,22);

    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2){
            if(null != data){
                String message = data.getStringExtra("NAME");
                String message1 = data.getStringExtra("PHONE");

                TextView textViewMessage = (TextView)findViewById(R.id.textViewMessage);
                TextView textViewMessage1 = (TextView)findViewById(R.id.textViewMessage1);
                textViewMessage.setText("Name: " + message);
                textViewMessage1.setText("Phone: " + message1);
            }
        }
    }
}
