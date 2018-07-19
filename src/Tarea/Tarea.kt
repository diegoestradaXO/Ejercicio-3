package Tarea

class tarea(
        val nombre : String,
        var estado : Boolean = false
) {
    fun cambiarEstado(){
        estado = true
    }
}