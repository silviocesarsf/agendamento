package com.example.agendamento;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TelaAgendar extends AppCompatActivity {
    private AppCompatSpinner spinnerBarbeiros;
    private ArrayList BarbeirosDisponiveis = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_agendar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinnerBarbeiros = findViewById(R.id.spinnerBarbeiros);
        BarbeirosDisponiveis.add("Marcos");
        BarbeirosDisponiveis.add("Bruno");
        BarbeirosDisponiveis.add("Willian");

        ArrayAdapter<String> adapterBarbeiros = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.select_dialog_item_material, BarbeirosDisponiveis);
        spinnerBarbeiros.setAdapter(adapterBarbeiros);
    }
}