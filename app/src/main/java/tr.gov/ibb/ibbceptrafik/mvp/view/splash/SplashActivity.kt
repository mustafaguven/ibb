package tr.gov.ibb.ibbceptrafik.mvp.view.splash

import android.os.Bundle
import tr.gov.ibb.ibbceptrafik.R
import tr.gov.ibb.ibbceptrafik.cache.ApplicationCache
import tr.gov.ibb.ibbceptrafik.di.module.screen.SplashActivityModule
import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.mvp.view.AbstractBaseActivity
import javax.inject.Inject


@Suppress("DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES")
class SplashActivity : AbstractBaseActivity(), SplashContract.View {

  override fun inject() {
    templateApplication.appComponent.plus(SplashActivityModule(this)).inject(this)
  }

  @Inject lateinit var presenter: SplashContract.Presenter
  @Inject lateinit var cache: ApplicationCache


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
  }

}
