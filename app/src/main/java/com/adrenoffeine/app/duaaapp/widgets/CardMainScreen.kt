package com.adrenoffeine.app.duaaapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adrenoffeine.app.duaaapp.R
import com.adrenoffeine.app.duaaapp.data.duaaData
import com.adrenoffeine.app.duaaapp.data.getduaa

//implementation for the card used in the main screen lazyGrid

@Preview(showBackground = true)
@Composable
fun MainScreenCard (duaa : duaaData = getduaa()[0],
                    onitemclick : (String) -> Unit = {}
                    ){
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))
                    .padding(7.dp)
                    .clickable {
                               onitemclick(duaa.id)
                    },
                elevation = 2.dp,
                backgroundColor = Color(0xFFD89662)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(all = 4.dp)
                ) {
                    Text(text = duaa.name, fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(15.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.pray),
                        contentDescription = "Icon ",
                        tint = Color(0xFFCFFA93)
                    )
                }
            }
}