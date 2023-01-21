package learn.di.example.sfgdi.controllers

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class SetterInjectedControllerTest {

    lateinit var controller: SetterInjectedController
    @BeforeEach
    fun setUp() {
        controller = SetterInjectedController()
        controller.getGreeting()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}