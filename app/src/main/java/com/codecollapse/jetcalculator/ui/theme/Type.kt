package com.codecollapse.jetcalculator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codecollapse.jetcalculator.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.konkhmer_sleokchher_regular)),
        fontWeight = FontWeight.Medium,
        fontSize = 42.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.konkhmer_sleokchher_regular)),
        fontWeight = FontWeight.W300,
        fontSize = 22.sp,
        color = Switch4
    ),

    displayMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.konkhmer_sleokchher_regular)),
        fontWeight = FontWeight.W500,
        fontSize = 22.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */

)