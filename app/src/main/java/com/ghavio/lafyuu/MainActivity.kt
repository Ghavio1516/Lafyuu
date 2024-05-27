package com.ghavio.lafyuu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ghavio.lafyuu.DataProvider
import com.ghavio.lafyuu.FavoriteProductScreen
import com.ghavio.lafyuu.Home
import com.ghavio.lafyuu.Login
import com.ghavio.lafyuu.Register
import com.ghavio.lafyuu.SuperFlashSaleScreen
import com.ghavio.lafyuu.MobileProgramming_TugasUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileProgramming_TugasUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    AppTugasUI()
                }
            }
        }
    }
}

@Composable
fun AppTugasUI() {
    val navController :NavHostController = rememberNavController()
    var startDestination = "login"

    NavHost(navController = navController, startDestination = startDestination) {
        composable("login") { Login(navController) }
        composable("register") { Register(navController) }
        composable("home") { Home(navController)}
        composable("superFlashSale") { SuperFlashSaleScreen(navController) }
        composable("favorite") { FavoriteProductScreen(navController) }
//        composable("detailProduct") { DetailProductScreen(navController) }
    }
}
