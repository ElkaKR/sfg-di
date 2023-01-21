package learn.di.example.sfgdi.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("EN")
@Service("і18NService")
class I18NEnglishGreetingService:GreetingService {
    @Override
    override fun sayGreeting(): String {
        return "Hello world - I18N"
    }
}