package com.example.dolanngalam

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dolanngalam.presentation.autentikasi.login.LoginScreen
import com.example.dolanngalam.presentation.autentikasi.register.RegisterScreen
import com.example.dolanngalam.presentation.autentikasi.resetPassword.ResetPasswordScreen1
import com.example.dolanngalam.presentation.autentikasi.resetPassword.ResetPasswordScreen2
import com.example.dolanngalam.presentation.autentikasi.resetPassword.ResetPasswordScreen4
import com.example.dolanngalam.data.local.SessionManager

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainScreen(navController: NavHostController, sessionManager: SessionManager) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("sendemail") { ResetPasswordScreen1(navController) }
        composable("verifemail") { ResetPasswordScreen2(navController) }
        composable("resetpassword") { ResetPasswordScreen4(navController) }
    }
}