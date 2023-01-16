package com.byalexitto.plugins

import com.byalexitto.routes.departamentoRoutes
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Servidor creado por Byalexitto")
        }
        // Static plugin. Try to access `/static/index.html`
     /*   static("/static") {
            resources("static")
        }*/

    }

    departamentoRoutes()
}
