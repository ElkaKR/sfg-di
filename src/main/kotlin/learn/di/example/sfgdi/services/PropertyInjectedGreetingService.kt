package learn.di.example.sfgdi.services

import org.springframework.stereotype.Service

@Service
class PropertyInjectedGreetingService:GreetingService {
    override fun sayGreeting(): String {
        return "Hello World. All is OK. Property"
    }
}