package br.com.lucas.designpatterns.abstractfactory

import br.com.lucas.designpatterns.abstractfactory.app.Application
import br.com.lucas.designpatterns.abstractfactory.factories.BoatTransport
import br.com.lucas.designpatterns.abstractfactory.factories.ITransportFactory
import br.com.lucas.designpatterns.abstractfactory.factories.NineNineTransport
import br.com.lucas.designpatterns.abstractfactory.factories.UberTransport

const val COMPANY = "barco"

object Main {

    private fun configureApplication(): Application {

        val app: Application
        val factory: ITransportFactory = if (COMPANY === "uber") {
            UberTransport()
        } else if (COMPANY === "99") {
            NineNineTransport()
        } else {
            BoatTransport()
        }

        app = Application(factory)

        return app
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val app = configureApplication()

        app.startRoute()

    }
}
