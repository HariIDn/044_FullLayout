package com.example.kelas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kelas3.ui.theme.Kelas3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kelas3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}
@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Cuaca",
        fontSize = 40.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(10.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(10.dp))
        Keterangan()

    }
}


@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan)){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
            painter = painterResource(id = R.drawable.sts_bg),
            contentDescription = "",
            modifier = Modifier
                .size(170.dp))
            Text(text = "Rain",
                fontSize = 25.sp,
            modifier = Modifier.padding(10.dp))
            
        }
    }
}

@Composable
fun Lokasi(){
    Text(text = "19°C",
    fontSize = 64.sp,
    fontWeight = FontWeight.Bold)
    Row(modifier = Modifier.padding(10.dp)) {
        Image(painter = painterResource(id = R.drawable.baseline_my_location_24),
            contentDescription = "",
        modifier = Modifier
            .size(35.dp))
        Spacer(modifier = Modifier.padding(2.dp))
        Text(text = "Jogja",
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold)

    }
    Text(
        text = "Kaishan, Bantul",
        textAlign = TextAlign.Center,
        color = Color.DarkGray)
}
@Composable
fun Keterangan(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan), ){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Row() {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Humidity")
                    Text(text = "70%")
                }
                Spacer(modifier = Modifier.padding(30.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "UV/ Index")
                }
            }
            Row() {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Subuh")
                    Text(text = "05:00")
                }
                Spacer(modifier = Modifier.padding(30.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Dzuhur")
                    Text(text = "11:49")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kelas3Theme {
        Home()
    }
}