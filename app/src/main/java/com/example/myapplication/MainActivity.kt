package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.content.Intent
import android.view.View
import com.example.myapplication.MakeNoteActivity
import com.example.myapplication.NoteListActivity
import com.example.myapplication.RowCntListActivity
import com.example.myapplication.StAdjustActivity
import com.example.myapplication.GaugeCalActivity
import com.example.myapplication.CrochetLenActivity
import com.example.myapplication.BnDictActivity
import com.example.myapplication.HnDictActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnMakeNoteClicked(v: View?) {
        val intent = Intent(applicationContext, MakeNoteActivity::class.java)
        startActivity(intent)
    }

    fun onBtnNoteListClicked(v: View?) {
        val intent = Intent(applicationContext, NoteListActivity::class.java)
        startActivity(intent)
    }

    fun onBtnRowCntListClicked(v: View?) {
        val intent = Intent(applicationContext, RowCntListActivity::class.java)
        startActivity(intent)
    }

    fun onBtnStAdjustClicked(v: View?) {
        val intent = Intent(applicationContext, StAdjustActivity::class.java)
        startActivity(intent)
    }

    fun onBtnGaugeCalClicked(v: View?) {
        val intent = Intent(applicationContext, GaugeCalActivity::class.java)
        startActivity(intent)
    }

    fun onBtnCrochetLenClicked(v: View?) {
        val intent = Intent(applicationContext, CrochetLenActivity::class.java)
        startActivity(intent)
    }

    fun onBtnBnDictClicked(v: View?) {
        val intent = Intent(applicationContext, BnDictActivity::class.java)
        startActivity(intent)
    }

    fun onBtnHnDictClicked(v: View?) {
        val intent = Intent(applicationContext, HnDictActivity::class.java)
        startActivity(intent)
    }
}