package amirahmadadibi.projects.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amirahmadadibi.projects.androidcompose.ui.theme.AndroidComposeTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier.background(Color.Red)
            .fillMaxSize(),
//            .size(width = 100.dp, height = 100.dp)

    contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name! ",
            modifier = Modifier.align(Alignment.BottomCenter)
        )
        Text(
            text = "AmirahmadAdibi",
            modifier = Modifier.align(Alignment.TopEnd)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeTheme {
        Greeting("Android")
    }
}