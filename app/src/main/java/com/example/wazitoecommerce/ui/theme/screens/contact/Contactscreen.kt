package com.example.wazitoecommerce.ui.theme.screens.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.CATEGORIES_URL
import com.example.wazitoecommerce.navigation.CONTACT_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun Contactscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {



        //Centering an image
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress,
                modifier = Modifier.size(300.dp)
            )



        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Contact Us Today ",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "For general inquiries or assistance, please don't hesitate to contact us. ",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.telephone),
            contentDescription = "",
            modifier = Modifier.size(30.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "0792710287",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )


        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.mail),
            contentDescription = "",
            modifier = Modifier.size(30.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "collinsmasiolo28@gmail.com",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {navController.navigate(CATEGORIES_URL)

        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)
        ) {
            Text(text = "Continue")
        }



    }
}
@Composable
@Preview(showBackground = true)
fun ContactscreenPreview(){
    WazitoECommerceTheme {
        Contactscreen(navController = rememberNavController())
    }
}