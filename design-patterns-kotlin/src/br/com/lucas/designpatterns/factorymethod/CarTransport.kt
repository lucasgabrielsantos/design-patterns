package br.com.lucas.designpatterns.factorymethod

import br.com.lucas.designpatterns.factorymethod.vehicles.Car
import br.com.lucas.designpatterns.factorymethod.vehicles.IVehicle

class CarTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Car()
    }
}