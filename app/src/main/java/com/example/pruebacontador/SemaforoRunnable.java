package com.example.pruebacontador;

import android.graphics.Color;
import android.widget.Button;

public class SemaforoRunnable implements Runnable {
    private Button rojo, amarillo, verde;
    private boolean running = true;

    SemaforoRunnable(Button rojo, Button amarillo, Button verde) {
        this.rojo = rojo;
        this.amarillo = amarillo;
        this.verde = verde;
    }

    @Override
    public void run() {
        try {
            while (running) {
                // ROJO
                cambiarColor(rojo, Color.RED);
                cambiarColor(amarillo, Color.GRAY);
                cambiarColor(verde, Color.GRAY);
                Thread.sleep(5000);

                // VERDE
                cambiarColor(rojo, Color.GRAY);
                cambiarColor(amarillo, Color.GRAY);
                cambiarColor(verde, Color.GREEN);
                Thread.sleep(5000);

                // AMARILLO
                cambiarColor(rojo, Color.GRAY);
                cambiarColor(amarillo, Color.YELLOW);
                cambiarColor(verde, Color.GRAY);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) { }
    }

    private void cambiarColor(Button boton, int color) {
        boton.post(() -> boton.setBackgroundColor(color));
    }
}
