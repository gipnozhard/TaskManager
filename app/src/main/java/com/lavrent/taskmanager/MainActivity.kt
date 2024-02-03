package com.lavrent.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lavrent.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(stringResource(R.string.all_tasks_completed), stringResource(R.string.nice_work))
                }
            }
        }
    }
}

@Composable
fun Greeting(name1: String, name2: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, //выравниваие содержимого по центру горизонтали
        verticalArrangement = Arrangement.Center // выравниваие содержимого по центру вертикали
        )
    {
        Image(
            painter = painterResource (id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = name1, // ресурс string
            modifier = modifier.padding(
                top = 24.dp, // заполнение(отступ) сверху
                bottom = 8.dp // заполнение(отступ) снизу
            ),
            fontWeight = FontWeight.Bold, // Вес(толщина) шрифта (Эквивалентно значению W800)
        )
        Text(
            text = name2, // ресурс string
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Greeting(stringResource(R.string.all_tasks_completed), stringResource(R.string.nice_work))
    }
}