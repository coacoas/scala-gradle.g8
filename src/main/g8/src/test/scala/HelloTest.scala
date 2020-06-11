package test.scala

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class HelloTest extends AnyFreeSpec with Matchers {
  "Hello.hello" - {
    "should return hello + project name" in {
      import main.scala.Hello._
      hello should be ("Hello, $name$")
    }
  }
}

