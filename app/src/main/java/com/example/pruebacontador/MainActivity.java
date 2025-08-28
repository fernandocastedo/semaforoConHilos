package com.example.pruebacontador;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Semáforo 1
        Button rojo1 = findViewById(R.id.btn_rojo1);
        Button amarillo1 = findViewById(R.id.btn_amarillo1);
        Button verde1 = findViewById(R.id.btn_verde1);

        // Semáforo 2
        Button rojo2 = findViewById(R.id.btn_rojo2);
        Button amarillo2 = findViewById(R.id.btn_amarillo2);
        Button verde2 = findViewById(R.id.btn_verde2);

        // Crear hilos
        Thread semaforo1 = new Thread(new SemaforoRunnable(rojo1, amarillo1, verde1));
        Thread semaforo2 = new Thread(new SemaforoRunnable(rojo2, amarillo2, verde2));

        semaforo1.start();
        semaforo2.start();
    }
}