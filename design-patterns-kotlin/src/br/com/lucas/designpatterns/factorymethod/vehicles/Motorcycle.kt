package br.com.lucas.designpatterns.factorymethod.vehicles

class Motorcycle : IVehicle {
    override fun startRoute() {
        cargo
        println("iniciando entrega")
    }

    override val cargo: Unit
        get() {
            println("Encomenda Pronta")
        }
}