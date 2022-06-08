package com.adrenoffeine.app.duaaapp.screens


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.adrenoffeine.app.duaaapp.data.getduaa
import com.adrenoffeine.app.duaaapp.ui.theme.BlueViolet1
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.Temporal
import java.util.*
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DuaaScreen(navController: NavController,
               duaaId: String?){
    val newduaalist = getduaa().filter {duaa ->
        duaa.id ==  duaaId
    }
    val listsize = newduaalist[0].duaaLists.size
    val configuration = LocalConfiguration.current
    val screenwidth = configuration.screenWidthDp.dp - 25.dp

    Surface( color = BlueViolet1) {
        Column(modifier = Modifier.padding(all = 5.dp)) {


        TopAppBar(
            title = {
                Text(
                    text = "أدعية و أذكار", fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 15.dp)
                )
            },
            modifier = Modifier.clip(RoundedCornerShape(12.dp))
            ,
            actions = {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Icon back", modifier = Modifier
                        .padding(10.dp)
                        .size(50.dp)
                        .clickable {
                            navController.popBackStack()
                        }
                )
            })
        //Text(text = newduaalist[0].name)
        Spacer(modifier = Modifier.height(10.dp))
            Box (modifier = Modifier.fillMaxWidth(),contentAlignment = Center){
                Text(text = newduaalist[0].name,
                    style = MaterialTheme.typography.h5
                )
            }

        LazyRow {
            val test = newduaalist[0].duaaLists.size
            items(newduaalist[0].duaaLists) { item ->
                Card(
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp, bottom = 40.dp, top = 40.dp)
                        .width(screenwidth - 10.dp)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(15.dp)),
                    backgroundColor = Color.LightGray
                ) {
                    Text(
                        text = item,
                        style = MaterialTheme.typography.h6,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center,
                        maxLines = 40,
                        modifier = Modifier
                            .padding(top = 15.dp, start = 15.dp, end = 15.dp)

                    )
                }

            }
        }
    }
    }
}

//---------------------------------------------------------------------------------------------------
//        Column(modifier = Modifier.fillMaxSize()) {
//            LazyRow(
//                modifier = Modifier
//                    .height(50.dp).align(CenterHorizontally)
//            ) {
//                items(newduaalist[0].duaaLists){ item ->
//                    Card(modifier = Modifier
//                        .width(screenwidth)
//                        .padding(top = 50.dp),
//                        shape = RoundedCornerShape(20.dp)
//                    ){
//                        Box(modifier = Modifier
//                            .fillMaxSize()
//                            .align(CenterHorizontally)
//                        ) {
//                            Text(text = item)
//                        }
//                    }
//                }
//            }
//        }
//    }
//}

//@RequiresApi(Build.VERSION_CODES.O)
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun test (){
//    val date =LocalDate().
//    Text(text = "$date")
//}
