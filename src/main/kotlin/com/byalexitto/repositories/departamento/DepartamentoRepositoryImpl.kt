package com.byalexitto.repositories.departamento

import com.byalexitto.db.getDepartamentosInit
import com.byalexitto.models.Departamento
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.withContext
import mu.KotlinLogging
import java.util.*

private val logger = KotlinLogging.logger {}

class DepartamentoRepositoryImpl:DepartamentoRepository {



    // Fuente de datos
    private val departamentos: MutableMap<UUID,Departamento> = mutableMapOf()

    init {
        logger.debug { "Iniciando Repositorio de Representantes" }

        getDepartamentosInit().forEach {
            departamentos[it.uuid] = it
        }
    }

    override fun findByNombre(nombre: String): Flow<Departamento> {
    TODO("Not yet implemented")
    }

    override suspend fun findAll(): Flow<Departamento> {
        logger.debug { "findAll: Buscando todos los representantes" }

        // Filtramos por página y por perPage
        return departamentos.values.toList().asFlow()
    }

  /*  override suspend fun findById(id: Int): Departamento? = withContext(Dispatchers.IO) {
        logger.debug { "findById: Buscando departamento con id: $id" }

        return@withContext departamentos
    }*/

    override suspend fun findByUUID(uuid: UUID): Departamento? = withContext(Dispatchers.IO) {
        logger.debug { "findByUUID: Buscando departamento con UUID: $uuid" }

        // Buscamos
        return@withContext departamentos[uuid]
    }

    override suspend fun save(entity: Departamento): Departamento {
        TODO("Not yet implemented")
    }

    override suspend fun update(id: UUID, entity: Departamento): Departamento? {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: UUID): Departamento? {
        TODO("Not yet implemented")
    }
}