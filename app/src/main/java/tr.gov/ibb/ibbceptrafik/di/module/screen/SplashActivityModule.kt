package tr.gov.ibb.ibbceptrafik.di.module.screen

import android.app.Activity
import tr.gov.ibb.ibbceptrafik.di.module.ActivityModule
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract.View
import dagger.Module
import dagger.Provides


@Module
class SplashActivityModule(activity: Activity) : ActivityModule(activity) {

  @Provides
  fun provideView(): SplashContract.View = activity as View

}