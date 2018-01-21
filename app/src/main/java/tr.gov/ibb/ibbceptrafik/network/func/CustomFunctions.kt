package tr.gov.ibb.ibbceptrafik.network.func

import tr.gov.ibb.ibbceptrafik.domain.response.BaseResponse
import tr.gov.ibb.ibbceptrafik.domain.response.SplashResponse
import tr.gov.ibb.ibbceptrafik.exception.ForceToUpdateException
import tr.gov.ibb.ibbceptrafik.exception.ShouldUpdateException
import tr.gov.ibb.ibbceptrafik.utility.FileUtil
import io.reactivex.Observable
import okhttp3.ResponseBody
import okio.Okio
import retrofit2.Response
import timber.log.Timber
import java.io.File


fun <T> funcErrorCheckAndTransform(): (BaseResponse<T>) -> Observable<T> {
  return { response ->
    if (response.isSuccess) {
      Observable.just(response.data)
    } else {
      val e = Exception(response.errorMsg)
      Timber.e(e)
      Observable.error(e)
    }
  }
}

fun funcVersionControl(): (SplashResponse.Init) -> Observable<SplashResponse.Init> = { response ->
  when {
    response.isForceUpdate -> Observable.error(ForceToUpdateException(response.message))
    response.isUpdateExist -> Observable.error(ShouldUpdateException(response.message))
    else -> Observable.just(response)
  }
}

fun funcDownload(
    commercialLink: String): (Response<ResponseBody>) -> Observable<File> = { response ->
  try {
    //val file = FileUtil(application).getIntroVideoFile(commercialLink)
    val file = FileUtil().getIntroVideoFile(commercialLink)
    val sink = Okio.buffer(Okio.sink(file))
    sink.writeAll(response.body()!!.source())
    sink.close()
    Observable.just(file)
  } catch (e: Exception) {
    Observable.error(e)
  }
}
