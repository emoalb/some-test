package com.example.sometest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SomeTestApplication

fun main(args: Array<String>) {
    runApplication<SomeTestApplication>(*args)
}
