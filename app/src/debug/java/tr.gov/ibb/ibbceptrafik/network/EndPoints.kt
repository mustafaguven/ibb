package tr.gov.ibb.ibbceptrafik.network

import tr.gov.ibb.ibbceptrafik.BuildConfig


object EndPoints {
  val BASE_URL = "https://abc.com/test/${BuildConfig.API_VERSION}/"
  val USER_SERVICE_URL = "https://abc.com/test/${BuildConfig.API_VERSION}/user/"
  val LOCATION_SERVICE_URL = "https://abc.com/test/${BuildConfig.API_VERSION}/location/"
}