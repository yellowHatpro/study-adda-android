package dev.yellowhatpro.studyadda.domain.entity.user

import dev.yellowhatpro.studyadda.helpers.Utils
import java.util.Date

data class UserEntity(
    val id: Long = 0L,
    val name: String = "",
    val title: String = "",
    val dob: Date = Utils.todaysDate,
    val email: String = "",
    val role: Role = Role.USER
)

enum class Role {
    ADMIN,
    USER
}
