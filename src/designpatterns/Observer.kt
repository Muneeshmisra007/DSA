package designpatterns

fun main() {

    val liveData = LiveData<String>()
    liveData.addObserver(object : Observer<String> {
        override fun observe(data: String) {
            println("data received $data")
        }
    })

    mapOf<String, Any>(
        "j" to "ghuu",
        "j" to 5,
        "l" to 5.0
    )

    ////using sam
    liveData.addObserver { data ->
        println("data received $data")
    }

    liveData.postData("munish")
    Thread.sleep(500)
    liveData.postData("kumar")
    Thread.sleep(500)
    liveData.postData("misra")
    Thread.sleep(500)
}

class LiveData<T>{
    private val listObs = mutableListOf<Observer<T>>()

    fun addObserver(observer: Observer<T>) {
        listObs.add(observer)
    }

    private fun notifyChange(data: T) {
        for (observer in listObs) {
            observer.observe(data)
        }
    }

    fun postData(data: T) {
        notifyChange(data)
    }

    fun onDestroy(){
        listObs.clear()
    }

}

fun interface Observer<T> {

    fun observe(data: T)
}