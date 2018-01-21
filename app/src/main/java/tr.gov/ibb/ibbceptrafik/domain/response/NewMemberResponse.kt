package tr.gov.ibb.ibbceptrafik.domain.response

import com.google.gson.annotations.SerializedName

class NewMemberResponse {

  data class Register(
      @SerializedName("cardNumber") val cardNumber: String
  )
}

