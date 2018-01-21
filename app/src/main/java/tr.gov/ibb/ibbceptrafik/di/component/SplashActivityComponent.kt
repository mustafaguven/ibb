package tr.gov.ibb.ibbceptrafik.di.component

import tr.gov.ibb.ibbceptrafik.di.module.screen.SplashActivityModule
import tr.gov.ibb.ibbceptrafik.di.module.screen.SplashInteractorModule
import tr.gov.ibb.ibbceptrafik.di.module.screen.SplashPresenterModule
import tr.gov.ibb.ibbceptrafik.mvp.view.splash.SplashActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [(SplashActivityModule::class), (SplashPresenterModule::class), (SplashInteractorModule::class)])
interface SplashActivityComponent {
  fun inject(splashActivity: SplashActivity)
}