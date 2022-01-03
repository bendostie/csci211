/*
Example HW1
Benjamin Dostie
Problem 3: Create BinarySearch class that uses pattern matching 
with tail recursion and returns the index of the item or -1.
Put the class in a package and compile
*/

import scala.annotation.tailrec
import math.Ordered.orderingToOrdered
import myPackage.QuickSort.sort
package myPackage{


object BinarySearch {
  /** searches for an element in an array
   * @param arr array to be searched
   * @param item item to find
   * @return index of item or -1 if not found
   */
  def search[T](arr: Array[T], item: T)(implicit ord: T =>
    Ordered[T]): Int = {

    /** helper function for tailrec 
     * @param arr array to be searched
     * @param item item to find
     * @param upper upper inddex of the current partition
     * @param lower lower index of the current partition 
    */
    @tailrec def binarySearch[T](arr: Array[T], item: T, 
      lower: Int, upper: Int)(implicit ord: T => Ordered[T]): Int = {
      if (lower > upper)
        return -1
      var middle = lower + (upper - lower) / 2
      arr match {
        case(arr:Array[T]) if (arr(middle) == item) => middle
        case(arr:Array[T]) if (arr(middle) < item) => 
          binarySearch(arr, item, middle + 1, upper) 
        case(arr:Array[T]) if (arr(middle) > item) => 
          binarySearch(arr, item, lower, middle - 1)
      }
    } 
    // sort input array, first partition is whole array (index 0 to len - 1)
    binarySearch(arr, item, 0, arr.length - 1)
  }
}
}