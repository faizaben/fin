package com.example.bazinfo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnconnecter = findViewById(R.id.btnconnecter);
        Button btninscrit = findViewById(R.id.btninscrit);

         btnconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent secondinterface = new Intent(MainActivity.this, ConnecterActivity.class);
                startActivity(secondinterface);


            }
        });

         btninscrit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent secondinterface = new Intent(MainActivity.this, InscritActivity.class);
                 startActivity(secondinterface);

             }
         });
    }
}
