package amirahmadadibi.projects.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amirahmadadibi.projects.androidcompose.ui.theme.AndroidComposeTheme
import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidComposeTheme {
                var name by remember {
                    mutableStateOf("")
                }

                var nameList by remember {
                    mutableStateOf(listOf<String>())
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        OutlinedTextField(modifier = Modifier.weight(1f),value = name, onValueChange = { text ->
                            name = text
                        })
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = {
                                nameList = nameList + name
                        }) {
                            Text(text = "Add")
                        }
                    }
                    LazyColumn {
                        items(nameList) { item ->
                            Text(text = item, modifier = Modifier.fillMaxWidth().padding(16.dp))
                            Divider()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(100) {
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