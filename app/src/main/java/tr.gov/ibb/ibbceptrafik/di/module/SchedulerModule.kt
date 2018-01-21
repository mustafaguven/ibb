package tr.gov.ibb.ibbceptrafik.di.module

import tr.gov.ibb.ibbceptrafik.utility.rx.AppSchedulerProvider
import tr.gov.ibb.ibbceptrafik.utility.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SchedulerModule {

  @Provides
  @Singleton
  fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}