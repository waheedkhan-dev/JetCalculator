package com.codecollapse.jetcalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.codecollapse.jetcalculator.utils.CalculatorActions
import com.codecollapse.jetcalculator.utils.CalculatorState

class CalculatorViewModel : ViewModel() {

    var state by  mutableStateOf(CalculatorState())
        private set

    fun onAction(action : CalculatorActions){
       /* when(action){
            is CalculatorActions.Number -> enterNumber(action.number)
        }*/
    }
}