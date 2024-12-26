```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Incorrect way to convert ListBuffer to immutable List
  val immutableList = buffer.toList

  //This will modify the original ListBuffer
  buffer += 4

  println(immutableList) // Output: List(1, 2, 3) - unexpectedly immutable 
  println(buffer) //Output: ListBuffer(1, 2, 3, 4)
}
```