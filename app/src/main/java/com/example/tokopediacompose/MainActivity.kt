package com.example.tokopediacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tokopediacompose.component.MainTopBar
import com.example.tokopediacompose.component.TopMenu
import com.example.tokopediacompose.model.dummyListTopMenus
import com.example.tokopediacompose.ui.theme.TokopediaComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TokopediaComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TokopediaClone()
                }
            }
        }
    }
}


@Composable
fun TokopediaClone(modifier: Modifier = Modifier) {
    Column(
        modifier  = modifier
            .verticalScroll(rememberScrollState())
    ) {
        MainTopBar()
        MainTopMenu()
    }
}


@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
private fun TokopediaClonePrev() {
    TokopediaComposeTheme {
        TokopediaClone()
    }
}


@Composable
fun MainTopMenu() {
    LazyRow{
        items(dummyListTopMenus){
            TopMenu(listTopMenu = it)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MainTopMenuPrev() {
    TokopediaComposeTheme {
        MainTopMenu()
    }
}