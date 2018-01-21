package tr.gov.ibb.ibbceptrafik.di.module

import tr.gov.ibb.ibbceptrafik.wrapper.UriWrapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UriWrapperModule {

  @Singleton
  @Provides
  fun providesUriWrapper(): UriWrapper = UriWrapper()

}