package com.example.holamundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
        EditText user = findViewById(R.id.user);
        String tag;
        Log.d( tag= "Usuario O Correo:", user.getText().toString());
        EditText pass = findViewById(R.id.pass);
        Log.d( tag= "Contraseña:", pass.getText().toString());
        Intent login2 = new Intent(this, login.class);
        startActivity(login2);


    }

    public void Register(View v){
        Intent registrar2 = new Intent(this, registrar.class);
        startActivity(registrar2);

    }

    public void Register2(View v){

    }

    public void Saved(View v){

    }
    public void Cancel(View v){

    }

    public void menuLogin(View v){

    }
}
