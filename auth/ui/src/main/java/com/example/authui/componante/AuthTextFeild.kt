package com.example.authui.componante

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AuthTextField(
    text: String,
    onValueChange: (String) -> Unit,
    label: String
) {

    var textFieldText by remember { mutableStateOf(text) }
    var isIdError by remember { mutableStateOf(false) }

    val containerColor = Color(0xFFEFEEEE)
    OutlinedTextField(
        value = textFieldText,
        onValueChange = {
            textFieldText = it
            onValueChange(it)
            isIdError = it.isEmpty()
        },
        modifier = Modifier
            .width(350.dp)
            .wrapContentHeight()
            .padding(20.dp, 12.dp, 20.dp, 12.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(22.dp),
                clip = true
            ),
        shape = RoundedCornerShape(22.dp),
        colors = TextFieldDefaults.colors(
            disabledTextColor = Color.Transparent,
            focusedContainerColor = containerColor,
            unfocusedContainerColor = containerColor,
            disabledContainerColor = containerColor,
            focusedIndicatorColor = Color.Black,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        label = { Text(text = label) },
        maxLines = 1
    )
}