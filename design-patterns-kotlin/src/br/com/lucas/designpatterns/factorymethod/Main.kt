package br.com.lucas.designpatterns.factorymethod

object Main {
    private var transport: Transport? = null
    @JvmStatic
    fun main(args: Array<String>) {
        configure(args[0])
        if (transport != null) {
            runTransport()
        }
    }

    private fun runTransport() {
        transport!!.startTransport()
    }

    private fun configure(type: String) {
        when (type) {
            "uber" -> transport = CarTransport()
            "log" -> transport = MotorcycleTransport()
            "eats" -> transport = BikeTransport()
            else -> println("Selecione o tipo de entrega")
        }
    }
}