 <h1>Class Exercise 1: </h1>
it's about Object-oriented programming (OOP)

### What is OOP?
OOP is a computer programming model that organizes software design around data,
or objects, rather than functions and logic. An object can be defined as a data field that has unique attributes and behavior.

#### Pillars Of OOP!

<h3>1.Abstraction: </h3>
 is a model of a real-world object or phenomenon,limited to a specific context.

<h3> 2.Encapsulation:</h3>
    to hide information in implementation level and efficiency memory 
    in another word, object can do thing we don't need to know how!
    
   <b>Q: How help in efficiency memory?</b><br>
   A: a. in another word, we can ask what is the different between direct access to property or getter method ?
      in getter method we know tha address of property but in direct access [dot access] we search the property in object scope.<br>
      b. addition, reuse setter method inside the constructor helps in reduce or avoid duplicate code<br>

<h3>3.Inheritance:</h3>
    is the ability to build new classes on top of existing ones<br>
   <b> Q: what are the benefits?</b><br>
   A: reuse code to avoid duplicate code<br>
      
      
<h3>4.Polymorphism:</h3>
    is the ability of a program to detect the real class of an object,<br> 
    and call its implementation even when its real type is unknown in the current context.<br>
   
   separate the logic <br>
   

The primary purpose of OOP is to make efficiency memory<br>

 </h2>Abstract class  </h2>
<b>How we can make abstract class in Java language?</b>

using abstract keyword

syntax: [modifier-access] [abstract] [class] [className]{}

#### notes:
   a.we can't generate object from abstract class 
   b.abstract class contains abstract and non-abstract methods
   c.abstract class contains static,non-static and final variables
   d.we must implement all abstract methods in subclass if we use abstract keyword
   e.abstract class using extends keyword 'inheritance'



 <h2>  Memory Sections  </h2>
 JVM class loader to sections the memory depended on the types<br>


methods Area | Heap Memory  | Stack Memory | PC  Register | Native  Method Stack<br>
--- | --- | --- | --- |--- 



if you want more information, you're invited to visit the following link

https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/


 <h2>General Notes </h2>
 information is given
 A is a super-class
 B is a subclass and extends from A class

##### 1. A a = new A(); // ok, normal object: A scope
----------
##### 2. B b = new B(); // ok, normal object: B scope
----------
##### 3. A a1 = new B(); // ok, polymorphism : depended on override methods
----------
##### 4. B b1 = new A(); // completion error, B:[A:[]] | subclass encapsulates superclass in memory we can't generate subclass before superclass
----------
##### 5. A a = new A();
  #####  a        : reference 
  #####  new A()  : object
  #####  new      : keyword in Java to generate object
----------
##### 6. A a : on stack memory references to object in heap memory
----------
##### 7. we can use this and super keywords only in first statement
----------
##### 8. the top class is object and every class extends from object default
----------
##### 9. toString, equals methods and HashCode methods in Object class we can override these methods if we need
###### for example, a. why we need to override HashCode methods? 
   ######            maybe we need to use in setHash DS and there we want to make sure we have unique key
   ######        b. why we need to override Equals methods?
   ######            to equals between objects
----------               
##### 10. String is built-in in Java, so it has equals methods wht special implementation
----------
##### 11. Java not a pure OOP language because it has primitive data type
----------
##### 12. Wrapper class is to convert primitive data to object e.g, int to Integer
   ###### a. why we need Integer, Double, Boolean, etc... classes?
   ######   because the collections 'DSs' but the developer not facing any problem with this why?
   ######   we have boxing and unboxing | boxing converts int to Integer, unboxing converts Integer to int



