package designpatterns

import javax.naming.Context

/**
 * Singleton with param
 */
class Singleton private constructor(private val context: Context) {

    companion object {
        @Volatile
        private var instance: Singleton? = null
        private lateinit var context: Context

        fun getInstance(context: Context): Singleton {
            return synchronized(this) {
                instance ?: Singleton(context)
            }
        }

    }
}

/**
 * without constructor
 */

object SingletonClass{


}