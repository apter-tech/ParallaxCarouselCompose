package tech.apter.parallaxcarouselcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tech.apter.parallaxcarouselcompose.ui.ParallaxCarousel
import tech.apter.parallaxcarouselcompose.ui.theme.ParallaxCarouselComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ParallaxCarouselComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        ParallaxCarousel()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ParallaxCarouselPreview() {
    ParallaxCarouselComposeTheme {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            ParallaxCarousel()
        }
    }
}
