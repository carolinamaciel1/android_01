package carolinamaci3l.com.testando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {


    protected EditText campo1;
    protected Button botao1;
    protected TextView campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campo1= findViewById(R.id.idEditText);
        botao1=findViewById(R.id.idButton);
        campo2=findViewById(R.id.idTextView);




        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(campo1.getText().toString().isEmpty()){
                    String error = "Não foi possível iniciar a saudação, insira seu nome!";
                    Toast.makeText(getApplicationContext(),error,Toast.LENGTH_LONG).show();
                    campo2.setText("");
                }else{
                 String texto = campo1.getText().toString();
                 campo2.setText("Saudações " +texto + "!");
                }
            }
        });
    }
}
