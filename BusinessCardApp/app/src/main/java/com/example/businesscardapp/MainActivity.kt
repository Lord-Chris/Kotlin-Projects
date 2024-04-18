package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp(Modifier.fillMaxSize())
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    val name = stringResource(id = R.string.my_name)
    val phone = stringResource(id = R.string.phone)
    val link = stringResource(id = R.string.link)
    val email = stringResource(id = R.string.email)
    Box(
        modifier.background(
            color = colorResource(R.color.teal_200)
        ),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Spacer(modifier = Modifier.weight(.5f))
            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.purple_700))
            ) {
                Image(
                    modifier = Modifier.size(width = 100.dp, height = 100.dp),
                    painter = image,
                    contentDescription = null,
                )
            }
            Text(
                text = name,
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                lineHeight = 33.sp,
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.purple_700)
            )
            Spacer(modifier = Modifier.weight(.5f))
            InfoDetail(icon = Icons.Filled.Phone, text = phone)
            InfoDetail(icon = Icons.Filled.Share, text = link)
            InfoDetail(icon = Icons.Filled.Email, text = email)
            Box(modifier = Modifier.height(24.dp))

        }
    }
}

@Composable
fun InfoDetail(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .weight(.3f)
                .padding(end = 8.dp)
        ) {
            Icon(
                icon, contentDescription = null,
                tint = colorResource(id = R.color.purple_700),
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }
        Text(
            text = text,
            modifier = Modifier.weight(.7f),
            color = colorResource(id = R.color.black),
        )
    }
}
