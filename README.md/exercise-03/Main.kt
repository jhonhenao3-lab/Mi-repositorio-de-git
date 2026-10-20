/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//TABLA DE MULTIPLICAR


fun main() {
    // 1. Declaración del número entero (val: inmutable, su valor no cambiará)
    val numero: Int = 7
    
    // 2. Variable para acumular la suma de los resultados (var: mutable, su valor cambiará)
    var sumaResultados: Int = 0
    
    println("Tabla de multiplicar del $numero:")
    println("----------------------------")
    
    // 3. Ciclo for utilizando un rango (1..10)
    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
        
        // Sumamos el resultado actual al acumulador
        sumaResultados += resultado
    }
    
    // 4. Mostrar la suma de todos los resultados
    println("----------------------------")
    println("La suma total de los resultados es: $sumaResultados")
}
