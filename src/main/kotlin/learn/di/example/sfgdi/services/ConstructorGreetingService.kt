package learn.di.example.sfgdi.services

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingService : GreetingService {
    override fun sayGreeting(): String {
             return "Hello World. All is OK. Constructor"
    }

}