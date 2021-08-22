package yoviep.project.githubapp.data.source.remote

import io.ktor.client.request.*
import yoviep.project.githubapp.data.source.remote.model.UserListResponse

class UserListRemoteSource: BaseRemoteSource() {

    suspend fun getUserList(query: String): UserListResponse {
        return client.get("search/users") {
            parameter("q", query)
        }
    }

}