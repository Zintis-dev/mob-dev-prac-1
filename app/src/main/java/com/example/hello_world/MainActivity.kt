package com.example.hello_world

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_screen)

        var groupMembers = arrayListOf<String>("Zintis Susinskis", "Klāvs Renārs Tūtins", "Pauls Jānis Andersons")
        val developer = "Zintis Susinskis"
        val groupNumber: Int = 3

        val mainText = findViewById<TextView>(R.id.main_text)
        mainText.text = concatText(mainText, groupNumber.toString() + "\n")

        val developers = findViewById<TextView>(R.id.developers)
        val stringBuilder = StringBuilder()
        groupMembers.forEach {member ->
            stringBuilder.append("$member \n")
        }
        developers.text = stringBuilder.toString()

        val footerText = findViewById<TextView>(R.id.footer_text)
        footerText.text = concatText(footerText, "\n $developer")
    }

    private fun concatText(element: TextView, text: String): String {
        return "${element.text} $text"
    }
}
