package co.amity.eliza.discoveramity

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHost
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostContainer() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = {
            SnackbarHost(
                it,
                Modifier.fillMaxWidth()
            ) { data ->
                Snackbar(
                    snackbarData = data,
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Main.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Main.route) {
                MainScreen { navController.navigate(Communities.route) }
            }
            composable(route = Communities.route) {
                CommunitiesScreen()
            }
        }
    }
}