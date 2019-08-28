package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements Main.View{
    private  Main.Presentador promedioPresentador;
    private EditText edtNota1;
    private EditText edtNota2;
    private EditText edtNota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        promedioPresentador = new PromedioPresentador(this);
    }

    public void mostrarResultado(View view){
        edtNota1 = findViewById(R.id.editText);
        edtNota2 = findViewById(R.id.editText2);
        edtNota3 = findViewById(R.id.editText3);

        int nota1= Integer.parseInt(edtNota1.getText().toString());
        int nota2= Integer.parseInt(edtNota2.getText().toString());
        int nota3= Integer.parseInt(edtNota3.getText().toString());

        promedioPresentador.calcularPromedio(nota1,nota2,nota3);

    }
    @Override
    public void mostrarResultado(String resultado) {
        Toast.makeText(getApplicationContext(), "Promedio:"+ resultado, Toast.LENGTH_SHORT).show();

    }
}
