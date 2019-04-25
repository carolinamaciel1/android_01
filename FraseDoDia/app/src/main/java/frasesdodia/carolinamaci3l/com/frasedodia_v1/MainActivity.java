package frasesdodia.carolinamaci3l.com.frasedodia_v1;
import android.view.View;
import android.widget.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {"Sua luta não termina quando sentir cansaço, mas sim quando atingir o sucesso tão merecido.",
            "A motivação não acontece por acaso, como tudo na vida você tem de batalhar para a alcançar.",
            "O poder está dentro de você, na sua mente, pois se acreditar que consegue não haverá obstáculo capaz de impedir o seu sucesso."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textoNovaFrase = findViewById(R.id.textoNovaFraseId);
    botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });



    }
}
