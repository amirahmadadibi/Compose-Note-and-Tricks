package amirahmadadibi.projects.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amirahmadadibi.projects.androidcompose.ui.theme.AndroidComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidComposeTheme {
                var count = remember {
                    mutableStateOf(0)
                }
                Column {
                    Text("${count.value}")
                    Button(onClick = {
                        count.value = count.value + 1
                    }) {
                        Text(text = "Click")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyColumn(modifier = Modifier.fillMaxSize()){
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

}