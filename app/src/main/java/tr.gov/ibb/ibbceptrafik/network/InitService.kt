package tr.gov.ibb.ibbceptrafik.network

import tr.gov.ibb.ibbceptrafik.domain.request.SplashRequest
import tr.gov.ibb.ibbceptrafik.domain.response.BaseResponse
import tr.gov.ibb.ibbceptrafik.domain.response.SplashResponse
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Streaming
import retrofit2.http.Url

interface InitService {

  @POST("init")
  fun init(@Body body: SplashRequest.Init): Observable<BaseResponse<SplashResponse.Init>>

  @Streaming
  @GET
  fun downloadCommercialLink(@Url url: String): Observable<Response<ResponseBody>>


}
