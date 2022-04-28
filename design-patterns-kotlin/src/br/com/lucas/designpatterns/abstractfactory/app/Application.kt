package br.com.lucas.designpatterns.abstractfactory.app

import br.com.lucas.designpatterns.abstractfactory.aircrafts.IAircraft
import br.com.lucas.designpatterns.abstractfactory.boats.IBoat
import br.com.lucas.designpatterns.abstractfactory.factories.ITransportFactory
import br.com.lucas.designpatterns.abstractfactory.landvehicles.ILandVehicle

class Application(factory: ITransportFactory) {

    private val vehicle: ILandVehicle
    private val aircraft: IAircraft
    private val boat: IBoat

    init {
        vehicle = factory.createTransportVehicle()
        aircraft = factory.createTransportAircraft()
        boat = factory.createTransportBoat()
    }

    fun startRoute(){
        vehicle.startRoute()
        aircraft.startRoute()
        boat.startRoute()
    }

}