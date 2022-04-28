package br.com.lucas.designpatterns.abstractfactory.landvehicles

class Motorcycle : ILandVehicle {

    override fun startRoute() {
        getCargo()
        println("iniciando a entrega")
    }

    override fun getCargo() {
        println("Pegamos a encomenda, estamos prontos")
    }
}