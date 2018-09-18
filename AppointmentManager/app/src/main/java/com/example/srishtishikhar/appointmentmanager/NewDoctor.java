package com.example.srishtishikhar.appointmentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewDoctor extends AppCompatActivity {
String new_name,lic,spec,qual,fee,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_doctor);
        Button button=(Button)findViewById(R.id.submit_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=(EditText)findViewById(R.id.name_new);
                new_name=name.getText().toString();

                EditText id=(EditText)findViewById(R.id.Lic_new);
                lic=id.getText().toString();

                EditText specs=(EditText)findViewById(R.id.spec_new);
                spec=specs.getText().toString();

                EditText qualif=(EditText)findViewById(R.id.qual_new);
                qual=qualif.getText().toString();

                EditText fees=(EditText)findViewById(R.id.Fee_new);
                fee=fees.getText().toString();

                EditText add=(EditText)findViewById(R.id.Address_new);
                address=add.getText().toString();

            }
        });
    }
}
