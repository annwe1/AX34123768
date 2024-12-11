package br.edu.up.ax34123768

import android.app.Application
import br.edu.up.ax34123768.data.AppContainer
import br.edu.up.ax34123768.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
