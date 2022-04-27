package br.com.lucas.designpatterns.factorymethod

import br.com.lucas.designpatterns.factorymethod.vehicles.Bike
import br.com.lucas.designpatterns.factorymethod.vehicles.IVehicle

class BikeTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Bike()
    }
}