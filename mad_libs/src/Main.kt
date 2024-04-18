fun main() {
    val story =
        """[Name] the badger, an aspiring [career], accidentally launched his latest contraption, 
        a [adjective] jetpack, while attempting to toast his breakfast crumpet. He soared through the air, 
        past bewildered [animal] and a flock of startled [bird], before crash-landing into a pile of hay, 
        his crumpet miraculously unharmed and perfectly toasted. "Well," he muttered, dusting himself off, 
        "at least [food-type] is ready."""
            .trimIndent().replace("\n", "").replace("        ", "")

    for (word in story.split(' ')) {
        if (word.startsWith('[')) {
            println()
            print(getQuestion(word.split('[').last().split(']').first(), null))
            readln()
        } else {
            print(word)
            print(" ")
        }
    }


}

fun getQuestion(word: String, stuff: Int?): String {
    return when (word) {
        "Name" -> "Choose a name:"
        "career" -> "What is a nice profession you know:"
        "adjective" -> "Add an adjective to describe a flying machine:"
        "animal" -> "Choose a ground grazing animal:"
        "bird" -> "Choose a type of bird:"
        "food-type" -> "Name a food:"
        else -> "What???"
    }

}
