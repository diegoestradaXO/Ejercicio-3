package ToDo

import Tarea.tarea

class toDo (
        val nombre : String,
        private var tareas : ArrayList<tarea> = ArrayList(),
        var seleccionada : Boolean = false
) {
    fun addTarea(tarea: tarea) {
        tareas.add(tarea)
    }
    //fun deleteTarea(tarea: tarea, pos: Int) {
      //  tareas.removeAt(pos)
    //}
    fun seleccionarLista() {
    seleccionada = true
    }
}