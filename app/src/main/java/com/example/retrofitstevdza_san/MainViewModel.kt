package com.example.retrofitstevdza_san

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitstevdza_san.model.Post
import com.example.retrofitstevdza_san.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val myCustomPosts: MutableLiveData<Response<List<Post>>> = MutableLiveData()

    fun getCustomPosts(userId: Int, sort:String, order:String) {
        viewModelScope.launch {
            val response = repository.getCustomPosts(userId,sort,order)
            myCustomPosts.value = response
        }
    }

}