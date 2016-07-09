package questathon.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class QuestathonApplication

fun main(args: Array<String>) {
    SpringApplication.run(QuestathonApplication::class.java, *args)
}
