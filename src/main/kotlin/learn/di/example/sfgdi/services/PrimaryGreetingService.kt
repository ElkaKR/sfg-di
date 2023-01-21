package learn.di.example.sfgdi.services

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class PrimaryGreetingService:GreetingService {
    override fun sayGreeting(): String {
        return "Hello from PRIMARY bean"
    }
}