package br.com.fiap.githubapp.repository

import br.com.fiap.githubapp.api.GitHubService
import br.com.fiap.githubapp.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsuarioRepositoryImpl(val service: GitHubService) : UsuarioRepository {
    override fun pesquisar(
        username: String,
        onComplete: (Usuario?) -> Unit,
        onError: (Throwable?) -> Unit
    ) {
        service
            .pesquisar(username)
            .enqueue(object : Callback<Usuario> {
                override fun onFailure(call: Call<Usuario>, t: Throwable) {
                    onError(t)
                }

                override fun onResponse(call: Call<Usuario>, response: Response<Usuario>) {
                    if(response.isSuccessful) {
                        onComplete(response.body())
                    } else {
                        onError(Throwable("Não foi possivel realizar a busca"))
                    }
                }
            })
    }
}