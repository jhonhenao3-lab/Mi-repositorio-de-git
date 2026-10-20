/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// MANEJO DE VALORES NULOS

// Función que recibe un String nullable (String?) y retorna un String
fun generarSaludo(nombreUsuario: String?): String {
    // Verificamos si el nombre es nulo o está vacío/lleno de espacios en blanco
    return if (!nombreUsuario.isNullOrBlank()) {
        "¡Hola, ${nombreUsuario.trim()}! Bienvenido de nuevo."
    } else {
        "¡Hola, invitado! Bienvenido a la plataforma."
    }
}

// Opción alternativa usando el operador Elvis (?:)
fun generarSaludoConElvis(nombreUsuario: String?): String {
    // takeIf devuelve el String si no está en blanco; si lo está, devuelve null
    val nombreValido = nombreUsuario?.takeIf { it.isNotBlank() }
    
    // El operador Elvis (?:) provee el valor por defecto en caso de nulo
    return "¡Hola, ${nombreValido ?: "invitado"}! Bienvenido."
}

fun main() {
    println("=== PRUEBAS DE MANEJO SEGURO DE NULOS ===\n")

    // Caso 1: Usuario con nombre válido
    val usuario1: String? = "  Maria  "
    println("Prueba 1 (Nombre válido): ${generarSaludo(usuario1)}")

    // Caso 2: Valor explícitamente nulo (null)
    val usuario2: String? = null
    println("Prueba 2 (Valor null): ${generarSaludo(usuario2)}")

    // Caso 3: Cadena vacía ("")
    val usuario3: String? = ""
    println("Prueba 3 (Cadena vacía): ${generarSaludo(usuario3)}")

    // Caso 4: Cadena con solo espacios en blanco ("   ")
    val usuario4: String? = "     "
    println("Prueba 4 (Solo espacios): ${generarSaludo(usuario4)}")

    println("\n--- Probando con versión Elvis Operator ---")
    println("Prueba Elvis (null): ${generarSaludoConElvis(null)}")
    println("Prueba Elvis ('Carlos'): ${generarSaludoConElvis("Carlos")}")
}
