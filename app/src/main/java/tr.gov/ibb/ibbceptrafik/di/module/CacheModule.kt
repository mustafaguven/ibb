package tr.gov.ibb.ibbceptrafik.di.module

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import tr.gov.ibb.ibbceptrafik.TemplateApplication
import tr.gov.ibb.ibbceptrafik.bus.RxEventBus
import tr.gov.ibb.ibbceptrafik.cache.ApplicationCache
import tr.gov.ibb.ibbceptrafik.constant.Constant
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class CacheModule {

  @Provides
  @Singleton
  @Named(Constant.APPLICATION_SHARED_PREFERENCES)
  internal fun provideApplicationSharedPreference(
      application: TemplateApplication): SharedPreferences {
    return application.getSharedPreferences(Constant.APPLICATION_SHARED_PREFERENCES,
        Context.MODE_PRIVATE)
  }

  @Provides
  @Singleton internal fun provideApplicationCache(
      @Named(Constant.APPLICATION_SHARED_PREFERENCES) applicationPreferences: SharedPreferences,
      gson: Gson, rxEventBus: RxEventBus): ApplicationCache = ApplicationCache(
      applicationPreferences,
      gson, rxEventBus)
}
