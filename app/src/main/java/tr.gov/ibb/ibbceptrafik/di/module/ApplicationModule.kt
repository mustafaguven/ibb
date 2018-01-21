package tr.gov.ibb.ibbceptrafik.di.module

import android.content.Context
import android.content.res.Resources
import tr.gov.ibb.ibbceptrafik.TemplateApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(var application: TemplateApplication) {

  @Provides
  @Singleton
  fun provideApplication() = application

  @Provides
  @Singleton
  fun provideResources(context: Context): Resources = context.resources

}