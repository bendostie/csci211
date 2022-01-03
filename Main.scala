
//Name file with format: HWX_FirstnameLastname
//Be sure files have .scala extension
//List problem statements at beginning:

/*
Example HW1 
Benjamin Dostie
Problem 1: Create a Person class that has name and age variables
Problem 2: Create a Quicksort class that takes an unordered list 
and returns an ordered list
Problem 3: Create BinarySearch class that uses pattern
matching with tail recursion and returns an index
Compile each of these classes in a package
Problem 5: Use the quick sort and binary search to find a Person in 
a list of Persons
*/

//Be sure to include source files and compiled packages in submission:
import com.ben.BinarySearch.search
import com.ben.QuickSort.sort
import com.ben.Person

//Use proper indentation in scala 2 (required in scala 3)
@main def hello: Unit = 
  
  //use proper naming convention and consistent indentation
  val bob = Person("bob", 54)
  
  //limit lines to 70 characters
  val peopleList = List(Person("Jayden", 12), 
  Person("Mary", 34), Person("Kemi", 19), bob)

  //print what the function will do:
  println("Create an instance of Person class:")
  println(bob)
  println("Sort list of Persons by age:")
  //print input to function:
  println("Original: " + peopleList)
  println("Sorted: " + peopleList)
  println("Find index of Person bob: " + search(sort(peopleList).toArray, bob))
