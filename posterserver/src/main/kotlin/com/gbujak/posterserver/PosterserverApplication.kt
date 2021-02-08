package com.gbujak.posterserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PosterserverApplication

fun main(args: Array<String>) {
	runApplication<PosterserverApplication>(*args)
}
