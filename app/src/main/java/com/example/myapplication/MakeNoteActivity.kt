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

class MakeNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makenote)
    }

    fun onBackButtonClicked(v: View?) {
        finish()
    }
}