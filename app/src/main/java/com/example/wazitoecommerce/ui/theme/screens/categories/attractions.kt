package com.example.wazitoecommerce.ui.theme.screens.categories

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.wazitoecommerce.navigation.HERITAGE_URL
import com.example.wazitoecommerce.navigation.WILDLIFE_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun attractions(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Welcome to Kenya ",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
            Image(
                painter = painterResource(id = R.drawable.wildlife),
                contentDescription = "",
                modifier = Modifier.size(300.dp),
                contentScale = ContentScale.Fit
            )
            Button(onClick = {navController.navigate(WILDLIFE_URL)

            },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)
            ) {
                Text(text = "Wildlife")
            }




        Image(
            painter = painterResource(id = R.drawable.fort),
            contentDescription = "",
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Fit
        )
        Button(onClick = {navController.navigate(HERITAGE_URL)

        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)
        ) {
            Text(text = "Heritage")
        }

        
    }
}
@Composable
@Preview(showBackground = true)
fun attractionsPreview(){
    WazitoECommerceTheme {
        attractions(navController = rememberNavController())
    }
}