package com.example.kille.tp_am;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class interface_2 extends AppCompatActivity {

    private EditText nom;
    private EditText prénom;
    private EditText date;
    private EditText email;
    private EditText adresse;
    private final String extra_name = "nom";
    private final String extra_surname = "prénom";
    private final String extra_date = "date";
    private final String extra_email = "email";
    private final String extra_adresse = "adresse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_2);

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(interface_2.this, interface_3.class);
                intent.putExtra(extra_name, nom);
                intent.putExtra(extra_surname, prénom);
                intent.putExtra(extra_date, date);
                intent.putExtra(extra_email, email);
                intent.putExtra(extra_adresse, adresse);
                startActivity(intent);
            }
        });
    }
}