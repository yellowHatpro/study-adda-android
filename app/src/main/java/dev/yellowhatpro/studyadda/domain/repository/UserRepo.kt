package dev.yellowhatpro.studyadda.domain.repository

import dev.yellowhatpro.studyadda.domain.entity.user.UserEntity

interface UserRepo {
    suspend fun createUser(userEntity: UserEntity)

}