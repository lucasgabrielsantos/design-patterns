package br.com.lucas.designpatterns.factorymethod

import br.com.lucas.designpatterns.factorymethod.vehicles.IVehicle
import br.com.lucas.designpatterns.factorymethod.vehicles.Motorcycle

class MotorcycleTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Motorcycle()
    }
}