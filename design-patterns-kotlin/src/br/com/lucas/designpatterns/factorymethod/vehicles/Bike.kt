package br.com.lucas.designpatterns.factorymethod.vehicles

class Bike : IVehicle {
    override fun startRoute() {
        cargo
        println("iniciando trajeto")
    }

    override val cargo: Unit
        get() {
            println("eats pegou lanche")
        }
}