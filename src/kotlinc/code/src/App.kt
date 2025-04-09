package kotlinc.code.src

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = listOf("Abdallah", "Mohamed", "Saeed")
        apply(list, ::println)
    }

    private fun apply(names: List<String>, make:(String)-> Unit) {
        for(name in names) {
            make(name)
        }
    }
}