package br.com.lucas.designpatterns.abstractfactory.aircrafts

class Airplane : IAircraft {

    override fun startRoute() {
        wind()
        getCargo()
        println("iniciando decolagem")
    }

    override fun getCargo() {
        println("passageiros abordo, autorizado")
    }

    override fun wind() {
        println("ventos ok")
    }
}