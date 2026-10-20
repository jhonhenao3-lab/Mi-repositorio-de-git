/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//ANALISIS DE UNA LISTA


fun main() {
    // 1. Creación de una lista inmutable con 10 números enteros
    val numeros: List<Int> = listOf(15, 8, 23, 42, 4, 16, 9, 31, 50, 12)

    // 2. Mostrar los elementos de la lista
    println("Lista de números: $numeros")
    println("----------------------------------------")

    // 3. Declaración de variables acumuladoras y auxiliares
    var suma: Int = 0
    var mayor: Int = numeros[0] // Asumimos el primer elemento como el mayor inicial
    var menor: Int = numeros[0] // Asumimos el primer elemento como el menor inicial
    var cantidadPares: Int = 0
    var cantidadImpares: Int = 0

    // 4. Recorrido de la lista con un ciclo for
    for (numero in numeros) {
        // Suma
        suma += numero

        // Identificar el mayor
        if (numero > mayor) {
            mayor = numero
        }

        // Identificar el menor
        if (numero < menor) {
            menor = numero
        }

        // Conteo de pares e impares usando el operador módulo (%)
        if (numero % 2 == 0) {
            cantidadPares++
        } else {
            cantidadImpares++
        }
    }

    // 5. Cálculo del promedio (convertimos la suma a Double para no perder decimales)
    val promedio: Double = suma.toDouble() / numeros.size

    // 6. Resultados finales
    println("Resultados del análisis:")
    println("• Suma total: $suma")
    println("• Promedio: ${"%.2f".format(promedio)}")
    println("• Número mayor: $mayor")
    println("• Número menor: $menor")
    println("• Cantidad de pares: $cantidadPares")
    println("• Cantidad de impares: $cantidadImpares")
}
