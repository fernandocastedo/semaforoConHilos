package com.example.pruebacontador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProbandoActivity extends AppCompatActivity {
    Button btnHilo;
    TextView tvTextoEjemplo, tvHiloAuxiliar;

    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHilo = findViewById(R.id.btnHilo);
        tvTextoEjemplo = findViewById(R.id.tvTextoEjemplo);
        //txHiloAuxiliar = findViewById(R.id.tvHiloAuxiliar);

        btnHilo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){
                Thread thread = new Thread (new Runnable(){
                    @Override
                    public void run(){
                        for(int i = 10; i >= 0; i--){
                            int dec = i;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tvTextoEjemplo.setText("Contador: " + dec);
                                }
                            });
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        runOnUiThread(newRunnable){
                            @Override
                        }
                    }
                }
            }
        };

    }
}
