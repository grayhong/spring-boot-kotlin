package com.grayground.webflux

import mu.KLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringWebfluxApplication: CommandLineRunner {

    companion object: KLogging()

    override fun run(vararg args: String?) {
        logger.info("hi")
    }
}

fun main(args: Array<String>) {
    runApplication<SpringWebfluxApplication>(*args)
}
