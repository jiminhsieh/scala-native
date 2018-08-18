package java.util.function

object BiConsumerSuite extends tests.Suite {
  test("accept") {

    val input                 = ("scala", 2018)
    var result: (String, Int) = null
    val biConsumer = new BiConsumer[String, Int] {
      override def accept(t: String, u: Int): Unit = {
        result = (t, u)
      }
    }

    biConsumer.accept(input._1, input._2)

    assert(input == result)
  }

  /*test("andThen") {

    var result: (Int, Int) = (0, 0)
    val biConsumer = new BiConsumer[Int, Int] {
      override def accept(t: Int, u: Int): Unit = {
        result = (result._1 + t + 1, result._2 + u + 2)
      }
    }

    biConsumer.andThen(biConsumer).accept(0, 0)

    assert(result == (2, 4))
  }*/
}
