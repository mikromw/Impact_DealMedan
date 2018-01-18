package com.example.vinsonhuang.dealmedan.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vinsonhuang.dealmedan.utilities.Shared;
import com.example.vinsonhuang.dealmedan.utilities.Utility;

/**
 * Created by User on 11/30/2017.
 */

public class Register extends AppCompatActivity {
    Button btn_do_register;
    EditText email,password,repass,nama,nomor;
    ProgressDialog dialog;
    Toolbar toolbar;
    Shared shared;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        nama = (EditText)findViewById(R.id.nama);
        repass = (EditText)findViewById(R.id.repass);
        nomor = (EditText)findViewById(R.id.nomor);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        btn_do_register = (Button)findViewById(R.id.btn_do_register);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dialog = new ProgressDialog(this);
        dialog.setTitle("Please Wait...");
        dialog.setCancelable(false);
        shared = new Shared(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btn_do_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z.]+";
                String emailText = email.getText().toString();
                String passText = password.getText().toString();
                String repassText = repass.getText().toString();
                String namaText = nama.getText().toString();
                String nomorText = nomor.getText().toString();

                if (namaText.length()==0){
                    nama.setError("Nama tidak boleh kosong");
                    return;
                }

                if (nomorText.length()==0){
                    nomor.setError("Nomor tidak boleh kosong");
                    return;
                }


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

                if(!passText.equals(repassText)){
                    repass.setError("Re-Password tidak sama dengan password");
                    return;
                }
                if(shared.insertUser(namaText, nomorText, emailText,passText)){
                    Toast.makeText(Register.this,"Daftar berhasil, silahkan login",Toast.LENGTH_LONG).show();
                    onBackPressed();
                }else{
                    Toast.makeText(Register.this,"Email sudah digunakan",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}

