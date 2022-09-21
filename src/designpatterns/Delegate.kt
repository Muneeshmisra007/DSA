package designpatterns

/**
 * Support "composition over inheritance"
 * Its generic impl, where we can pass any impl to interface and delegate will do call interface function.
 * Its different from adapter, in adapter pattern, adapter has very specif impl to solve a specific problem
 */
fun main() {

    //login with fb
    LoginDelegate(FBAuthentication()).login()
    //login with google
    LoginDelegate(GoogleAuthentication()).login()
    //login with manual
    LoginDelegate(ManualAuthentication()).login()


}

//#####delegate######
class LoginDelegate(private val authentication: Authentication) : Authentication {

    override fun login() {
      authentication.login()
    }

}

interface Authentication {
    fun login()
}

class FBAuthentication : Authentication {
    override fun login() {
        println("Login using FB...")
    }
}

class GoogleAuthentication : Authentication {
    override fun login() {
        println("Login using Google...")
    }
}

class ManualAuthentication : Authentication {
    override fun login() {
        println("Login using Manual...")
    }
}

//####end of delegate