package tr.gov.ibb.ibbceptrafik.network

import tr.gov.ibb.ibbceptrafik.domain.request.ProfileRequest
import tr.gov.ibb.ibbceptrafik.domain.response.BaseResponse
import tr.gov.ibb.ibbceptrafik.domain.response.ProfileResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface LocationService {

  @GET("getcitylist")
  fun getCityList():
      Observable<BaseResponse<ProfileResponse.Cities>>

  @POST("getdistrictlist")
  fun getDistrictList(@Body body: ProfileRequest.District):
      Observable<BaseResponse<ProfileResponse.Districts>>

  @POST("gettownlist")
  fun getTownList(@Body body: ProfileRequest.Town):
      Observable<BaseResponse<ProfileResponse.Towns>>
}
