
package carolinamaci3l.com.aplicativosorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botao_sorteio_java;
    private TextView texto_sorteio_java;
    private String[] nomes={"Carolina","Junior","Catarina","Raina","Paty","Edson","Flora","Rhuan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao_sorteio_java = findViewById(R.id.botao_sorteio);
        texto_sorteio_java = findViewById(R.id.texto_sorteio);

        botao_sorteio_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numero_aleatorio = randomico.nextInt(nomes.length);
                texto_sorteio_java.setText(nomes[numero_aleatorio]);
            }
        });


    }
}
