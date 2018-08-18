package java.util.function

import java.util.Objects

trait BiConsumer[T, U] { self =>

  def accept(t: T, u: U): Unit

  def andThen(after: BiConsumer[_ >: T, _ >: U]): BiConsumer[T, U] = {
    Objects.requireNonNull(after)

    new BiConsumer[T, U] {
      override def accept(t: T, u: U): Unit = {
        self.accept(t, u)
        after.accept(t, u)
      }
    }
  }
}
