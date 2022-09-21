package designpatterns

/**
 * When the constructor calls pretty ugly.
 * Lost of params and some of them are optionals
 */

fun main() {

    val user = User.UserBuilder().name("munish")
        .address("Ind")
        .phone("+91-7676667543")
        .isPro(true)
        .build()

    println(user)
}

data class User(
    val name: String?,
    val phone: String?,
    val address: String?,
    val isPro: Boolean,
){

     class UserBuilder {
        private var name: String? = null
        private var phone: String? = null
        private var address: String? = null
        private var isPro: Boolean = false

        fun build(): User {
            return User(name, phone, address, isPro)
        }

        fun name(name: String): UserBuilder {
            this.name = name
            return this
        }

        fun phone(phone: String): UserBuilder {
            this.phone = phone
            return this
        }

        fun address(address: String): UserBuilder {
            this.address = address
            return this
        }

        fun isPro(isPro: Boolean): UserBuilder {
            this.isPro = isPro
            return this
        }
    }
}

