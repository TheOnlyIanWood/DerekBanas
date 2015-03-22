def fibonacci(n: Int): Int =
  if (n == 0 || n == 1) 1
  else fibonacci(n - 1) + fibonacci(n - 2)


fibonacci(5)


/**
 * Converts given number 'x' into Roman representation.
 *
 * Time - O(n)
 * Space - O(n)
 */
def intToRoman(x: Int): String = {
  val digits = List(1000 -> "M", 900 -> "CM", 500 -> "D",
    400 -> "CD", 100 -> "C", 90 -> "XC",
    50 -> "L", 40 -> "XL", 10 -> "X",
    9 -> "IX", 5 -> "V", 4 -> "IV",
    1 -> "I")

  def loop(l: List[(Int, String)], y: Int): String =
    if (y == 0) ""
    else l.head match {
      case (v, s) if (v <= y) => s + loop(l, y - v)
      case _ => loop(l.tail, y)
    }
  loop(digits, x)
}

intToRoman(3)
intToRoman(4)
intToRoman(6)

Math.log10(10)
Math.log10(100)
Math.log10(200)
Math.log10(1000)
1000*1000
Math.log10(5000)
Math.log10(10000)
10000*10000
