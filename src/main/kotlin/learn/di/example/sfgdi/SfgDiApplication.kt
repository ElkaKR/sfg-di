package learn.di.example.sfgdi

import learn.di.example.sfgdi.controllers.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class SfgDiApplication

fun main(args: Array<String>) {

   val ctx:ApplicationContext = runApplication<SfgDiApplication>(*args)

   println("------ PROFILE -------")
   val i18NController:I18NController = ctx.getBean("i18NController") as I18NController
   println(i18NController.sayHello())

   println("------ PRIMARY -------")
   val myController:MyController = ctx.getBean("myController") as MyController
   println(myController.sayHello())

   println("------ Properties -------")
   val propertyInjectedController:PropertyInjectedController = ctx.getBean("propertyInjectedController") as PropertyInjectedController
   println(propertyInjectedController.getGreeting())

   println("------ Setter -------")
   val setterInjectedController:SetterInjectedController = ctx.getBean("setterInjectedController") as SetterInjectedController
   println(setterInjectedController.getGreeting())

   println("------ Constructor -------")
   val constructorInjectedController:ConstructorInjectedController = ctx.getBean("constructorInjectedController") as ConstructorInjectedController
   println(constructorInjectedController.getGreeting())
}
