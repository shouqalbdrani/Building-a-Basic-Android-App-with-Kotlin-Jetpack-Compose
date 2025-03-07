package com.example.buildingbasicandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.foundation.border
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import com.example.buildingbasicandroidapp.ui.theme.BuildingBasicAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuildingBasicAndroidAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UIscreen(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun UIscreen(name: String, modifier: Modifier = Modifier) {
    var isAddedToWatchlist by remember { mutableStateOf(false) }
    //var isDarkTheme by remember {mutableStateOf(false)}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0Xff151515))
            .padding(20.dp),

        ) {
        Box(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .padding(bottom = 20.dp, top = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.bridgerton),
                contentDescription = "Bridgerton series",
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = "Bridgton Series ",
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            color = Color.White
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top =16.dp),
        ) {
            Text(
                modifier = Modifier.padding(end = 30.dp),
                text = "2023",
                color = Color.White,
                fontSize = 20.sp,
            )
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "720p",
                color = Color.White,
                fontSize = 16.sp
            )
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "1080p",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 400.dp, start = 20.dp, end = 20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "Play",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
    }
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 455.dp, start = 20.dp, end = 20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "Download",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
    }
    Button(
        onClick = {
            isAddedToWatchlist = !isAddedToWatchlist
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 700.dp ,start = 20.dp, end = 200.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isAddedToWatchlist) Color.Red else Color.White,
            contentColor = if (isAddedToWatchlist) Color.White else Color.Black
        )
    ) {
        Text(
            text = if (isAddedToWatchlist) "Added to Watchlist" else "Add to Watchlist",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
    }
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 520.dp, start = 20.dp, end = 20.dp),
        text = "Bridgerton is a period drama that takes place in 19th-century London, The series explores themes of love, family, and social status, while adding intrigue through the mysterious 'Lady Whistledown.' With its lush visuals and diverse cast, Bridgerton offers a modern take on historical romance.",
        fontSize = 16.sp,
        color = Color.White,
    )
//    Button(
//        onClick = toggleTheme,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 530.dp),
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Gray,
//            contentColor = Color.White
//        )
//    ) {
//        Text(
//            text = "Toggle Theme",
//            fontWeight = FontWeight.Bold,
//            fontSize = 16.sp,
//        )

        }


            @Preview(showBackground = true)
            @Composable
            fun GreetingPreview() {
                BuildingBasicAndroidAppTheme {
                    UIscreen("Android")
                }
            }

