import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Locations based on FUTA
    val locations = arrayOf("SET", "SEET", "Senate", "Great Hall", "New Hostel")
    val actions =
        arrayOf("Go in", "Go upstairs", "Leave", "Go downstairs", "Wait outside", "Explore")
    val results = arrayOf(
        "Umm, You met Prof Oye, he talked you to sleep",
        "Damn! You bumped into the VC, you're in deepshit, she sent you to the underworld",
        "Shit!! You fell down the stairs, you got knocked out"
    )

    while (true) {
        print("You are in FUTA currently, you wake up and look around...")
        while (true) {
            print("Where are you now? (${locations.contentToString()}): ")
            val userLocation = readln()

            if (!locations.contains(userLocation)) {
                println("That place does not exist, look around again and tell me")
                continue
            }

            println("Nice, you figured out where you are, what would you like to do now? ${actions.contentToString()}")
            val userChoice = readln()

            if (!actions.contains(userChoice)) {
                println("You're not capable of doing that, think of something else")
                continue
            }

            println(results[Random.nextInt(results.size)])
            break
        }
    }
}
