package main

import ToDo.toDo

fun menuSinListas(): String {
    return """
        MENU:
        1. Crear lista de tarea
        2. Salir
    """.trimIndent()
}
fun menuConListas() : String {
    return """
        MENU:
        1. Crear lista de tarea
        2. Ver todas las listas de tareas
        3. Seleccionar una lista de tareas
        4. Salir
    """.trimIndent()
}
fun main(args: Array<String>) {
    var wantsToContinue = true
    do {
        println(menuSinListas())

    } while (wantsToContinue)

}//QUE DIFICIL ESTABA :'(