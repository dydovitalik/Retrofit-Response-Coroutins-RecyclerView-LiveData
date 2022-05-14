package com.example.retrofitstevdza_san.repository

import com.example.retrofitstevdza_san.api.RetrofitInstance
import com.example.retrofitstevdza_san.model.Post
import retrofit2.Response

class Repository {

    suspend fun getCustomPosts(userId: Int, sort: String, order:String): Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost(userId,sort, order)
    }

}