package br.com.alexandre.bk.repositories.domain

import br.com.alexandre.bk.repositories.core.UseCase
import br.com.alexandre.bk.repositories.data.model.Repo
import br.com.alexandre.bk.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}