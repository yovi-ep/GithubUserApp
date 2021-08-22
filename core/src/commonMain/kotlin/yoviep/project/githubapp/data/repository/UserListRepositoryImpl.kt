package yoviep.project.githubapp.data.repository

import yoviep.project.githubapp.data.source.remote.UserListRemoteSource
import yoviep.project.githubapp.data.source.remote.model.UserListResponse
import yoviep.project.githubapp.domain.repository.UserListRepository

class UserListRepositoryImpl(
    private val dataSource: UserListRemoteSource
): UserListRepository {

    override suspend fun getUserList(query: String): UserListResponse = dataSource.getUserList(query)

}