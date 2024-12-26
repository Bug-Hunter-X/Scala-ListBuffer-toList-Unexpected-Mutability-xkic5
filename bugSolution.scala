```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct way to create a truly immutable List using List()
  val immutableList = List(buffer: _*)

  //Modifying the original ListBuffer, it does not affect the immutableList
  buffer += 4

  println(immutableList) // Output: List(1, 2, 3) - correctly immutable
  println(buffer) // Output: ListBuffer(1, 2, 3, 4)
}
```