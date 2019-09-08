package com.example.my_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import java.security.cert.LDAPCertStoreParameters;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public void btnClick(View view)
    {
        Button button0;
        TextView resultTextView;
        SeekBar seekbar;
        button0= (Button) findViewById(R.id.rollButton);
        resultTextView= (TextView) findViewById(R.id.resultTextView);
        seekbar= (SeekBar) findViewById(R.id.seekBar);
        Random r = new Random();
        Integer rand = r.nextInt(seekbar.getProgress());
        if(rand==3)
        {
            resultTextView.setText("Got the magic number");
        }
        else
        {
        resultTextView.setText(rand.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
