package com.pressaoeng.laudoapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import com.pressaoeng.laudoapp.ui.theme.LaudoAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaudoAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFF37529F),

                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            modifier = Modifier.fillMaxSize(),
                        ) {
                            //topbar
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(60.dp)
                                    .background(Color.White),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pressaologowbg),
                                    contentDescription = "Logo",
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(150.dp),
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                contentAlignment = Alignment.Center
                            ) {
                                //centerBox
                                Column(
                                    modifier = Modifier
                                        .width(325.dp)
                                        .height(700.dp)
                                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                                        .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp)),
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .width(325.dp)
                                            .weight(1f)
                                            .background(Color.Blue),
                                    ){
                                        Text("OLOCOS TEM SOMETHING DIGITADO HERE")
                                    }

                                    Row(
                                        modifier = Modifier
                                            .width(325.dp)
                                            .weight(1f)
                                            .background(Color.Red),
                                    ){
                                        Text("OLOCOS TEM SOMETHING DIGITADO HERE")
                                    }

                                    Row(
                                        modifier = Modifier
                                            .width(325.dp)
                                            .weight(1f)
                                            .background(Color.Green),
                                    ){
                                        Text("OLOCOS TEM SOMETHING DIGITADO HERE")
                                    }

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                        horizontalArrangement = Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ){
                                        Button(
                                            onClick = {},
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .fillMaxHeight()
                                                .padding(horizontal = 15.dp, vertical = 60.dp),
                                            shape = RoundedCornerShape(15.dp),
                                        ) {
                                            Text(
                                                text = "Butão"
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "tem algo escrito aqui",
        modifier = modifier
    )
}