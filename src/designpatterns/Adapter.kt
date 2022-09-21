package designpatterns

/**
 * In computer programming, the adapter pattern (often referred to as the wrapper pattern or simply a wrapper)
 * is a design pattern that translates one interface for a class into a compatible interface.
 * An adapter allows classes to work together that normally could not because of incompatible interfaces,
 * by providing its interface to clients while using the original interface.
 * The adapter translates calls to its interface into calls to the original interface,
 * and the amount of code necessary to do this is typically small.
 * The adapter is also responsible for transforming data into appropriate forms.
 * For instance, if multiple boolean values are stored as a single integer but your consumer requires a 'true'/'false',
 * the adapter would be responsible for extracting the appropriate values from the integer value.
 *
 *
 * PS: In adapter pattern, adapter has very specif impl to solve a specific problem
 */
fun main() {

    //Charging android using iphone charger
    AndroidToIphoneAdapter(AndroidCharger()).chargePhone()
    //Charging iphone using android charger
    IphoneToAndroidAdapter(IphoneCharger()).chargePhone()

    val map = mutableMapOf<String, Int>()

}

interface LighteningCharger{

    fun chargePhone()
}

class IphoneCharger: LighteningCharger{

    override fun chargePhone() {
        println("Charging using lightening charger:")
    }

}

interface USBCharger{

    fun chargePhone()
}

class AndroidCharger: USBCharger{

    override fun chargePhone() {
       println("Charging using USB  charger")
    }

}

class IphoneToAndroidAdapter(private val iphoneCharger: IphoneCharger): USBCharger{

    override fun chargePhone() {
       iphoneCharger.chargePhone()
    }

}

class AndroidToIphoneAdapter(private val androidCharger: AndroidCharger): LighteningCharger{

    override fun chargePhone() {
        androidCharger.chargePhone()
    }

}