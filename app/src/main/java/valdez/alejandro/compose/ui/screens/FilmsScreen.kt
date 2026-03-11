package valdez.alejandro.compose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import valdez.alejandro.compose.model.sampleFilms
import valdez.alejandro.compose.ui.components.FilmCard

@Composable
fun FilmsScreen(
    onFilmClick: (Int) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ){
        Text(text = "Listado de peliculas",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn(){
            items(items = sampleFilms){
                film ->
                FilmCard(film,{
                    onFilmClick(1)
                })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FilmsScreenPreview(){
    FilmsScreen({})
}