package br.com.lucas.designpatterns.abstractfactory.landvehicles

class Car : ILandVehicle {

    override fun startRoute() {
        getCargo()
        println("iniciando o trajeto")
    }

    override fun getCargo() {
        println("Pegamos os passageiros, estamos prontos")
    }
}