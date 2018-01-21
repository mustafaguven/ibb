package tr.gov.ibb.ibbceptrafik.mvp.interactor.splash

import tr.gov.ibb.ibbceptrafik.mvp.contract.SplashContract
import tr.gov.ibb.ibbceptrafik.network.InitService
import tr.gov.ibb.ibbceptrafik.utility.rx.SchedulerProvider


class SplashInteractor(private val initService: InitService,
    private val schedulerProvider: SchedulerProvider) : SplashContract.Interactor {

}


