package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnMakeNoteClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MakeNoteActivity.class);
        startActivity(intent);
    }

    public void onBtnNoteListClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), NoteListActivity.class);
        startActivity(intent);
    }

    public void onBtnRowCntListClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), RowCntListActivity.class);
        startActivity(intent);
    }

    public void onBtnStAdjustClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), StAdjustActivity.class);
        startActivity(intent);
    }

    public void onBtnGaugeCalClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), GaugeCalActivity.class);
        startActivity(intent);
    }

    public void onBtnCrochetLenClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), CrochetLenActivity.class);
        startActivity(intent);
    }

    public void onBtnBnDictClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), BnDictActivity.class);
        startActivity(intent);
    }

    public void onBtnHnDictClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), HnDictActivity.class);
        startActivity(intent);
    }

}






