package tr.gov.ibb.ibbceptrafik.di.component

import tr.gov.ibb.ibbceptrafik.TemplateApplication
import tr.gov.ibb.ibbceptrafik.di.module.ApplicationModule
import tr.gov.ibb.ibbceptrafik.di.module.CacheModule
import tr.gov.ibb.ibbceptrafik.di.module.DeviceUtilModule
import tr.gov.ibb.ibbceptrafik.di.module.FileUtilModule
import tr.gov.ibb.ibbceptrafik.di.module.GsonModule
import tr.gov.ibb.ibbceptrafik.di.module.RxEventBusModule
import tr.gov.ibb.ibbceptrafik.di.module.SchedulerModule
import tr.gov.ibb.ibbceptrafik.di.module.UriWrapperModule
import tr.gov.ibb.ibbceptrafik.di.module.network.RestServicesModule
import tr.gov.ibb.ibbceptrafik.di.module.screen.SplashActivityModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    ApplicationModule::class,
    CacheModule::class,
    DeviceUtilModule::class,
    RxEventBusModule::class,
    GsonModule::class,
    RestServicesModule::class,
    SchedulerModule::class,
    FileUtilModule::class,
    UriWrapperModule::class
))
interface AppComponent {
  fun inject(application: TemplateApplication)

  fun plus(splashActivityModule: SplashActivityModule): SplashActivityComponent


}