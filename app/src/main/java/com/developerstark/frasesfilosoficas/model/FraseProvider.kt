package com.developerstark.frasesfilosoficas.model
class FraseProvider {
    companion object{
        fun random():FraseModel{
            val position = (0..11).random()
            return frase[position]
        }
    private val frase= listOf<FraseModel>(
        FraseModel(
            frase = "«Las verdaderas batallas se libran en el interior.»",
            autor = "Sócrates"),
        FraseModel(
            frase = "«Lo más sabio es el tiempo, porque esclarece todo.»",
            autor = "Tales de Mileto"),
        FraseModel(
            frase = "«La vida debe ser vivida como un juego.»",
            autor = "Platón"),
        FraseModel(
            frase = "«Nadie se baña en el mismo río dos veces. Cambia el río y cambia el que se baña.»",
            autor = "Heraclito"),
        FraseModel(
            frase = "«El silencio es la primera piedra del templo de la filosofía.»",
            autor = "Pitágoras"),
        FraseModel(
            frase = "«Toda la historia de la sociedad humana, hasta la actualidad, es una historia de lucha de clases.»",
            autor = "Karl Marx"),
        FraseModel(
            frase = "«Los principales elementos que integran una vida satisfecha son dos: la tranquilidad y el estímulo.»",
            autor = "John Stuart Mill"),
        FraseModel(
            frase = "«Ante todo debéis guardaros de las sospechas, porque ése es el veneno de la amistad.»",
            autor = "San Agustín de Hipona"),
        FraseModel(
            frase = "«Aquel que procura asegurar el bienestar ajeno, ya tiene asegurado el propio.»",
            autor = "Confucio"),
        FraseModel(
            frase = "«La amistad es pródiga, mas el amor es avaro.»",
            autor = "Jean Jaques Rousseau"),
        FraseModel(
            frase = "«Amar profundamente a alguien nos da fuerza. Sentirse amado profundamente por alguien nos da valor.»",
            autor = "Lao Tsé"),
        FraseModel(
            frase = "«¿Que es un amigo? Una sola alma habitando en dos cuerpos.»",
            autor = "Aristóteles"),
    )
    }
}