package yoviep.project.githubapp.android

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import yoviep.project.githubapp.data.repository.UserListRepositoryImpl
import yoviep.project.githubapp.data.source.remote.UserListRemoteSource
import yoviep.project.githubapp.domain.usecase.UserListUseCase
import yoviep.project.githubapp.domain.usecase.UserListUseCaseImpl

class MainViewModel: ViewModel() {
    private val useCase: UserListUseCase = UserListUseCaseImpl(
        UserListRepositoryImpl(UserListRemoteSource())
    )

    fun getUser(query: String = "a") = viewModelScope.launch {
        val response = useCase.getUserList(query)
        Log.d(MainViewModel::class.java.name, response.toString())
    }

}