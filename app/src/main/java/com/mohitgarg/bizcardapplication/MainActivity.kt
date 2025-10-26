package com.mohitgarg.bizcardapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mohitgarg.bizcardapplication.ui.theme.BizCardApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BizCardApplicationTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CreteBiCard()
                }
            }
        }
    }
}

@Composable
fun CreteBiCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(400.dp)
                .padding(10.dp),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
            elevation = CardDefaults.cardElevation(),
            colors = CardDefaults.cardColors(
                contentColor = Color.DarkGray, containerColor = Color.White
            )
        ) {

        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BizCardApplicationTheme {
        CreteBiCard()
    }
}