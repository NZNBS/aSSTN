package com.mrz.asstn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Correo;
    private EditText Contraseña;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Asociar variable correo con el layout de la app
        Correo = findViewById(R.id.Correo);

        Contraseña = findViewById(R.id.Contraseña);
        Login = findViewById(R.id.login);
        String correo = Correo.getText().toString();
        String contraseña = Contraseña.getText().toString();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, correo ,Toast.LENGTH_LONG).show();
                Toast.makeText(LoginActivity.this, contraseña,Toast.LENGTH_LONG).show();
                Intent asd = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(asd);
                finish();
            }
        });
    }
}