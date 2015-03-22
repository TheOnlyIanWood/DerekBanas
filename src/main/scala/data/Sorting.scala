package data

import scala.collection.mutable.ListBuffer

/**
 * Created by ian on 22/03/15.
 */
object Sorting {


  /*
       def swapValues(indexOne : Int, indexTwo : Int){
  val temp : Int = theArray(indexOne)
theArray(indexOne) = theArray(indexTwo)
theArray(indexTwo) = temp
}


   */

  def bubbleSort(xs: List[Int]): List[Int] = {

    val tmp = xs.toBuffer
    def swapValues(indexOne: Int, indexTwo: Int) = {
      val temp: Int = tmp(indexOne)
      tmp(indexOne) = tmp(indexTwo)
      tmp(indexTwo) = temp
    }

    for (i <- tmp.length - 1 to 0 by -1) {
      for (j <- 0 to i) {
        if (tmp(j) > tmp(i)) {
          swapValues(j, j + 1)
        }
      }

    }

    tmp.toList
  }

  /**
   * https://github.com/vkostyukov/scalacaster
   */
  def bubblesort[A <% Ordered[A]](list: List[A]): List[A] = {

    def sort(as: List[A], bs: List[A]): List[A] =
      if (as.isEmpty) bs
      else bubble(as, Nil, bs)

    def bubble(as: List[A], zs: List[A], bs: List[A]): List[A] = as match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs)
        else         bubble(h2 :: t, h1 :: zs, bs)
      case h1 :: Nil => sort(zs, h1 :: bs)
    }

    sort(list, Nil)
  }


}
