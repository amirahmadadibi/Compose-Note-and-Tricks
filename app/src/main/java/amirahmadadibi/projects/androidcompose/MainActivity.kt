package amirahmadadibi.projects.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amirahmadadibi.projects.androidcompose.ui.theme.AndroidComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeTheme {
                    Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyRow(modifier = Modifier.fillMaxSize()){
        items(100){
            Text(text = "AmirahmadAdibi")
        }
    }
//    LazyColumn(modifier = Modifier.fillMaxSize()){
//        items(100){
//            Text(text = "AmirahmadAdibi")
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeTheme {
        Greeting("An")
    }
}