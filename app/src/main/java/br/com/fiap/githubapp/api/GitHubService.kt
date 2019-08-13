package br.com.fiap.githubapp.api

import br.com.fiap.githubapp.model.Usuario
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GitHubService {

    @GET("/users/{username}")
    fun pesquisar(@Path("username") username: String)
            : Call<Usuario>

}