/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//  FUNCIONES MATEMATICAS

// 1. Función para determinar si un número es par
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 2. Función para determinar si un número es primo
fun isPrime(number: Int): Boolean {
    // Los números menores o iguales a 1 no son primos
    if (number <= 1) return false
    
    // Verificamos si tiene algún divisor desde 2 hasta la raíz cuadrada del número
    var i = 2
    while (i * i <= number) {
        if (number % i == 0) {
            return false // Si encuentra un divisor, no es primo
        }
        i++
    }
    return true
}

// 3. Función para calcular el factorial de un número no negativo
fun factorial(number: Int): Long {
    // Validación para números negativos
    if (number < 0) {
        throw IllegalArgumentException("El número no puede ser negativo")
    }
    
    // Caso base: 0! = 1 y 1! = 1
    var resultado: Long = 1
    for (i in 2..number) {
        resultado *= i
    }
    return resultado
}

fun main() {
    // Pruebas con diferentes números
    val numero1 = 7
    val numero2 = 10
    val numero3 = 5

    println("=== Análisis de $numero1 ===")
    println("¿Es par?: ${isEven(numero1)}")
    println("¿Es primo?: ${isPrime(numero1)}")
    println("Factorial: ${factorial(numero1)}")

    println("\n=== Análisis de $numero2 ===")
    println("¿Es par?: ${isEven(numero2)}")
    println("¿Es primo?: ${isPrime(numero2)}")

    println("\n=== Análisis de $numero3 ===")
    println("Factorial de $numero3: ${factorial(numero3)}")
}
         

