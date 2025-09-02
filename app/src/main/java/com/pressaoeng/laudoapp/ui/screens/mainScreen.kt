package com.pressaoeng.laudoapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pressaoeng.laudoapp.R
import com.pressaoeng.laudoapp.ui.components.LaudoButton
import com.pressaoeng.laudoapp.ui.components.MenuButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue




@Composable
fun MainBox(innerPadding: PaddingValues){
    var showOptions by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = innerPadding),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            //topbar
            TopBar()
            MainContent( onGerarLaudoClick = { showOptions = true } )
        }

        if(showOptions){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.7f)),
                contentAlignment = Alignment.Center,
            ){
                OptionsMenu(
                    dismiss = { showOptions = false },
                )
            }
        }
    }
}




@Composable
fun TopBar(){
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
                .height(60.dp)
                .aspectRatio(2.5f),
        )
    }
}

@Composable
fun MainContent(onGerarLaudoClick: () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        CenterBox( onGerarLaudoClick = onGerarLaudoClick)
    }

}


@Composable
fun CenterBox( onGerarLaudoClick: () -> Unit){

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
                .weight(0.75f),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,
        ){
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(0.30f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                MenuButton("Agenda", {}, Modifier.fillMaxWidth(0.85f).fillMaxHeight(0.85f))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(0.30f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                MenuButton("Histórico", {}, Modifier.fillMaxWidth(0.85f).fillMaxHeight(0.85f))
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.25f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center,
        ){
            LaudoButton("Gerar Laudo",onGerarLaudoClick, Modifier.fillMaxWidth().fillMaxHeight(0.6f).padding(8.dp))
        }


    }
}

@Composable
fun OptionsMenu( dismiss: () -> Unit ){
    Box(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .fillMaxHeight(0.75f)
            .background(Color.White, shape = RoundedCornerShape(25.dp))
            .border(width = 3.dp, Color.Black, shape = RoundedCornerShape(25.dp)),
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = "Something escrito here",
            color = Color.Black,
        )

        LaudoButton("Fechar", dismiss, Modifier.fillMaxWidth().fillMaxHeight(0.6f).padding(8.dp))
    }
}