package com.byalexitto.routes

import com.byalexitto.models.Departamento
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

private const val ENDPOINT = "/departamento" // Ruta de acceso, puede aunar un recurso

private val departamentos= mutableListOf(
    Departamento(1,"Tecnologia"),
    Departamento(2,"Finanzas"),
    Departamento(3,"Marketing"),
    Departamento(4,"Desarrollo web")
)

fun Application.departamentoRoutes() {

    routing {
        route("/$ENDPOINT") {
            //getAll
            get {
                logger.debug { "GET ALL /$ENDPOINT" }
                departamentos?.let {
                    call.respond(HttpStatusCode.OK, departamentos)
                }
            }
            //getbyId
            get("{id}"){
                logger.debug { "GET BY ID /$ENDPOINT/{id}" }

            }



        }
    }

}