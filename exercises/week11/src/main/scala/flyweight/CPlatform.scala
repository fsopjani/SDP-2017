package flyweight

class CPlatform extends Platform {

  println("C Platform object created")

  override def execute(code: Code): Unit =
    println(s"Compiling and executing C code. ${code.code}")
}
