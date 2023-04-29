package com.codecollapse.jetcalculator.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import com.codecollapse.jetcalculator.ui.theme.LightGray
import com.codecollapse.jetcalculator.ui.theme.Switch1
import com.codecollapse.jetcalculator.ui.theme.Switch2
import com.codecollapse.jetcalculator.ui.theme.Switch3
import com.codecollapse.jetcalculator.ui.theme.TextColorLightGreen
import com.codecollapse.jetcalculator.ui.theme.TextColorLightRed
import com.codecollapse.jetcalculator.utils.CalculatorActions
import com.codecollapse.jetcalculator.utils.CalculatorOperation
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
        Icon(
            painter = painterResource(id = R.drawable.light_mode_24px),
            contentDescription = stringResource(
                id = R.string.light_mode_icon
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopEnd)
                .padding(top = 16.dp, end = 16.dp),
            tint = LightGray
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = state.number1.plus(state.operation?.symbol ?: "").plus(state.number2),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(60.dp))
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
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Clear)
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "AC",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightGreen
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Delete)
                            }, contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.sharp_backspace_24),
                            contentDescription = stringResource(
                                R.string.remove_single_character
                            ), tint = TextColorLightGreen
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {

                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "%",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightGreen
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "÷",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightRed
                            )
                        )
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
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(7))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "7",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(8))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "8",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(9))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "9",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "✕",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightRed
                            )
                        )
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
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(4))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "4",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(5))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "5",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(6))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "6",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "−",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightRed
                            )
                        )
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
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(1))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "1",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(2))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "2",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Number(3))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "3",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "+",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightRed
                            )
                        )
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
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(2f)
                            .clickable {
                                onAction(CalculatorActions.Number(0))
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "0",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Decimal)
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = ".",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(color = Switch2)
                            .size(65.dp)
                            .weight(1f)
                            .clickable {
                                onAction(CalculatorActions.Calculate)
                            }, contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "=",
                            style = MaterialTheme.typography.displayMedium.copy(
                                color = TextColorLightRed
                            )
                        )
                    }
                }
            }
        }
    }
}