package com.sih.sanketuvach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

/*
UX:
1. Button to turn camera on or off
2. Display translations of ISL in English
3. Dropdown to select language (API to translate)
4. Toggle to turn on Speech (TTS every time a new sentence is display)
5.
*/

class ISLToTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Content for ISL to Text Activity (Empty for now)
            Text(
                text = "Add code here..."
            )
        }
    }
}