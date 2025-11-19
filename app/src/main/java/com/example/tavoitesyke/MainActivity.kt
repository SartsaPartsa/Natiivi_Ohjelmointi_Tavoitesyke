package com.example.tavoitesyke

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tavoitesyke.ui.theme.TavoitesykeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TavoitesykeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    TavoitesykeApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TavoitesykeApp(modifier: Modifier = Modifier) {
    var ageInput by remember { mutableStateOf("") }
    val age = ageInput.toIntOrNull()

    val (lower, upper) = if (age != null && age > 0) {
        val lowerBound = (220 - age) * 0.65f
        val upperBound = (220 - age) * 0.85f
        Pair(lowerBound, upperBound)
    } else {
        Pair(0.0f, 0.0f)
    }

    val lowerFormatted = String.format("%.1f", lower)
    val upperFormatted = String.format("%.1f", upper)

    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = ageInput,
            onValueChange = { ageInput = it.filter { char -> char.isDigit() } },
            label = { Text(text = stringResource(id = R.string.age)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = stringResource(
                id = R.string.your_heart_rate_limits_are,
                lowerFormatted,
                upperFormatted
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TavoitesykeAppPreview() {
    TavoitesykeTheme {
        TavoitesykeApp()
    }
}
