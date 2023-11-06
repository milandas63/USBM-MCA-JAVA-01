+--------------------+
| Monday, 06-11-2023 |  
+--------------------+
    =   What is Object Oriented Programming (OOP) in Java
        >   There are 3 features of OOPs
            =   Encapsulation
                When the program and the data are combined together within one
                unit, which is known as encapsulation
            =   Inheritance
                One program may inherit another program. The program that is inherited
                is known as parent/super/base. In Java, the Object class is the parent
                class of all other Java classes for which it is known as Adam class.
                The C++ language supports multiple inheritance, i.e. one class, the child
                class may inherit multiple classes. Java doesn't support multiple
                inheritance.

                MULTIPLE INHERITANCE

                    +-----------------+            +-------------------+
                    |    Principal    |            |    No-of-years    |
                    +-----------------+            +-------------------+
                          |                                 |
                          +-------------+-------------------+
                                        |
                            +-----------+----------+
                            | Interest-calculation |
                            +----------------------+

                MULTILEVEL INHERITANCE

                   +- Object
                   |  +- No-of-years
                   |  |  +- Principal
                   |  |  |  +- Interrest-calculation

                   +- Object
                   |  +- GreatGrandParent
                   |  |  +- GrandParent
                   |  |  |  +- Parent

            =   Polymorphism
                Polymorphism is of two types:
                >   Overloading
                    When two or more methods have the same name and same signature with
                    different parameter list within the same class, it is known as
                    overloading of methods.

                    Hello World
                    -----------------------------Hello World
                    ---------------Hello World--------------
                    Hello World-----------------------------

                >   Overriding
                    When two methods in the child class and in the parent class have
                    same name same signature and same parameter list, it known
                    as overriding of methods.

                    When method overriding happens, the method of the parent class
                    is suppressed and the method of the child class becomes visible.



