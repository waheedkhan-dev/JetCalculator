package com.codecollapse.jetcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codecollapse.jetcalculator.component.Calculator
import com.codecollapse.jetcalculator.ui.theme.JetCalculatorTheme
import com.codecollapse.jetcalculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetCalculatorTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.value
                val buttonSpacing = 8.dp
               /* Calculator(
                    state = state.state,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MediumGray).padding(16.dp),
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing
                )*/
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetCalculatorTheme {

    }
}