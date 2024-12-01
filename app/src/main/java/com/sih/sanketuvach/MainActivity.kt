package com.sih.sanketuvach

import android.content.Intent
import android.content.res.Resources.Theme
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.sih.sanketuvach.ui.theme.Primary
import com.sih.sanketuvach.ui.theme.SanketuvachTheme
import com.sih.sanketuvach.ui.theme.Secondary
import com.sih.sanketuvach.ui.theme.YellowPrimary
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SanketuvachTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
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
                    context.startActivity(Intent(context, HomePageActivity::class.java))
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
                Text(text = "Guest Mode", color = Color.Black)
            }

            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, MenuForSel::class.java))
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
                Text(text = "Sign in", color = Color.Black)
            }
        }
    }
}
