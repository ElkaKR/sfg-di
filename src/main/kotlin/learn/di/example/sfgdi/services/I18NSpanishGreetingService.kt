package learn.di.example.sfgdi.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES", "default")
@Service("і18NService")
class I18NSpanishGreetingService:GreetingService {
    @Override
    override fun sayGreeting(): String {
        return "Hola Mundo - I18N"
    }
}