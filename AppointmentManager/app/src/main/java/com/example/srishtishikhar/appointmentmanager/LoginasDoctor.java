package com.example.srishtishikhar.appointmentmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginasDoctor extends AppCompatActivity {
EditText ed,e2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginas_doctor);
        FirebaseUser firebaseUser= FirebaseAuth.getInstance().getCurrentUser();
        ed=(EditText)findViewById(R.id.Id);
        e2=(EditText)findViewById(R.id.password);
        Button button=(Button)findViewById(R.id.doc_submit);
        Button button2=(Button)findViewById(R.id.newb);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginasDoctor.this, NewDoctor.class);
                startActivity(i);
                finish();
            }
        }


        );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=ed.getText().toString();
                s2=e2.getText().toString();



                Intent i= new Intent(LoginasDoctor.this, DoctorHomepage.class);
                startActivity(i);
                finish();

            }
        });



    }
}
