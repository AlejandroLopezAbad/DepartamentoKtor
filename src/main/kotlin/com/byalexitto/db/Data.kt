package com.byalexitto.db

import com.byalexitto.models.Departamento
import java.util.*



    fun getDepartamentosInit() = listOf(
        Departamento(1, UUID.randomUUID(),"Tecnologia"),
        Departamento(2, UUID.randomUUID(),"Finanzas"),
        Departamento(3, UUID.randomUUID(),"Marketing"),
        Departamento(4, UUID.randomUUID(),"Desarrollo web")
    )



