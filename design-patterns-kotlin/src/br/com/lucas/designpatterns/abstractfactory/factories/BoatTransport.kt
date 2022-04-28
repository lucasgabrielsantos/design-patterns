package br.com.lucas.designpatterns.abstractfactory.factories

import br.com.lucas.designpatterns.abstractfactory.aircrafts.Airplane
import br.com.lucas.designpatterns.abstractfactory.aircrafts.IAircraft
import br.com.lucas.designpatterns.abstractfactory.boats.Boat
import br.com.lucas.designpatterns.abstractfactory.boats.IBoat
import br.com.lucas.designpatterns.abstractfactory.landvehicles.Car
import br.com.lucas.designpatterns.abstractfactory.landvehicles.ILandVehicle

class BoatTransport : ITransportFactory {
    override fun createTransportVehicle(): ILandVehicle {
        return Car()
    }

    override fun createTransportAircraft(): IAircraft {
        return Airplane()
    }

    override fun createTransportBoat(): IBoat {
        return Boat()
    }
}