package br.ufjf.dcc196.henriqueacar.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private EditText numero1;
    private EditText numero2;
    private Button botaoSoma;
    private Button botaoSub;
    private Button botaoMult;
    private Button botaoDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.editNumero1);
        numero2 = findViewById(R.id.editNumero2);
        botaoSoma = findViewById(R.id.botaoSoma);
        botaoDiv = findViewById(R.id.botaoDiv);
        botaoMult = findViewById(R.id.botaoMult);
        botaoSub = findViewById(R.id.botaoSub);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = numero1.getText().toString();
                String temp2 = numero2.getText().toString();
                float soma = Float.parseFloat(temp1) + Float.parseFloat(temp2);
                resultado.setText(String.valueOf(soma));
            }
        });

        botaoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = numero1.getText().toString();
                String temp2 = numero2.getText().toString();
                float sub = Float.parseFloat(temp1) - Float.parseFloat(temp2);
                resultado.setText(String.valueOf(sub));
            }
        });

        botaoMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = numero1.getText().toString();
                String temp2 = numero2.getText().toString();
                float mult = Float.parseFloat(temp1) * Float.parseFloat(temp2);
                resultado.setText(String.valueOf(mult));
            }
        });

        botaoDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = numero1.getText().toString();
                String temp2 = numero2.getText().toString();
                //checa se o divisor nao eh 0
                if(!"0".equals(temp2)){
                    float div = Float.parseFloat(temp1) / Float.parseFloat(temp2);
                    resultado.setText(String.valueOf(div));
                }
                else{
                    resultado.setText("N??o ?? poss??vel dividir por 0!");
                }

            }
        });
    }
}