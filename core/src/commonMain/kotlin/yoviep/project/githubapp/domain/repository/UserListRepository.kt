package yoviep.project.githubapp.domain.repository

import yoviep.project.githubapp.data.source.remote.model.UserListResponse

interface UserListRepository {

    suspend fun getUserList(query: String): UserListResponse

}