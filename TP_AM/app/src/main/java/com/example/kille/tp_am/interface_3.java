package com.example.kille.tp_am;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class interface_3 extends Activity  {

    final String extra_name="nom";
    final String extra_surname="prénom";
    final String extra_date="date";
    final String extra_email="email";
    final String extra_adresse="adresse";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_3);

        Intent intent = getIntent();
        String textView = intent.getStringExtra(extra_name);
    }
}