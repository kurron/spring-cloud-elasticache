package com.example.elasticache

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Slf4j
@SpringBootApplication
@RestController
class Application {

    @GetMapping( path = '/{id}' )
    String fetchResource( @PathVariable( name = 'id' ) String id ) {
        log.info( 'Handling request for {}', id )
        id
    }

    static void main( String[] args ) {
        SpringApplication.run Application, args
    }
}
