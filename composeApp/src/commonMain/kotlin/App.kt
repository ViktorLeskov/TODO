import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screen.home.HomeScreen

@Composable
@Preview
fun App() {

    val colors by mutableStateOf(
        if(isSystemInDarkTheme()) darkColorScheme() else lightColorScheme()
    )

    MaterialTheme(colorScheme = colors) {
        Navigator(HomeScreen()){
            SlideTransition(it)
        }
    }

}