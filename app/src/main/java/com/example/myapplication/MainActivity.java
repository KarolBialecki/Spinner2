package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sprawdzodpowiedz(View view) {
        String tekst = "zielony";


        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, tekst, duration);


        Spinner kolor = findViewById(R.id.spinner);
        String wybor = String.valueOf(kolor.getSelectedItem());

        if (wybor.equals ("czerwony"))
            tekst = "czerwony";
            toast.show();
        if (wybor.equals ("zielony"))

            toast.show();
        if (wybor.equals ("niebieki"))
            tekst = "niebieski";
            toast.show();
        if (wybor.equals("zolty"))
            tekst = "zolty";
            toast.show();

    }
}