package yoviep.project.githubapp.domain.usecase

import yoviep.project.githubapp.data.source.remote.model.UserListResponse

interface UserListUseCase {

    suspend fun getUserList(query: String): UserListResponse

}