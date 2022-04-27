package br.com.lucas.designpatterns.factorymethod.vehicles

class Car : IVehicle {
    override fun startRoute() {
        cargo
        println("iniciando trajeto")
    }

    override val cargo: Unit
        get() {
            println("Estamos prontos")
        }
}