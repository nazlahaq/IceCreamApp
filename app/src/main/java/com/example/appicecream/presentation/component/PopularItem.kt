package com.example.appicecream.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appicecream.R
import com.example.appicecream.model.Popular
import com.example.appicecream.ui.theme.IceCreamAppTheme

@Composable
fun PopularItem(
    popular: Popular,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(popular.id)
        }
    ) {
        Image(
            painter = painterResource(id = popular.photo),
            contentDescription = popular.name, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = popular.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = popular.flavour,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PopularItemHorizontalPreview() {
    IceCreamAppTheme {
        PopularItem(
            popular = Popular(1, "Frozen Rose", "Es krim seperti mawar yang manis dan menyegarkan dengan sensasi dinginnya", "Vanilla Berry", R.drawable.frozen_rose),
            onItemClicked = { popularId ->
                println("Popular Id : $popularId")
            }
        )
    }
}