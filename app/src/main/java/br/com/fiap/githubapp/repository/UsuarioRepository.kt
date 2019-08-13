package br.com.fiap.githubapp.repository

import br.com.fiap.githubapp.model.Usuario

interface UsuarioRepository {

    fun pesquisar(
        username: String,
        onComplete: (Usuario?) -> Unit,
        onError: (Throwable?) -> Unit
    )
}