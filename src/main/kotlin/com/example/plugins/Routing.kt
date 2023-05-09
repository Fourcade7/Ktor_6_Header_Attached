package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/headers"){
            call.response.headers.append("adobe","after effects")
            call.response.headers.append("premiere","Pro")
        }
    }
}
