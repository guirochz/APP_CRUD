package com.example.app_busmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class linha2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linha2);
    }

    public void abrindo_perfil(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, perfil.class);
        startActivity(intent);
    }
    public void abrindo_home(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void abrindo_favoritos(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, favoritos.class);
        startActivity(intent);
    }
    public void abrindo_ruas(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, rua2.class);
        startActivity(intent);
    }
    public void abrindo_pontos(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, ponto2.class);
        startActivity(intent);
    }
}