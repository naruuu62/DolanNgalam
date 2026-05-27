package com.example.dolanngalam.presentation.autentikasi.resetPassword


import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

import com.example.dolanngalam.R
import com.example.dolanngalam.presentation.autentikasi.autentikasiViewModel
import com.example.dolanngalam.presentation.ui.theme.Blue
import com.example.dolanngalam.presentation.ui.theme.poppinsFont
import com.example.dolanngalam.presentation.ui_component.GreenButtonRegisterLogin

@Composable
fun ResetPasswordScreen2(navController: NavController, modifier: Modifier = Modifier, authViewModel: autentikasiViewModel = viewModel()) {
    val context = LocalContext.current
    val intent = (context as? ComponentActivity)?.intent
    val action = intent?.action
    val data = intent?.data

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Spacer(modifier = Modifier.height(257.dp))

        Text(
            text = "Email",
            fontSize = 20.sp,
            fontFamily = poppinsFont,
            fontWeight = FontWeight.Bold,
            color = Blue,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Silahkan cek Email anda untuk verifikasi",
            fontSize = 13.sp,
            fontFamily = poppinsFont,
            fontWeight = FontWeight.Normal,
            color = Blue,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(66.dp))

        Image(
            painter = painterResource(id = R.drawable.image_reset_password),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.height(42.dp))

        GreenButtonRegisterLogin(
            text = "Verifikasi",
            isEnabled = true,
            onClick = {
                navController.navigate("resetPassword")
                //KE PAGE SELANJUTNYA
            }

        )
    }


}





//@Preview (device = "spec:width=412dp,height=917dp",showSystemUi = false)
//@Composable
//private fun Screen() {
//  ResetPasswordScreen2()
//}