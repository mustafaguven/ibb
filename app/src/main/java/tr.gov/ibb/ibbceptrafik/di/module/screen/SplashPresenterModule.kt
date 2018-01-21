package tr.gov.ibb.ibbceptrafik.di.module.screen

import tr.gov.ibb.ibbceptrafik.cache.ApplicationCache
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.mvp.presenter.splash.SplashPresenter
import tr.gov.ibb.ibbceptrafik.utility.DeviceUtil
import tr.gov.ibb.ibbceptrafik.utility.FileUtil
import tr.gov.ibb.ibbceptrafik.wrapper.UriWrapper
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class SplashPresenterModule {

  @Provides
  fun providePresenter(contract: SplashContract.View,
      interactor: SplashContract.Interactor,
      uriWrapper: UriWrapper,
      compositeDisposable: CompositeDisposable,
      cache: ApplicationCache,
      fileUtil: FileUtil, deviceUtil: DeviceUtil): SplashContract.Presenter = SplashPresenter(
      contract,
      interactor, uriWrapper, compositeDisposable, cache, fileUtil, deviceUtil)

}