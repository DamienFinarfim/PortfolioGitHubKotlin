package br.com.alexandre.bk.repositories.data.repositories

import br.com.alexandre.bk.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}