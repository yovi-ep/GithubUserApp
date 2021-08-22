package yoviep.project.githubapp.data.source.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserListResponse(
    @SerialName("total_count")
    val totalCount: Int?,
    @SerialName("incomplete_results")
    val incompleteResults: Boolean?,
    val items: MutableList<UserListModel>?
)