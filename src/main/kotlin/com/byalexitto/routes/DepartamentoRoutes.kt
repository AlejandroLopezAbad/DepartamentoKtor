package com.byalexitto.routes

import com.byalexitto.models.Departamento
import com.byalexitto.repositories.departamento.DepartamentoRepositoryImpl
import com.byalexitto.utils.toUUID
import io.ktor.http.*
import io.ktor.http.cio.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import mu.KotlinLogging
import java.util.*

private val logger = KotlinLogging.logger {}

private const val ENDPOINT = "/departamentos" // Ruta de acceso, puede aunar un recurso


fun Application.departamentoRoutes() {

    val departamentoRepository =DepartamentoRepositoryImpl()

    routing {
        route("/$ENDPOINT") {
            //getAll
            get {
                logger.debug { "GET ALL /$ENDPOINT" }
                val res = mutableListOf<Departamento>()
                res?.let {
                    call.respond(HttpStatusCode.OK, res)
                }
            }
            //getbyId
            get("{id}"){
                logger.debug { "GET BY ID /$ENDPOINT/{id}" }

                val id = call.parameters["id"]?.toUUID()!!
                val departamento = departamentoRepository.findByUUID(id)


                }


                }
            }

        }


