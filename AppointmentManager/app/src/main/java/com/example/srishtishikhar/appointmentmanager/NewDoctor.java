package com.example.srishtishikhar.appointmentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NewDoctor extends AppCompatActivity {
String new_name,lic,spec,qual,address;
    String fee;

    DatabaseReference databaseDoctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_doctor);

        databaseDoctors=FirebaseDatabase.getInstance().getReference("doctors");

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
                int feee=Integer.parseInt(fee);


                EditText add=(EditText)findViewById(R.id.Address_new);
                address=add.getText().toString();

                if(TextUtils.isEmpty(new_name) || TextUtils.isEmpty(lic ) || TextUtils.isEmpty(spec) || TextUtils.isEmpty(qual) || TextUtils.isEmpty(fee) || TextUtils.isEmpty(address))
                {
                    Toast.makeText(NewDoctor.this,"Fill all details before submitting", Toast.LENGTH_SHORT).show();

                }

                else {
                    String num= databaseDoctors.push().getKey();
                    Doctors doctors=new Doctors(new_name,lic,address,spec,feee,qual);
                    databaseDoctors.child(num).setValue(doctors);
                    Toast.makeText(NewDoctor.this,"Your Registration was successful", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
