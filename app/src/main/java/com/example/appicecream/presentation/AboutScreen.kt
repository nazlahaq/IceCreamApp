package com.example.appicecream.presentation

import androidx.compose.foundation.layout.* // Layout utilities
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items // Lazy grid items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appicecream.data.DummyData
import com.example.appicecream.model.About
import com.example.appicecream.presentation.component.AboutMe
import com.example.appicecream.ui.theme.IceCreamAppTheme

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    abouts: List<About> = DummyData.aboutMe // Make sure DummyData.aboutMe returns List<About>
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 160.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(abouts, key = { it.id }) { about ->
            Card(
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // Display profile picture and info using AboutMe composable
                    AboutMe(about = about)

                    Spacer(modifier = Modifier.height(16.dp))

                    // Display additional personal information
                    Text(
                        text = "Personal Information",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Email: ${about.email}",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "University: ${about.university}",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "Major: ${about.major}",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AboutScreenPreview() {
    IceCreamAppTheme {
        AboutScreen(abouts = DummyData.aboutMe)
    }
}
