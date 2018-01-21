package tr.gov.ibb.ibbceptrafik.di.module

import tr.gov.ibb.ibbceptrafik.TemplateApplication
import tr.gov.ibb.ibbceptrafik.utility.DeviceUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DeviceUtilModule {

  @Provides
  @Singleton
  fun provideDeviceUtil(app: TemplateApplication) = DeviceUtil(app)
}