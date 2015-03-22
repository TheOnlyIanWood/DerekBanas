package data

import org.scalatest.FunSuite

/**
 * Created by ian on 22/03/15.
 */
class SortingTest extends FunSuite{

  test("bubble sort"){
    val input = List(2,1,4,3)
    val expected = List(1,2,3,4)
    assert(expected===Sorting.bubbleSort(input))
  }

  test("bubble sort 2"){
    val input = List(2,1,4,3)
    val expected = List(1,2,3,4)
    assert(expected===Sorting.bubblesort(input))
  }


}
