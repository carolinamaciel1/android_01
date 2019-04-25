package com.example.carolinamaciel.atmempresaconsultoria;


import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ServiceConfigurationError;

public class MainActivity extends Activity {

    private ImageButton botaoEmpresa;
    private ImageButton botaoServicos;
    private ImageButton botaoClientes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton botaoEmpresa = (ImageButton) findViewById(R.id.empresaId);
        ImageButton botaoServicos = (ImageButton) findViewById(R.id.servicosId);
        ImageButton botaoClientes = (ImageButton) findViewById(R.id.clientesId);
        ImageButton botaoContato = (ImageButton) findViewById(R.id.contatoId);

        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EmpresaActivity.class));
            }
        });

        botaoServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });


        botaoClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ClientesActivity.class));
            }
        });

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

    }
}
