/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//CLASIFICACION DE ESTUDIANTES


fun main() {
    // 1. Declaración del nombre y las tres calificaciones (usando Double para los decimales)
    val nombreEstudiante: String = "Carlos Perez"
    val calificacion1: Double = 4.2
    val calificacion2: Double = 4.8
    val calificacion3: Double = 4.6

    // 2. Cálculo del promedio
    val promedio: Double = (calificacion1 + calificacion2 + calificacion3) / 3

    // 3. Mostrar el nombre y el promedio usando plantillas de cadena (String templates)
    // Usamos String.format (o format) para redondear a 2 decimales y que se vea más limpio
    println("Estudiante: $nombreEstudiante")
    println("Promedio: ${"%.2f".format(promedio)}")

    // 4. Lógica para determinar el estado usando if/else
    if (promedio >= 4.5) {
        println("Estado: Aprobado")
        println("Observación: ¡Promedio Excelente!")
    } else if (promedio >= 3.0) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Reprobado")
    }
}
