/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//CALCULADORA BASICA


fun main() {
    // 1. Declaración de los dos números y la operación matemática
    // Usamos explícitamente los tipos básicos (Double y Char) según la documentación
    val num1: Double = 15.0
    val num2: Double = 8.0
    val operacion: Char = '/'

    // 2. Uso de la estructura 'when' para efectuar la operación
    val resultado = when (operacion) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            // Control de la división entre cero
            if (num2 == 0.0) {
                "Error: No se puede dividir entre cero"
            } else {
                num1 / num2
            }
        }
        else -> "Error: Operación matemática no reconocida"
    }

    // 3. Mostrar el resultado usando String templates (Plantillas de cadena)
    println("Operación solicitada: $num1 $operacion $num2")
    println("Resultado: $resultado")
}
