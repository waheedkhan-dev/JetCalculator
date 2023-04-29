package com.codecollapse.jetcalculator.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .clickable { onClick() }
            .clip(RoundedCornerShape(10.dp))
            .then(modifier), contentAlignment = Alignment.Center

    ) {
        Text(text = symbol, fontSize = 22.sp, color = Color.White)
    }
    /* Box(modifier = Modifier
         .clip(RoundedCornerShape(12.dp))
         .clickable { onClick() }
         .then(modifier), contentAlignment = Alignment.Center) {
         Text(text = symbol, fontSize = 18.sp, color = Color.White)
     }*/
}