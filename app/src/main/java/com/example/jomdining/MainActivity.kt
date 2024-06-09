package com.example.jomdining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jomdining.ui.FoodOrderingModuleScreen
import com.example.jomdining.ui.JomDiningViewModel
import com.example.jomdining.ui.NavigationGraph
import com.example.jomdining.ui.theme.JomDiningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JomDiningTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                )
//                {
//                    val viewModel: JomDiningViewModel = viewModel(factory = JomDiningViewModel.factory)
//                    FoodOrderingModuleScreen(
//                        viewModel = viewModel,
//                        modifier = Modifier.fillMaxSize()
//                    )
//                }
                {
                    NavigationGraph()
                }
            }
        }
    }
}