package com.example.bazinfo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InscritActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrit);

        Button btnconfirmer = findViewById(R.id.btnConfirmer);
        Button btnannuler = findViewById(R.id.btnAnnuler);

        final TextView nom = findViewById(R.id.nom);
        final TextView prenom = findViewById(R.id.prenom);
        final TextView gsm = findViewById(R.id.gsm);
        final TextView email = findViewById(R.id.email);
        final TextView password = findViewById(R.id.password);


        btnconfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // sqlLite pour valider linscris des donnnees
            }
        });

        btnannuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vide les champs

               


            }
        });

    }
}
