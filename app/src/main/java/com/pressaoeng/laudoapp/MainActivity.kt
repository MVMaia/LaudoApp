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
import androidx.compose.ui.text.font.FontWeight
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
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth(0.85f)
                                        .fillMaxHeight(0.9f)
                                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                                        .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(16.dp)),
                                ){
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                    ){
                                        Column(
                                            modifier = Modifier
                                                .weight(1f)
                                                .fillMaxHeight(),
                                            verticalArrangement = Arrangement.Center,
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                        ) {
                                            Button(
                                                onClick = {},
                                                modifier = Modifier
                                                    .fillMaxWidth(0.85f)
                                                    .fillMaxHeight(0.85f),
                                                shape = RoundedCornerShape(18.dp),
                                                colors = ButtonDefaults.buttonColors(
                                                    containerColor = Color(0xFF37529F),
                                                    contentColor = Color.White,
                                                )
                                            ){
                                                Row(
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .fillMaxHeight(),
                                                    horizontalArrangement = Arrangement.Start,
                                                    verticalAlignment = Alignment.Top,
                                                ) {
                                                    Text(
                                                        text = "Agenda",
                                                        fontWeight = FontWeight.Bold,
                                                    )
                                                }
                                            }
                                        }

                                        Column(
                                            modifier = Modifier
                                                .weight(1f)
                                                .fillMaxHeight(),
                                            verticalArrangement = Arrangement.Center,
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                        ) {
                                            Button(
                                                onClick = {},
                                                modifier = Modifier
                                                    .fillMaxWidth(0.85f)
                                                    .fillMaxHeight(0.85f),
                                                shape = RoundedCornerShape(18.dp),
                                                colors = ButtonDefaults.buttonColors(
                                                    containerColor = Color(0xFF37529F),
                                                    contentColor = Color.White,
                                                ),
                                            ){
                                                Row(
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .fillMaxHeight(),
                                                    horizontalArrangement = Arrangement.Start,
                                                    verticalAlignment = Alignment.Top,
                                                ) {
                                                    Text(
                                                        text = "Histórico",
                                                        fontWeight = FontWeight.Bold,
                                                    )
                                                }
                                            }
                                        }
                                    }

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                            //.background(Color.Green),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                    ){

                                    }

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                            //.background(Color.Blue),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                    ){

                                    }

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                        verticalAlignment = Alignment.Bottom,
                                        horizontalArrangement = Arrangement.Center,
                                    ){
                                        Button(
                                            onClick = {},
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .fillMaxHeight(0.6f)
                                                .padding(8.dp),
                                            shape = RoundedCornerShape(15.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = Color(0xFF37529F),
                                                contentColor = Color.White,
                                            )
                                        ) {
                                            Text(
                                                text = "Gerar Laudo",
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold,
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

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "tem algo escrito aqui",
        modifier = modifier
    )
}*/