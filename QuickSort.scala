/*
Example HW1
Problem 2: Create a Quicksort class that takes an unordered list 
and returns an ordered list
*/

import math.Ordered.orderingToOrdered
package myPackage{

/** object for quick sort algorithim 
 * uses tail reursion and pattern matching
 */
object QuickSort {
  /** Method to get partition of a List at pivot location
   * 
   *  @param elm 
   *  @param seq sequence to partition
   */
  def partition[T](elm : T, seq : List[T], fp :List[T], sp: List[T])(
  implicit ord: T => Ordered[T]): (List[T], List[T]) = seq match {
    case fe::fl => if (fe < elm) partition(elm, fl, fe::fp,sp)
                                 else 
                                  partition(elm,fl,fp,fe::sp)
    case Nil => (fp,sp)
    
  }

  /** Method to sort List
   *
   *  @param data list to sort
   */
  def sort[T](data : List[T])(implicit ord: T => Ordered[T]): List[T] =
     data match {
    case Nil => Nil
    case fv:: Nil => List(fv)
    case fv::fl => {
                     val (l1, l2) = partition( fv,fl, Nil,Nil)
                      val lfl = sort(l1)
                      val rhl = sort(l2)
                      val tmp = fv :: rhl
                      return lfl ++ tmp    
                   }
  }
}
}