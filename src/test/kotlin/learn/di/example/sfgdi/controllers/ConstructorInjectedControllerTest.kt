package learn.di.example.sfgdi.controllers

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ConstructorInjectedControllerTest {


    lateinit var controller: ConstructorInjectedController
    @BeforeEach
    fun setUp() {
        controller = ConstructorInjectedController()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}