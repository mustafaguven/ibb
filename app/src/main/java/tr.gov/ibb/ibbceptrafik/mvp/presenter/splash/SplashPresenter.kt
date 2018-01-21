package tr.gov.ibb.ibbceptrafik.mvp.presenter.splash

import tr.gov.ibb.ibbceptrafik.cache.ApplicationCache
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract.Interactor
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract.View
import tr.gov.ibb.ibbceptrafik.utility.DeviceUtil
import tr.gov.ibb.ibbceptrafik.utility.FileUtil
import tr.gov.ibb.ibbceptrafik.wrapper.UriWrapper
import io.reactivex.disposables.CompositeDisposable


class SplashPresenter(
    private val view: View,
    private val interactor: Interactor,
    private val uriWrapper: UriWrapper,
    private val compositeDisposable: CompositeDisposable,
    private val cache: ApplicationCache,
    private val fileUtil: FileUtil,
    private val deviceUtil: DeviceUtil) : SplashContract.Presenter {

  private var commercialLink: String? = null

  override fun onCreate() {
  }


  override fun onDestroy() {
    if (!compositeDisposable.isDisposed) {
      compositeDisposable.dispose()
    }
  }

}
