package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.database.Datab;
import com.example.database.R;

public class MainActivity extends AppCompatActivity {
    Datab myDB;
    EditText editName, editEmail, editPassword;
    Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB= new Datab(this);

        editName= findViewById(R.id.eT);
        editEmail= findViewById(R.id.eT2);
        editPassword= findViewById(R.id.eT3);
        btnAddData = findViewById(R.id.button);
        addData();
    }
    public void addData()
    {
        btnAddData.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean check= myDB.insertData(editName.getText().toString(),editEmail.getText().toString(),editPassword.getText().toString());
                if(check=true)
                    Toast.makeText(MainActivity.this, "Data Interted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Data Not Interted", Toast.LENGTH_LONG).show();
            }
    });
}
}
