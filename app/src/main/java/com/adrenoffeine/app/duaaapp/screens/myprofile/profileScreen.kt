package com.adrenoffeine.app.duaaapp.screens.myprofile

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.adrenoffeine.app.duaaapp.R
import com.adrenoffeine.app.duaaapp.ui.theme.*

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun profileScreen(
navController: NavController
){
    val configuration = LocalConfiguration.current

    val orientation = configuration.orientation
    val screenwidth = configuration.screenWidthDp.dp - 35.dp
    val description:String = "هذا العمل مجاني بدون اي اعلانات في سبيل الله\n" +
            "ادعو الله ان يجعله كنزا في ميزان حسناتي وحسناتكم \n" +
            "ادعو لي بالخير في كل مرة تفتح هذا التطبيق \n" +
            "ربِ اغفر لي ولوالدي وللمسلمين اجمعين \n"
    Box(
        modifier = Modifier
            .background(BlueViolet1)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
            .fillMaxHeight()
        ) {

            Image(
                painter = painterResource(id = R.drawable.logox),
                contentDescription = "myphoto", modifier = Modifier
                    .clip(CircleShape)
                    .size(120.dp)
                    .border(width = 2.dp, color = Color.Red, shape = CircleShape,)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.DarkGray, fontWeight = FontWeight.Bold, fontSize = 22.sp, shadow = Shadow(color = Color.LightGray, offset = Offset.Zero, blurRadius = 0.01f))){
                        append("محمد حنني/ Mohammed Hanani ")

                    }
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(modifier = Modifier
                .width(screenwidth)
                .height(screenwidth + 60.dp)
                .background(BlueViolet2)
                .clip(RoundedCornerShape(corner = CornerSize(15.dp)))
                .padding(8.dp)) {
//                val intent = Intent(Intent.ACTION_SENDTO)
//                intent.setData(Uri.parse("mailto:"))
//                intent.putExtra(Intent.EXTRA_EMAIL,"mohammedhanani052@gmail.com")
//                intent.putExtra(Intent.EXTRA_SUBJECT,"buisness")
//                val context = LocalContext.current
                Canvas(modifier = Modifier){
                    val color1 = listOf(Color.Red,Color.Green,Color.Blue)
                    val color2 = listOf(Color.Yellow,Color.Red,Color.Magenta)
                    val color4 = listOf(Color.Red,Color.Cyan, Purple200)
                    val color5 = listOf(OrangeYellow1,Color.Green,Color.Blue)
                    val color6 = listOf(Color.Red, OrangeYellow2,Color.Red)
                    drawCircle(brush = Brush.horizontalGradient(colors = color1), radius = 50f, center = Offset(234f,523f), alpha = 0.2f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color2), radius = 70f, center = Offset(234f,223f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color6), radius = 80f, center = Offset(380f,623f), alpha = 0.2f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color4), radius = 120f, center = Offset(754f,583f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 40f, center = Offset(234f,793f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color1), radius = 25f, center = Offset(584f,673f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color2), radius = 130f, center = Offset(434f,803f), alpha = 0.2f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(134f,123f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color4), radius = 85f, center = Offset(234f,223f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color6), radius = 90f, center = Offset(174f,773f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color6), radius = 90f, center = Offset(899f,773f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color1), radius = 25f, center = Offset(284f,173f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color2), radius = 130f, center = Offset(4194f,303f), alpha = 0.2f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(834f,623f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color4), radius = 85f, center = Offset(934f,523f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color6), radius = 90f, center = Offset(174f,773f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(734f,623f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(334f,523f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(234f,923f), alpha = 0.1f)
                    drawCircle(brush = Brush.horizontalGradient(colors = color5), radius = 95f, center = Offset(234f,193f), alpha = 0.1f)
                }
                Box(modifier = Modifier
                        .scrollable(
                        state = rememberScrollState(),
                    orientation = Orientation.Vertical,
                    enabled = true,reverseDirection = true)

                    .width(screenwidth)
                    .height(screenwidth + 60.dp)
                    .background(Color.Transparent)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))
                    .padding(8.dp)) {
                    Column() {
                        Text(
                            text = description,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.h6
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "خبير في برمجة تطبيقات الهواتف الذكية وتطويرها " +
                                    "والاعلان والتسويق الالكتروني " +
                                    "للمزيد من المعلومات او التواصل من اجل العمل " +
                                    "الرجاء التواصل عبر البريد الالكتروني "
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier
                            .background(BlueViolet3)
                            .alpha(0.5f)
                            ) {
                            Text(text = "mohammedhanani052@gmail.com", color = Color.DarkGray)
                            Icon(imageVector = Icons.Rounded.Email, contentDescription = "mail",
                                modifier = Modifier.clickable {
                                //click handler
                            })

                        }
                    }
                }
            }

            }

        }
    }


//Column() {
//
//
//    Text(
//        text = description,
//        textAlign = TextAlign.Center,
//        style = MaterialTheme.typography.h6
//    )
//    Spacer(modifier = Modifier.height(16.dp))
//    Text(
//        text = "خبير في برمجة تطبيقات الهواتف الذكية وتطويرها " +
//                "والاعلان والتسويق الالكتروني " +
//                "للمزيد من المعلومات او التواصل من اجل العمل " +
//                "الرجاء التواصل عبر البريد الالكتروني "
//    )
//}
//


//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun test(){
//    val configuration = LocalConfiguration.current
//    val color1 = listOf(Color.Red,Color.Green,Color.Blue)
//    val screenwidth = configuration.screenWidthDp.dp - 35.dp
//        Canvas(modifier = Modifier){
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(100f,100f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(200f,200f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(300f,300f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(400f,400f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(500f,500f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(333f,99f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(700f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(800f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(900f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(1000f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(1100f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(1200f,323f), alpha = 0.3f)
//            drawCircle(color = BlueViolet1, radius = 50f, center = Offset(1300f,323f), alpha = 0.3f)
//
//        }
//}