package com.example.vinsonhuang.dealmedan.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vinsonhuang.dealmedan.utilities.Shared;
import com.example.vinsonhuang.dealmedan.utilities.Utility;

/**
 * Created by User on 11/30/2017.
 */

public class Login extends AppCompatActivity {
    Button btn_do_login;
    EditText email,password;
    ProgressDialog dialog;
    Toolbar toolbar;
    Shared shared;
    TextView reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        reg = (TextView) findViewById(R.id.reg);
        btn_do_login = (Button)findViewById(R.id.btn_do_login);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dialog = new ProgressDialog(this);
        dialog.setTitle("Please Wait...");
        dialog.setCancelable(false);
        shared = new Shared(this);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        btn_do_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z.]+";
                String emailText = email.getText().toString();
                String passText = password.getText().toString();
                if (emailText.length()==0){
                    email.setError("Email tidak boleh kosong");
                    return;
                }else{
                    if (!emailText.matches(emailPattern)){
                        email.setError("Email tidak valid");
                        return;
                    }
                }
                if (passText.length()==0){
                    password.setError("Password tidak boleh kosong");
                    return;
                }
                if(shared.login(emailText,passText).equals("_notregister")){
                    Toast.makeText(Login.this,"Email anda belum terdaftar",Toast.LENGTH_SHORT).show();

                }else if(shared.login(emailText,passText).equals("_wrongpass")){
                    Toast.makeText(Login.this,"Password salah",Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(Login.this,"Selamat datang, "+shared.login(emailText,passText),Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this, Dashboard.class);
                    startActivity(i);
                    finish();
                }


            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email.setText("");
                password.setText("");
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
            }
        });
    }


}

