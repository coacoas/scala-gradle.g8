package test.scala

import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FreeSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloTest extends FreeSpec with ShouldMatchers {
  "Hello.hello" - {
    "should return hello + project name" in {
      import main.scala.Hello._
      hello should be ("Hello, $name$")
    }
  }
}
