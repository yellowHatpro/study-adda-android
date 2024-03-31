package dev.yellowhatpro.studyadda.data.model.user

data class UserModel(
    val id: Long = 0L,
    val name: String = "",
    val title: String = "",
    val dob: Long = 0L,
    val email: String = "",
    val role: String = ""
)
