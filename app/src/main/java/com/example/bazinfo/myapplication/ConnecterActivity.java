package com.example.bazinfo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConnecterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connecter);

        Button btannuler =findViewById(R.id.btannuler);
        Button btnvalider =findViewById(R.id.btnvalid);

        final TextView editpassword = findViewById(R.id.editpassword);
        final TextView editemail = findViewById(R.id.editemail);




        btnvalider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //// sqlLite pour connecter et passer au page navigation drawer
                //.....................

                Intent secondinterface = new Intent(ConnecterActivity.this, NavigationDrawer.class);
                startActivity(secondinterface);
            }
        });

        btannuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //vider lemail et le password

                editpassword.setText("");
                editemail.setText("");


            }
        });
    }
}
