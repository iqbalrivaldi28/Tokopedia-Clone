package com.example.tokopediacompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tokopediacompose.R
import com.example.tokopediacompose.model.ListCardForYou
import com.example.tokopediacompose.ui.theme.TokopediaComposeTheme

@Composable
fun MainBannerVertical(modifier: Modifier = Modifier, listCardForYou: ListCardForYou) {
    Card(
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(Color.Transparent),
        modifier = modifier.padding(start = 16.dp, bottom = 8.dp, end = 4.dp, top = 8.dp)
    ) {
        Image(
            painter = painterResource(id = listCardForYou.imgCard),
            contentDescription = stringResource(id = listCardForYou.txtDesc)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainBannerVerticalPrev() {
    TokopediaComposeTheme {
        MainBannerVertical(listCardForYou = ListCardForYou(
            R.drawable.banner_vertikal1,
            R.string.txt_desc_first_banner
        )
        )
    }
}