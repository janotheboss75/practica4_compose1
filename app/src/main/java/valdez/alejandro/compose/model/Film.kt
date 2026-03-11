package valdez.alejandro.compose.model

import valdez.alejandro.compose.R

data class Film(
    val id: Int,
    val title: String,
    val description: String,
    val imageRes: Int = 0
)

val sampleFilms = listOf(
    Film(id=1, title = "Titanic", description = "Romantic movie", imageRes = R.drawable.titanic),
    Film(id=2, title = "The Dark Knight", description = "Superhero action movie", imageRes = R.drawable.dark_night),
    Film(id=3, title = "Inception", description = "Science fiction thriller about dreams", imageRes = R.drawable.inception),
    Film(id=4, title = "Avengers: Endgame", description = "Epic superhero battle to save the universe", R.drawable.end_game),
    Film(id=5, title = "Jurassic Park", description = "Adventure movie about dinosaurs brought back to life", R.drawable.jurassic_park),
    Film(id=6, title = "The Matrix", description = "Science fiction movie about a simulated reality", R.drawable.matrix),
    Film(id=7, title = "Interstellar", description = "Space exploration movie about saving humanity", R.drawable.intertellar)
)
