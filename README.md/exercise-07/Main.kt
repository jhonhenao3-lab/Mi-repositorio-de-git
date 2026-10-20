/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//  AGENDA DE CONTACTOS

// 1. Clase Contact con sus propiedades básicas
class Contact(
    val name: String,
    var phone: String,
    var email: String
) {
    // Método para mostrar la información del contacto en una sola línea
    fun getInfo(): String {
        return "Nombre: $name | Teléfono: $phone | Correo: $email"
    }
}

// 2. Clase Agenda que gestiona la lista de contactos
class ContactBook {
    // Lista mutable para almacenar los contactos
    private val contacts: MutableList<Contact> = mutableListOf()

    // Agregar un nuevo contacto
    fun addContact(contact: Contact) {
        contacts.add(contact)
        println("✓ Contacto '${contact.name}' agregado con éxito.")
    }

    // Listar todos los contactos
    fun listContacts() {
        println("\n=== LISTA DE CONTACTOS (${contacts.size}) ===")
        if (contacts.isEmpty()) {
            println("La agenda está vacía.")
        } else {
            for ((index, contact) in contacts.withIndex()) {
                println("${index + 1}. ${contact.getInfo()}")
            }
        }
        println("----------------------------------------")
    }

    // Buscar contacto por nombre (ignorando mayúsculas/minúsculas)
    fun searchByName(name: String) {
        println("\n--- Buscando a '$name' ---")
        val foundContact = contacts.find { it.name.equals(name, ignoreCase = true) }

        if (foundContact != null) {
            println("Contacto encontrado -> ${foundContact.getInfo()}")
        } else {
            println("❌ Error: El contacto '$name' no existe en la agenda.")
        }
    }

    // Eliminar contacto por nombre
    fun deleteByName(name: String) {
        println("\n--- Eliminando a '$name' ---")
        val contactToDelete = contacts.find { it.name.equals(name, ignoreCase = true) }

        if (contactToDelete != null) {
            contacts.remove(contactToDelete)
            println("✓ El contacto '$name' ha sido eliminado correctamente.")
        } else {
            println("❌ Error: No se pudo eliminar. El contacto '$name' no existe.")
        }
    }
}

fun main() {
    val myAgenda = ContactBook()

    // 3. Agregar al menos cinco contactos iniciales
    println("=== CARGANDO CONTACTOS INICIALES ===")
    myAgenda.addContact(Contact("Ana Gómez", "3001234567", "ana.gomez@email.com"))
    myAgenda.addContact(Contact("Carlos Ruiz", "3159876543", "carlos.ruiz@email.com"))
    myAgenda.addContact(Contact("Diana López", "3115554433", "diana.lopez@email.com"))
    myAgenda.addContact(Contact("Esteban Quito", "3201112233", "esteban.q@email.com"))
    myAgenda.addContact(Contact("Fernanda Torres", "3189998877", "fer.torres@email.com"))

    // 4. Listar contactos
    myAgenda.listContacts()

    // 5. Buscar contactos (existente y no existente)
    myAgenda.searchByName("Carlos Ruiz")
    myAgenda.searchByName("Mario Bros") // Caso donde no existe

    // 6. Eliminar contactos (existente y no existente)
    myAgenda.deleteByName("Diana López")
    myAgenda.deleteByName("Mario Bros") // Caso donde no existe

    // 7. Listar contactos nuevamente para verificar cambios
    myAgenda.listContacts()
}
