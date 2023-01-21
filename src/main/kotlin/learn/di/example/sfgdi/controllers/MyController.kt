package learn.di.example.sfgdi.controllers

import learn.di.example.sfgdi.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class MyController {
    @Autowired
    lateinit var greetingService: GreetingService

    fun sayHello():String {
        return greetingService.sayGreeting()
    }
}