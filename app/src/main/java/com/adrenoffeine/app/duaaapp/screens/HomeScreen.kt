package com.adrenoffeine.app.duaaapp.screens

import android.os.Build
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
import androidx.navigation.NavController
import com.adrenoffeine.app.duaaapp.R
import com.adrenoffeine.app.duaaapp.data.duaaData
import com.adrenoffeine.app.duaaapp.data.getduaa
import com.adrenoffeine.app.duaaapp.navigation.AppScreens
import com.adrenoffeine.app.duaaapp.screens.myprofile.profileScreen
import com.adrenoffeine.app.duaaapp.widgets.CardWidget
import com.adrenoffeine.app.duaaapp.widgets.MainScreenCard

@OptIn(ExperimentalFoundationApi::class)
//@Preview( showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen(
navController: NavController,
){
Column(modifier = Modifier.padding(all = 5.dp)) {
//top app bar section
    TopAppBar(
        title = {
        Text(text = "أدعية و أذكار", fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 15.dp))
    },
        modifier = Modifier.clip(RoundedCornerShape(12.dp)), actions = {
            Icon(imageVector = Icons.Outlined.Info, contentDescription = "Icon",modifier = Modifier
                .padding(12.dp)
                .clickable {
                    navController.navigate(AppScreens.profileScreen.name)
                })
        }

    )
    Divider()
    //
    Content(navController = navController)
}
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Content(
    navController: NavController,
    duaaList: List<duaaData> = getduaa()
){

    Surface(color = Color(0xD2C9E6C4)) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier.padding(all = 12.dp)
        ){
            items(items = duaaList){
//                MainScreenCard(duaa = it){duaa ->
//                    navController.navigate(route = AppScreens.DuaaScreen.name+"/$duaa")
//
//                }
                CardWidget(duaa = it){duaa ->
                    navController.navigate(route = AppScreens.DuaaScreen.name+"/$duaa")

                }
            }

        }
    }
}
