package com.example.appicecream.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appicecream.R
import com.example.appicecream.model.Recommend
import com.example.appicecream.ui.theme.IceCreamAppTheme

@Composable
fun RecommendItem(
    recommend: Recommend,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable {
            onItemClicked(recommend.id)
        }
    ) {
        Image(
            painter = painterResource(id = recommend.photo),
            contentDescription = recommend.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = recommend.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = recommend.flavour, color = MaterialTheme.colorScheme.primary)
                Text(text = " - ${recommend.newproduct}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecommendItemPreview() {
    IceCreamAppTheme {
        RecommendItem(
            recommend = Recommend(
                1,
                "Cookie Butter",
                R.drawable.cookiebutter,
                "New Product",
                "Es krim terbaru yang memadukan kelezatan butter lembut dengan rasa manis khas biskuit yang creamy dan memanjakan! Tekstur halus dan aroma wangi khas cookie butter memberikan sensasi nikmat yang sulit dilupakan. Cocok untuk pecinta rasa manis dengan cita rasa unik dan modern. Cookie Butter, kreasi baru yang siap menjadi favoritmu!",
                "Butter"
            ),
            onItemClicked = { recommendsId ->
                println("Recommend Id : $recommendsId")
            }
        )
    }
}