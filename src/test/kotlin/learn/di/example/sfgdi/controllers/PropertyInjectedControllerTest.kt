package learn.di.example.sfgdi.controllers

import learn.di.example.sfgdi.services.ConstructorGreetingService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach

class PropertyInjectedControllerTest {

    lateinit var controller:PropertyInjectedController

    @BeforeEach
    fun setUp() {
        controller = PropertyInjectedController()
        controller.greetingService = ConstructorGreetingService()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}