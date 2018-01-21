package tr.gov.ibb.ibbceptrafik.domain.response

open class BaseResponse<T> {
  lateinit var errorCode: String
  lateinit var errorMsg: String
  val isSuccess: Boolean = false
  var data: T? = null
}