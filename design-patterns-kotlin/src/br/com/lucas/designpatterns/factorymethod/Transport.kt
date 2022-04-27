package br.com.lucas.designpatterns.factorymethod

import br.com.lucas.designpatterns.factorymethod.vehicles.IVehicle

abstract class Transport {
    fun startTransport() {
        val vehicle = createTransport()
        vehicle.startRoute()
    }

    protected abstract fun createTransport(): IVehicle
}