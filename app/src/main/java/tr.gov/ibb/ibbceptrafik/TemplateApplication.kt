package tr.gov.ibb.ibbceptrafik

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import tr.gov.ibb.ibbceptrafik.bus.RxEventBus
import tr.gov.ibb.ibbceptrafik.di.component.AppComponent
import tr.gov.ibb.ibbceptrafik.di.component.DaggerAppComponent
import tr.gov.ibb.ibbceptrafik.di.module.ApplicationModule
import javax.inject.Inject

class TemplateApplication : Application() {

  lateinit var appComponent: AppComponent

  @Inject lateinit var bus: RxEventBus

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder().applicationModule(
        ApplicationModule(this)).build()
    appComponent.inject(this)
  }

  override fun attachBaseContext(base: Context?) {
    super.attachBaseContext(base)
    MultiDex.install(this)
  }

}
