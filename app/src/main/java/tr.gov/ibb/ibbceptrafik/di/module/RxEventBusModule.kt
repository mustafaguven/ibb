package tr.gov.ibb.ibbceptrafik.di.module

import tr.gov.ibb.ibbceptrafik.bus.RxEventBus
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RxEventBusModule {

  @Singleton
  @Provides
  fun provideRxBus(): RxEventBus = RxEventBus()
}