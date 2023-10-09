+------------+
| 09-10-2023 |  Day-06 (Monday)
+------------+
    =   Creating a package

        ASSIGNMENT:
        38: Write a function that takes a list of strings and prints them, one per line,
            in a rectangular frame.
            For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:
                *********
                * Hello *
                * World *
                * in    *
                * a     *
                * frame *
                *********

    =   Exception handling
        >   Exception handling provides fault resistance technique to a program. The
            program doesn't proceed with faults and give malacious result.
        >   For fault resistance or exception handling, Java has provided a statement
            in the name "try". The try statement has two clauses, "catch" and "finally".
        >   Syntax:
            try {
                int i = 25;
                int j = 0;
                System.out.println(i/j);
                System.out.println("This program doesn't have any exceptions");
            } catch(ExceptionName1 e) {
            } catch(ExceptionName2 e) {
            } catch(ExceptionName3 e) {
            } catch(ExceptionName4 e) {
            } finally {
            }
        >   Write the program within the try block.

