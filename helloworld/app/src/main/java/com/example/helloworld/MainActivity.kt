package com.example.helloworld

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textViewGroup = findViewById<TextView>(R.id.textView6)
        val textViewKlavs = findViewById<TextView>(R.id.textView8)
        val textViewDynamic = findViewById<TextView>(R.id.textView9)
        val textViewPauls = findViewById<TextView>(R.id.textView10)
        val textViewDeveloped = findViewById<TextView>(R.id.textView11)

        textViewGroup.text = "Group 3"
        textViewKlavs.text = "Klāvs Renārs Tūtins"
        textViewDynamic.text = "Zintis Susinskis"
        textViewPauls.text = "Pauls Jānis Andersons"
        textViewDeveloped.text = "Developed by Klāvs Renārs Tūtins"

        val mainLayout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
