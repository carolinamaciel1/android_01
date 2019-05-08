package com.example.pj1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    private EditText idEmail;
    private EditText idSenha;
    private Button buttonAcessar;
    private TextView idEsqueceuSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonAcessar = findViewById(R.id.buttonAcessar);
        idEmail = findViewById(R.id.idEmail);
        idSenha =  findViewById(R.id.idSenha);
        idEsqueceuSenha = findViewById(R.id.idEsqueceuSenha);

        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = idEmail.getText().toString();
                String senha = idSenha.getText().toString();
                if(email.isEmpty() == false  && senha.isEmpty() == false) {
                    startActivity(new Intent(MainActivity.this,ControleActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Insira um email e senha válido.",Toast.LENGTH_LONG).show();
                }
                }

        });



        idEsqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EsqueceuSenhaActivity.class));
            }
        });
    }
}
