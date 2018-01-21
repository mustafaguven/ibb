package tr.gov.ibb.ibbceptrafik.di.scope

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(value = AnnotationRetention.RUNTIME)
@Scope
annotation class PerActivity
