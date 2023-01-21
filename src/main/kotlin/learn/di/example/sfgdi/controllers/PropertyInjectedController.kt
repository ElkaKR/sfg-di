package learn.di.example.sfgdi.controllers
import learn.di.example.sfgdi.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    lateinit var greetingService: GreetingService

    fun getGreeting():String{
        return greetingService.sayGreeting()
    }

}