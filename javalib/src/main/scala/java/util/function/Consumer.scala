package java.util.function

import java.util.Objects

trait Consumer[T] { self =>

  def accept(t: T): Unit

  def andThen(after: Consumer[_ >: T]): Consumer[T] = {
    Objects.requireNonNull(after)
    new Consumer[T] {
      override def accept(t: T): Unit = {
        self.accept(t)
        after.accept(t)
      }
    }
  }
}
