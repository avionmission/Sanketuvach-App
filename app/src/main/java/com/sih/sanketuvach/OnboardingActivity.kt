package com.sih.sanketuvach

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
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
import com.sih.sanketuvach.ui.theme.SanketuvachTheme

class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SanketuvachTheme {
                OnBoardingScreen()
            }
        }
    }
}

@Composable
fun OnBoardingScreen() {
    val context = LocalContext.current

    // Center the content in the screen
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            // Heading
            Spacer(Modifier.height(70.dp))
            Text(
                text = "\uD83D\uDC42 Sanketuvach",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            //            Spacer(Modifier.height(300.dp))

            // Main Buttons Of the Application
            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, ISLToTextActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(150.dp, 50.dp),
                border = BorderStroke(1.dp, Color(android.graphics.Color.BLACK)),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(android.graphics.Color.WHITE), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "Sign up with Google", color = Color.Black)
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
                border = BorderStroke(1.dp, Color(android.graphics.Color.BLACK)),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(android.graphics.Color.WHITE), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "Sign Up with Facebook", color = Color.Black)
            }

            //End in mkaking the two buttons of the applications
            Text(
                text = "CREATE ACCOUNT",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            var username by remember { mutableStateOf("") }
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Enter User Name") }, // Optional label
                modifier = Modifier
                    .fillMaxWidth() // Occupy full width
                    .padding(16.dp) // Add padding
            )


            var text by remember { mutableStateOf("") }

            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Enter Password") }, // Optional label
                modifier = Modifier
                    .fillMaxWidth() // Occupy full width
                    .padding(16.dp) // Add padding
            )
            Text(
                text = "Already Have an account ? Log In",
                fontSize = 10.sp
            )
            Button(
                onClick = {
                    /* Navigate to ISL to Text Activity */
                    context.startActivity(Intent(context, ISLToTextActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(150.dp, 50.dp),
                border = BorderStroke(1.dp, Color(android.graphics.Color.BLACK)),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(android.graphics.Color.BLACK), // Background color
                    contentColor = Color.White         // Text color
                ),
            ) {
                Text(text = "Login With Password", color = Color.White)
            }

        }
    }
}