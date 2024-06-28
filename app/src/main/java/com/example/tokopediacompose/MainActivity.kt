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
import com.example.tokopediacompose.component.ListBottomCategory
import com.example.tokopediacompose.component.MainBannerVertical
import com.example.tokopediacompose.component.MainCardCategory
import com.example.tokopediacompose.component.MainImageCategory
import com.example.tokopediacompose.component.MainTopBar
import com.example.tokopediacompose.component.MainTopCategory
import com.example.tokopediacompose.component.TopMenu
import com.example.tokopediacompose.model.dummyListBanner
import com.example.tokopediacompose.model.dummyListBottomCategory
import com.example.tokopediacompose.model.dummyListCardForYou
import com.example.tokopediacompose.model.dummyListTopCategory
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
        MainCategoryTop()
        MainCategoryCard()
        MainCategoryBottom()
        MainCategoryImage()
        BannerVertical()
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

@Composable
fun MainCategoryTop() {
    LazyRow {
        items(dummyListTopCategory){
            MainTopCategory(listTopCategory = it)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MainCategoryTopPrev() {
    TokopediaComposeTheme {
        MainCategoryTop()
    }
}


@Composable
fun MainCategoryBottom() {
    LazyRow {
        items(dummyListBottomCategory){
            ListBottomCategory(listBottomCategory = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainCategoryBottomPrev() {
    TokopediaComposeTheme {
        MainCategoryBottom()
    }
}


@Composable
fun MainCategoryCard() {
    LazyRow {
        items(dummyListBanner){
            MainCardCategory(listBanner = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainCategoryCardPrev() {
    TokopediaComposeTheme {
        MainCategoryCard()
    }
}


@Composable
fun MainCategoryImage() {
    MainImageCategory()
}

@Preview(showBackground = true)
@Composable
private fun MainCategoryImagePrev() {
    TokopediaComposeTheme {
        MainCategoryImage()
    }
}


@Composable
fun BannerVertical() {
    LazyRow {
        items(dummyListCardForYou) {
            MainBannerVertical(listCardForYou = it)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun BannerVerticalPrev() {
    TokopediaComposeTheme {
        BannerVertical()
    }
}