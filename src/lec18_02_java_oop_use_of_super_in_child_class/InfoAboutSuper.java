package lec18_02_java_oop_use_of_super_in_child_class;

/*
Use Of Super In Child Class:

Where is the super keyword or super method used?
-- super keyword is used in child class to inherit the properties(variables, methods, constructor) from the parent/super class.

How many constructor can be called by super method in child class from super class?
-- super() can execute only one constructor, either default or parameterized constructor of super class.

If a child class extends a superclass, which constructor is initialized in child class without writing super()? (not teaches in the class)
-- Default constructor of super class (parent class/base class)

Which call must be the first statement in a constructor of child class?
-- Constructor call must be the first statement in a constructor. try to write it as a second statement to see the error.

What the super keyword can do in child class?
-- super keyword can call the method of the super class.
-- super keyword can call the declared/initialized variable of the super class.

​​What do we use super method or super keyword to call the constructor of super class?
-- we use super method to call the constructor of super class

​​What do we use super method or super keyword to call the methods/variables of superclass?
-- we use super keyword to call the methods/variables of superclass.

Can we call any constructor of super class inside a method of child class?
-- No, we can't call any constructor of super class inside a method of child class. 

Can we call any methods/variables of superclass inside a constructor of the child class?
-- Yes, we can call any methods/variables of superclass inside a constructor of the child class

Can we call any constructor of superclass inside a constructor of the child class?
-- Yes, we can call any constructor of a superclass inside a constructor of the child class.

Can we call any methods/variables of superclass inside a method of the child class?
-- Yes, we can call any methods/variables of superclass inside a method of the child class

*/

public class InfoAboutSuper {

}
