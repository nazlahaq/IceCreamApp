package com.example.appicecream.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appicecream.R
import com.example.appicecream.model.About
import com.example.appicecream.ui.theme.IceCreamAppTheme

@Composable
fun AboutMe(
    about: About,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        // Gambar profil berbentuk lingkaran
        Image(
            painter = painterResource(id = about.photo),
            contentDescription = about.name,
            contentScale = ContentScale.Crop, // Agar gambar mengisi area lingkaran
            modifier = Modifier
                .size(120.dp) // Ukuran sedang (120x120 dp)
                .clip(CircleShape) // Bentuk elips (lingkaran)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = about.name,
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun AboutMePreview() {
    IceCreamAppTheme {
        AboutMe(
            about = About(
                id = 1,
                name = "Nazlah Addini Haq Fajriani",
                email = "nazlahfajriani@gmail.com",
                university = "Universitas Bani Saleh",
                major = "Teknik Informatika",
                photo = R.drawable.nazlah
            )
        )
    }
}
