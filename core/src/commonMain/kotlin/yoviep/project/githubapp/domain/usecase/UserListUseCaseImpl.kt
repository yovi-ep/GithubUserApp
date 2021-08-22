package yoviep.project.githubapp.domain.usecase

import kotlinx.coroutines.flow.Flow
import yoviep.project.githubapp.data.source.remote.model.UserListResponse
import yoviep.project.githubapp.domain.repository.UserListRepository

class UserListUseCaseImpl(
    private val repository: UserListRepository
): UserListUseCase {

    override suspend fun getUserList(query: String): UserListResponse =
        repository.getUserList(query)

}