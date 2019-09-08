package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view){
        EditText dollarAmount=(EditText) findViewById(R.id.dollar_amt);
        String dollars= dollarAmount.getText().toString();
        Double  doubleDollars= Double.parseDouble(dollars);
        Double doubleInr= 70.72 * doubleDollars;
        String dou= String.format("%.2f", doubleInr);
        String toastText= "= "+ dou.toString()+" $";
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
