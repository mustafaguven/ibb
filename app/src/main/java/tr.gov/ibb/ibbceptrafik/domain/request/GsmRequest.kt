package tr.gov.ibb.ibbceptrafik.domain.request

import com.google.gson.annotations.SerializedName

class GsmRequest {

  data class ValidatePhoneNumber(
      @SerializedName("phoneNumber") val phoneNumber: String,
      @SerializedName("reason") val reason: String = "login")
}