package com.codecollapse.jetcalculator.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codecollapse.jetcalculator.R
import com.codecollapse.jetcalculator.ui.theme.Switch1
import com.codecollapse.jetcalculator.ui.theme.Switch2
import com.codecollapse.jetcalculator.ui.theme.Switch3
import com.codecollapse.jetcalculator.ui.theme.TextColorLightGreen
import com.codecollapse.jetcalculator.ui.theme.TextColorLightRed
import com.codecollapse.jetcalculator.utils.CalculatorActions
import com.codecollapse.jetcalculator.utils.CalculatorState

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier,
    onAction: (CalculatorActions) -> Unit
) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .then(modifier)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = "Hello Compose",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.padding(24.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp
                ),
                colors = CardDefaults.cardColors(containerColor = Switch1),
                elevation = CardDefaults.cardElevation(4.dp),
                border = BorderStroke(1.dp, color = Switch1)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp, top = 22.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "AC",
                            style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 22.sp, color = TextColorLightGreen)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.backspace_40px),
                            contentDescription = stringResource(
                                R.string.remove_single_character
                            ), tint = TextColorLightGreen
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "%",  style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 22.sp, color = TextColorLightGreen))
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "÷",  style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 22.sp, color = TextColorLightRed))
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp, top = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "7")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "8")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "9")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "x", style = TextStyle(color = TextColorLightRed))
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp, top = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "4")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "5")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "6")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "-", style = TextStyle(color = TextColorLightRed))
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp, top = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "1")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "2")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "3")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "+", style = TextStyle(color = TextColorLightRed))
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp, bottom = 12.dp, top = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(2f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "0")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = ".")
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, color = Switch3)
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "=", style = TextStyle(color = TextColorLightRed))
                    }
                }
            }
        }
    }
}