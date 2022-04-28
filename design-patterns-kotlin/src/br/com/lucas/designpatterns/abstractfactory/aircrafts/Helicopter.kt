package br.com.lucas.designpatterns.abstractfactory.aircrafts

class Helicopter : IAircraft {
    override fun startRoute() {
        wind()
        getCargo()
        println("decolando")
    }

    override fun getCargo() {
        println("ligando hélices")
    }

    override fun wind() {
        println("vento estável")
    }
}