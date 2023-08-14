object q3 {
  def main (args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper) + formatNames("roshan")(toLower))
    println(formatNames("Saman")(toLower))
    println(formatNames("K")(toUpper) + formatNames("umar")(toLower) + formatNames("a")(toUpper))
  }

  val toUpper : String => String = name => name.toUpperCase
  val toLower : String => String = name => name.toLowerCase

  val formatNames = (name:String) => (formatFunc:String => String) => formatFunc(name)

}
