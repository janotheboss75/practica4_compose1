package valdez.alejandro.compose.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DetailFilmCard( filmId: Int,
                    onClick: () -> Unit
){
    Text(text = "ID de la película: $filmId")
}

@Preview(showBackground = true)
@Composable
fun DetailFilmCardPreview(){
    DetailFilmCard(0,{})
}