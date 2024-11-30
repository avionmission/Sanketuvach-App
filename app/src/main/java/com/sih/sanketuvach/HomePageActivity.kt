package com.sih.sanketuvach

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sih.sanketuvach.ui.theme.SanketuvachTheme
import com.sih.sanketuvach.ui.theme.Secondary

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SanketuvachTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val context = LocalContext.current

    // Center the content in the screen
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            // Heading
            Text(
                text = "\uD83D\uDC42 Sanketuvach",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(15.dp))

            // Buttons
            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, ISLToTextActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(150.dp, 50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(Secondary.value), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "ISL to Text", color = Color.Black)
            }

            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, TextToISLActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(150.dp, 50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(Secondary.value), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "Text to ISL", color = Color.Black)
            }

            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, VideoCallActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(150.dp, 50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(Secondary.value), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "Video Call", color = Color.Black)
            }
        }
    }
}