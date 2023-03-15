package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String numeroAleatorioString(){
        return String.valueOf(new Random().nextInt (11));
    }

    public void btnPlay(View view){
        TextView text = findViewById(R.id.textResult);
        text.setText("O número selecionado: "+numeroAleatorioString());
    }
}