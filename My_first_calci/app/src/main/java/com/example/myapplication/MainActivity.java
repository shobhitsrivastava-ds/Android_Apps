package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button add, sub, div, mul;
    float result_num;
    int num_1, num_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= (TextView)findViewById(R.id.Result);
        num1= (EditText) findViewById(R.id.Num_1);
        num2= (EditText) findViewById(R.id.Num_2);

        add= (Button)findViewById(R.id.sum);
        sub= (Button)findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div= (Button)findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num_1= Integer.parseInt(num1.getText().toString());
                num_2= Integer.parseInt(num2.getText().toString());
                result_num= num_1+num_2;
                result.setText(String.valueOf(result_num));


            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num_1= Integer.parseInt(num1.getText().toString());
                num_2= Integer.parseInt(num2.getText().toString());
                result_num= num_1-num_2;
                result.setText(String.valueOf(result_num));


            }
        });
        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num_1= Integer.parseInt(num1.getText().toString());
                num_2= Integer.parseInt(num2.getText().toString());
                result_num= num_1*num_2;
                result.setText(String.valueOf(result_num));


            }
        });
        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num_1= Integer.parseInt(num1.getText().toString());
                num_2= Integer.parseInt(num2.getText().toString());
                result_num= num_1/num_2;
                result.setText(String.valueOf(result_num));
            }
        });

    }
}
