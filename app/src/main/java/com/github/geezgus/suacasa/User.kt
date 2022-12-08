package com.github.geezgus.suacasa

class User(
    val firstName: String?,
    val lastName: String?,
    val emailAddress: String,
    password: String
) {

    val passwordHash: String

    init {
        this.passwordHash = password.hashCode().toString()
    }

    companion object {
        fun getId(user: User): String {
            return "${user.emailAddress.hashCode()}_${user.passwordHash}"
        }
    }

}