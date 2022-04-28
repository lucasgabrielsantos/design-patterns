package br.com.lucas.designpatterns.abstractfactory.boats

class Boat : IBoat {
    override fun startRoute() {
        getCargo()
        println("iniciando cruzamento do atlantico")
    }

    override fun getCargo() {
       println("carga maritima recolhida")
    }
}