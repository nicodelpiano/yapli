package yapli

import org.scalatest._

class YapliSpec extends FlatSpec with Matchers {
  "The Yapli object" should "say hello Yapli" in {
    Yapli.greeting shouldEqual "hello Yapli"
  }
}
