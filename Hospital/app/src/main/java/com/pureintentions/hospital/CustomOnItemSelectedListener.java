package com.pureintentions.hospital;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

class CustomOnItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
        Toast.makeText(adapterView.getContext(),"OnItemSelectedListener : " + adapterView.getItemAtPosition(i).toString(),
                Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
