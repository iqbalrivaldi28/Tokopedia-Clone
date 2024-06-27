package com.example.tokopediacompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tokopediacompose.R
import com.example.tokopediacompose.model.ListCategory
import com.example.tokopediacompose.ui.theme.TokopediaComposeTheme

@Composable
fun MainTopCategory(modifier: Modifier = Modifier, listTopCategory: ListCategory) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Image(
            painter = painterResource(id = listTopCategory.imgTopCategory),
            contentDescription = null,
            modifier = modifier.size(40.dp)
        )
        Text(
            text = stringResource(id = listTopCategory.txtTopCategory),
            fontSize = 12.sp
        )
    }
}

@Preview( showBackground = true)
@Composable
private fun MainTopCategoryPrev() {
    TokopediaComposeTheme {
        MainTopCategory(listTopCategory = ListCategory(
            R.drawable.cicil, R.string.txt_credit
        ))
    }
}