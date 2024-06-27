package com.example.tokopediacompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tokopediacompose.R
import com.example.tokopediacompose.model.ListBanner
import com.example.tokopediacompose.ui.theme.TokopediaComposeTheme
import kotlin.math.min

@Composable
fun MainCardCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card (
        modifier = modifier
            .widthIn(min = 200.dp, max = 300.dp)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .heightIn(min = 100.dp, max = 90.dp),
        shape = RoundedCornerShape(8.dp)
    ){
        Image(
            painter = painterResource(id = listBanner.imgBanner),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
    }
}

@Preview
@Composable
private fun MainCardCategoryPrev() {
    TokopediaComposeTheme {
        MainCardCategory(listBanner = ListBanner(
            R.drawable.banner1
        ))
    }
}