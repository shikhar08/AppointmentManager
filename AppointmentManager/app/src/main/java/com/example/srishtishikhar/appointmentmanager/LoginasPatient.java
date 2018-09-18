package com.example.srishtishikhar.appointmentmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginasPatient extends AppCompatActivity {
String login,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginas_patient);
        Button button=(Button) findViewById(R.id.pat_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText x=(EditText)findViewById(R.id.Pat_login);
                login=x.getText().toString();
                EditText y=(EditText)findViewById(R.id.pat_password);
                password=y.getText().toString();
            }
        });
        Button button1=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginasPatient.this,NewPatient.class);
                startActivity(intent);
            }
        });
    }
}
