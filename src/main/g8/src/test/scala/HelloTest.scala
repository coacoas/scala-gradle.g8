package test.scala

import org.scalatest.{FreeSpec, Matchers}

class HelloTest extends FreeSpec with Matchers {
  "Hello.hello" - {
    "should return hello + project name" in {
      import main.scala.Hello._
      hello should be ("Hello, Scala Gradle Project")
    }
  }
}

