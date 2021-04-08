package com.example.login_liur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFunction extends AppCompatActivity {
    // kita list semua object view yang sudah kita buat di layout
    // hanya dikenakan oeprasi
    EditText txtemail;
    EditText txtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // kita sambungkan ke layout
        txtemail = (EditText)findViewById(R.id.AccountEmail);
        txtpassword = (EditText)findViewById(R.id.AccountPassword);
        btnlogin = (Button)findViewById(R.id.ButtonLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi disini
                String email = txtemail.getText().toString();
                String password = txtpassword.getText().toString();
                if (email.equalsIgnoreCase("makanbakso@gmail.com")
                        && password.equalsIgnoreCase("123456")){
                    //sukses login, Toast
                    Toast.makeText(LoginFunction.this, "Login Succes", Toast.LENGTH_SHORT).show();
                    // pindah ke tampilan lain / activity
                    Intent move = new Intent(LoginFunction.this , MainActivity.class);
                    // nambahin data -> paketan
                    // putextra tidak hanya satu
                    move.putExtra("email" , email);
                    startActivity(move);
                }else {
                    Toast.makeText(LoginFunction.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}