package tr.gov.ibb.ibbceptrafik.di.module.screen

import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.mvp.interactor.splash.SplashInteractor
import tr.gov.ibb.ibbceptrafik.network.InitService
import tr.gov.ibb.ibbceptrafik.utility.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class SplashInteractorModule {

  @Provides
  fun provideInteractor(initService: InitService,
      schedulerProvider: SchedulerProvider):
      SplashContract.Interactor = SplashInteractor(
      initService, schedulerProvider)

}