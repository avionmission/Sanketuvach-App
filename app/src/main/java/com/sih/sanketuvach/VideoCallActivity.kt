package com.sih.sanketuvach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

/**
 1. Button to create new room
 2. Text box and button to enter room id
 3. Start video call by creating a shared room
 4. Generate captions on video footage of the other person by overlaying ISL translations on top
 */


class VideoCallActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Content for Video Call Activity (Empty for now)
        }
    }
}