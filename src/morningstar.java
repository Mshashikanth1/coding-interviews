import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*interviewer  : kalviya, mayur*/
//@RestController
public class morningstar {

    /*employees , with shashi*/

    class employees{
        private  String name;
    }

//    @GetMapping("/get/{name} ?val= val1& var2=val2")
    public void function(
//            @PathVariable
            String name){

        List<employees> employees= new ArrayList<>();

        employees.stream().filter(employeesRec ->employeesRec.name.equals(name)).collect(Collectors.toList());
    }

    /**
    put : update;
    post : insert data; --> body

    name various spring anotations

     @bean vs @component
     @service

     abstract vs interfaces

     functional interfaces --> not answered

     oops
     object o
     **/

}


/* [ mayor told to concentrate on these ]
* Java Basics:
What is the difference between JDK, JRE, and JVM?
JDK (Java Development Kit): It's a software development kit that includes tools for developing Java applications. It contains JRE, compiler, debugger, etc.
JRE (Java Runtime Environment): It's a runtime environment that is needed to run Java applications. It includes JVM and libraries.
JVM (Java Virtual Machine): It's an abstract machine that provides a runtime environment in which Java bytecode can be executed.
*
*
What is the difference between == and equals() method in Java?
== is an operator used to compare references (memory addresses) of objects.
equals() is a method used to compare the content or values of objects. It's overridden from the Object class.

* What is the difference between checked and unchecked exceptions in Java?
  Checked Exceptions: These are checked at compile-time. Methods must either handle them using try-catch blocks or declare them in the method signature using throws keyword.
  Unchecked Exceptions: These are not checked at compile-time. They occur at runtime and are subclasses of RuntimeException. They don't need to be explicitly handled.
  Data Structures and Algorithms (DSA) Basics:
*
*
What is a linked list?
A linked list is a linear data structure consisting of a sequence of elements where each element points to the next element in the sequence.

* Explain the difference between an array and a linked list.
  Array: Fixed size, contiguous memory allocation, random access, efficient for accessing elements by index.
  Linked List: Dynamic size, non-contiguous memory allocation, sequential access, efficient for insertion and deletion at any position.

* What is the time complexity of searching in a binary search tree (BST)?
  The time complexity of searching in a BST is O(log n) on average and O(n) in the worst-case scenario.
*
*
Spring Boot:
What is Spring Boot?
Spring Boot is a framework built on top of the Spring framework that simplifies the process of building and deploying production-ready Java applications.
Explain the concept of auto-configuration in Spring Boot.
Auto-configuration automatically configures Spring beans based on classpath settings, reducing the need for manual configuration.
*
*
What are the main features of Spring Boot?
Simplified dependency management, auto-configuration, embedded HTTP server support, production-ready features (metrics, health checks, etc.), and easy integration with other Spring projects.

*
* Java 8:
  What are the main features introduced in Java 8?
  Lambda expressions, Stream API, Functional interfaces, Default and static methods in interfaces, Optional class, Date and Time API (java.time package), etc.

*
* What is a lambda expression in Java?
  A lambda expression is a concise way to represent an anonymous function. It provides a clear and concise syntax for writing code.

*
* Explain the Stream API in Java 8.
  The Stream API is used to process collections of objects in a functional way. It provides methods to perform aggregate operations on collections such as filter, map, reduce, etc.
    * */
