package com.byalexitto.repositories.departamento

import com.byalexitto.models.Departamento
import com.byalexitto.repositories.CrudRepository
import kotlinx.coroutines.flow.Flow
import java.util.*

interface DepartamentoRepository:CrudRepository<Departamento, UUID> {
    fun findByNombre(nombre: String): Flow<Departamento>
}