package com.example.jetbizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetbizcard.ui.theme.JetBizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CreateBizCard("Hey! There")
                }
            }
        }
    }
}

@Composable
fun CreateBizCard(abc: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(modifier = Modifier
            .width(200.dp)
            .height(390.dp)
            .padding(12.dp),
            elevation = CardDefaults.cardElevation(
                2.dp
            ),
            shape = RoundedCornerShape(corner = CornerSize(20.dp)),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            content = {
                Surface(
                    modifier = Modifier
                        .size(150.dp)
                        .padding(5.dp),
                    color = MaterialTheme.colorScheme.surface.copy(alpha = 0.5f),
                    shadowElevation = 2.dp,
                    shape = RoundedCornerShape(30.dp)
                ) {

                    Image(
                        modifier = Modifier
                            .height(20.dp)
                            .width(30.dp)
                            .padding(5.dp)
                            .background(color = MaterialTheme.colorScheme.surface.copy(alpha = 0.5f)),
                        painter = painterResource(id = R.drawable.wellness_logo),
                        contentDescription = "wellness logo",
                        contentScale = ContentScale.Crop,
                    )

                }
            })
    }
}


@Preview(showBackground = true)
@Composable
fun BizCardPreview() {
    JetBizCardTheme {
        CreateBizCard("Hye! How are you ?")
    }
}