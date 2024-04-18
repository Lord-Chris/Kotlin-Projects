fun main() {
    println("Hello World!")
}


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false)
    : Phone() {

    override fun switchOn() {
        if (isFolded) return
        super.switchOn()
    }

    fun foldPhone(){
        isFolded = true
    }

    fun unfoldPhone(){
        isFolded = false
    }
}