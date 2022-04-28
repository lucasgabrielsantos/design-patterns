package br.com.lucas.designpatterns.abstractfactory.factories

import br.com.lucas.designpatterns.abstractfactory.aircrafts.IAircraft
import br.com.lucas.designpatterns.abstractfactory.boats.IBoat
import br.com.lucas.designpatterns.abstractfactory.landvehicles.ILandVehicle

interface ITransportFactory {
    fun createTransportVehicle(): ILandVehicle
    fun createTransportAircraft(): IAircraft
    fun createTransportBoat(): IBoat
}