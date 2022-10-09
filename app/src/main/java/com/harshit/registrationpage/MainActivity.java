package com.harshit.registrationpage;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText unm, fnm, prof, no;

    DatabaseReference db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        unm = findViewById(R.id.ed_unm);
        fnm = findViewById(R.id.ed_fnm);
        prof = findViewById(R.id.ed_prof);
        no = findViewById(R.id.mobile);

        db = FirebaseDatabase.getInstance("https://registeration-page-f76c8-default-rtdb.firebaseio.com/").getReference();
    }

    public void addUser(View view) {
        if (unm.getText().toString().length() > 0
                && fnm.getText().toString().length() > 0
                && prof.getText().toString().length() > 0) {

            CustomUserData userData = new CustomUserData(
                    unm.getText().toString(),
                    fnm.getText().toString(),
                    prof.getText().toString(),
                    no.getText().toString()
            );

            db.child("UsersData")
                    .child(unm.getText().toString())
                    .setValue(userData)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(MainActivity.this, "FeedBack Send Succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else
            Toast.makeText(this, "Invalid Data", Toast.LENGTH_SHORT).show();
    }


   /* public void getUserData(View view) {
        try {
            if(unm.getText().toString().length()>0){
                db.child("UsersData")
                        .child(unm.getText().toString())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                CustomUserData userData=snapshot.getValue(CustomUserData.class);
                                Toast.makeText(DatabaseDemo.this, userData.toString(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {
                                Toast.makeText(DatabaseDemo.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }else
                Toast.makeText(this, "Invalid Data", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }


    */

}
