package yapli

object Yapli extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello Yapli"
}
