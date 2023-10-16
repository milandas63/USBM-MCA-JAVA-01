+------------+
| 16-10-2023 |  Day-10 (Monday)
+------------+
    =   Reflection
        It is re-engineering Java compiled code back to Java source code.
        The .class file will be converted back to .java file.

    =   Use the class java.lang.Class to retrieve the list of methods, constructors
        and method names:
            1)  getDeclaredFields()
            2)  getFields()
            3)  getDeclaredConstructors()
            4)  getConstructors()
            5)  getDeclaredMethods();
            6)  getMethods()

    =   The class Class is a final class, so it can't be inherited.
    =   The class Class has only one constructor that is private, so it can't be 
        instantiated.
    =   The only way left was to call the static method, forName() method which 
        returns a Class object.

    =   ASSIGNMENT:
        Create an String array of multiple class names.
        Example: {"java.lang.String","java.io.InputStream","java.io.File"}

