package br.com.lucas.designpatterns.abstractfactory.factories

import br.com.lucas.designpatterns.abstractfactory.aircrafts.Helicopter
import br.com.lucas.designpatterns.abstractfactory.aircrafts.IAircraft
import br.com.lucas.designpatterns.abstractfactory.boats.Boat
import br.com.lucas.designpatterns.abstractfactory.boats.IBoat
import br.com.lucas.designpatterns.abstractfactory.landvehicles.ILandVehicle
import br.com.lucas.designpatterns.abstractfactory.landvehicles.Motorcycle

class NineNineTransport : ITransportFactory {
    override fun createTransportVehicle(): ILandVehicle {
        return Motorcycle()
    }

    override fun createTransportAircraft(): IAircraft {
        return Helicopter()
    }

    override fun createTransportBoat(): IBoat {
        return Boat()
    }
}