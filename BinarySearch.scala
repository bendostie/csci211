/*
Example HW1
Problem 3: Create BinarySearch class that uses pattern
matching with tail recursion and returns an index
put the class in a package and compile
*/

import scala.annotation.tailrec
import math.Ordered.orderingToOrdered
import com.ben.QuickSort.sort
package com.ben{


object BinarySearch {
  /** searches for an element in an array
   * @param arr array to be searched
   * @param item item to find
   * @return index of item or -1 if not found
   */
  def search[T](arr: Array[T], item: T)(implicit ord: T =>
    Ordered[T]): Int = {
    /** helper function for tailrec */
    @tailrec def binarySearch[T](arr: Array[T], item: T, 
      low: Int, high: Int)(implicit ord: T => Ordered[T]): Int = {
      if (low > high)
        return -1
      var middle = low + (high - low) / 2
      arr match {
        case(arr:Array[T]) if (arr(middle) == item) => middle
        case(arr:Array[T]) if (arr(middle) < item) => 
          binarySearch(arr, item, middle + 1, high) 
        case(arr:Array[T]) if (arr(middle) > item) => 
          binarySearch(arr, item, low, middle - 1)
      }
    } 
    // sort input array, low index 0, high index last in array
    binarySearch(sort(arr), item, 0, arr.length - 1)
  }
}
}