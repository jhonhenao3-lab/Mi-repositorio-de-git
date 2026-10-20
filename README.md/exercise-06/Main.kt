/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//  GESTION DE PRODUCTOS

// 1. Definición de la clase Product
class Product(
    val name: String,
    var price: Double,
    var quantity: Int
) {
    // Método para calcular el valor total del inventario de este producto
    fun calculateTotalValue(): Double {
        return price * quantity
    }

    // Método para mostrar la información del producto
    fun displayInfo() {
        println("Nombre del producto: $name")
        println("Precio unitario: $price")
        println("Cantidad disponible: $quantity")
        println("Valor total en inventario: $${"%.2f".format(calculateTotalValue())}")
        println("----------------------------------------")
    }
}

fun main() {
    // 2. Creación de tres objetos de la clase Product
    val product1 = Product(name = "Laptop Gaming", price = 1200.50, quantity = 5)
    val product2 = Product(name = "Mouse Inalámbrico", price = 25.00, quantity = 20)
    val product3 = Product(name = "Teclado Mecánico", price = 85.90, quantity = 0)

    println("=== GESTIÓN DE INVENTARIO DE PRODUCTOS ===\n")

    // 3. Mostrar la información de cada objeto
    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()

    // 4. Cálculo del valor total de todo el inventario combinado
    val valorTotalInventario = product1.calculateTotalValue() + 
                                product2.calculateTotalValue() + 
                                product3.calculateTotalValue()

    println("VALOR TOTAL COMBINADO EN INVENTARIO: $${"%.2f".format(valorTotalInventario)}")
}
     
