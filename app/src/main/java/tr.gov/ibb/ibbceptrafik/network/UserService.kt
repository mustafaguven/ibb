package tr.gov.ibb.ibbceptrafik.network

import tr.gov.ibb.ibbceptrafik.domain.request.GsmRequest
import tr.gov.ibb.ibbceptrafik.domain.request.NewMemberRequest
import tr.gov.ibb.ibbceptrafik.domain.response.BaseResponse
import tr.gov.ibb.ibbceptrafik.domain.response.GsmResponse
import tr.gov.ibb.ibbceptrafik.domain.response.NewMemberResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

  @POST("validatephone")
  fun validatePhoneNumber(@Body body: GsmRequest.ValidatePhoneNumber):
      Observable<BaseResponse<GsmResponse.ValidatePhoneNumber>>

  @POST("register")
  fun register(@Body body: NewMemberRequest.Register):
      Observable<BaseResponse<NewMemberResponse.Register>>
}
