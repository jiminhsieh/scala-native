package java.util.function

object ConsumerSuite extends tests.Suite {

  test("accept(t: T): Unit") {
    val input          = "scala"
    var result: String = null

    val consumer = new Consumer[String] {
      override def accept(t: String): Unit = {
        result = t
      }
    }

    consumer.accept(input)

    assert(input == result)
  }

  /*test("andThen") {
    var result: Int = 0

    val consumer1 = new Consumer[Int] {
      override def accept(t: Int): Unit = {
        result += 1
      }
    }

    val consumer2 = new Consumer[Int] {
      override def accept(t: Int): Unit = {
        result += 1
      }
    }

    consumer1.andThen(consumer2).accept(0)

    assert(result == 3)
  }*/
}
