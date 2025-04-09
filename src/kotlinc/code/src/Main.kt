package kotlinc.code.src

import java.util.logging.Logger


val logger = Logger.getLogger("simple-logger")
fun main(args: Array<String>) {
    // nullables
    // special methods and operators
    // extensions functions

    logger.info("Trying nullables, special methods, extension functions")
    handlingNulls()
    println("-------------------------")


    specialMethods()





}

fun specialMethods(): Unit{

    val folderInfoDTO = FolderInfoDTO("games", "/app", 4000)
    // this syntax is the infix functions
    println(folderInfoDTO concat "Abdallah")

}

fun handlingNulls(){

    val folderWithNull: FolderInfoDTO? = getFolderInfo()
    val folder = FolderInfoDTO(name = "games", path = "/app", size = 300)
    logger.info("$folder")
    println(folderWithNull?.name)

    // ?. safety operator
    // ?: elvis operator
    // !! none null operator

}

fun getFolderInfo(): FolderInfoDTO? {

    return null

}

data class FolderInfoDTO(val name: String, var path: String, val size: Long) {
    infix fun concat(title: String) = "Hello $title, $name, $path, $size"

}