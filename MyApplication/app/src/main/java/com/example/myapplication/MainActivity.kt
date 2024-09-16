package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Author(
                        groupNumber = "Group 3",
                        groupMembers = listOf("Pauls Jānis Andersons", "Klāvs Renārs Tūtins", "Zintis Susinskis", "Zintis Susinskis"),
                        developerName = "Pauls Jānis Andersons",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Author(groupNumber: String, groupMembers: List<String>, developerName: String, modifier: Modifier = Modifier) {
    Column( // Centers the text content
        modifier = modifier
            .padding(16.dp), // Adds padding around the content
        verticalArrangement = Arrangement.Center, // Centers text vertically
        horizontalAlignment = Alignment.CenterHorizontally // Centers text horizontally
    ) {
        Text( // First text
            text = "This is the first application from $groupNumber:",
            fontSize = 24.sp,
            textAlign = TextAlign.Center // Center aligns the text
        )
        Spacer(modifier = Modifier.height(16.dp)) // Adds space between text

        groupMembers.forEach { member -> // Group members text
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth() // Ensures the Row fills the available width
                    .padding(start = 32.dp) // Add padding to the whole row to shift the bullet and text together
            ) {
                Text( // Bullet point symbol
                    text = "•",
                    fontSize = 20.sp,
                    modifier = Modifier.width(20.dp) // Space between bullet point and text
                )
                Text( // Member name
                    text = member,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text( // Developed text
            text = "And the application was developed by \n$developerName",
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}