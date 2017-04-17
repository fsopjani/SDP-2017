package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var currentPos = 0

  override def hasNext(): Boolean = currentPos < shapes.length

  override def next(): Shape = {
    val result = shapes(currentPos)
    currentPos = currentPos + 1
    result
  }

  override def remove(): Unit = {
    shapes.take(currentPos)
    currentPos = currentPos + 1
  }
}