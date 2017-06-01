package basics

import kotlin.reflect.KProperty

class Service {
    var delegatedProperty: String by CustomDelegate()
}

class CustomDelegate {
    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params: \n" +
                "service: $service\n" +
                "property: ${property.name}"
        )
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, s: String) {
        backingField = s
    }


}