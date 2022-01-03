/*
Example HW1
Problem 1: Create Person class that has name and age variables
Compile this class in a package
*/
package com.ben{
/** A person
 *
 *  @constructor create a new person with a name and age.
 *  @param name the person's name
 *  @param age the person's age in years
 */
case class Person(name: String, age: Int) extends Ordered[Person]{
  /** provides comparison based on age */
  def compare(that: Person) = this.age - that.age
}
  
/** Factory for [[com.ben.Person]] instances. */
object Person {
  /** Creates a person with a given name and age.
   *
   *  @param name their name
   *  @param age the age of the person to create
   */
  def apply(name: String, age: Int) = new Person(name, age)
}
}