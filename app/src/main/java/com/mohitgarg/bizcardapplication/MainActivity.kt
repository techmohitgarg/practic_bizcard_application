package com.mohitgarg.bizcardapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mohitgarg.bizcardapplication.ui.compose.CreateProfileImageCompose
import com.mohitgarg.bizcardapplication.ui.compose.PortfolioContent
import com.mohitgarg.bizcardapplication.ui.compose.ProfileDetailCompose
import com.mohitgarg.bizcardapplication.ui.theme.BizCardApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BizCardApplicationTheme {
                Scaffold { innerPadding ->
                    CreteBiCard(modifier = Modifier.padding(innerPadding))
                }
            }
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

@Composable
fun CreteBiCard(modifier: Modifier = Modifier) {
    val buttonClickedState = remember { mutableStateOf(false) }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier.padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(16.dp)),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(
                contentColor = Color.DarkGray, containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateProfileImageCompose(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(5.dp)
                )
                HorizontalDivider(
                    modifier = Modifier.padding(top = 10.dp),
                    thickness = 5.dp,
                    color = Color.LightGray
                )
                ProfileDetailCompose()

                Button(
                    modifier = Modifier.padding(top = 10.dp),
                    onClick = {
                        buttonClickedState.value = buttonClickedState.value.not()
                    }
                ) {
                    Text(
                        text = stringResource(R.string.portfolio),
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.White
                    )
                }
                AnimatedVisibility(
                    visible = buttonClickedState.value,
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically()
                ) {
                    PortfolioContent()
                }
            }
        }
    }
}

