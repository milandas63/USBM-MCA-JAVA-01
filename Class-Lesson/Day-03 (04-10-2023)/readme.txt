+------------+
| 04-10-2023 |  Day-03 (Wednesday)
+------------+
    =   Write a program to draw a triangular figure using the asterisk character.
    =   Write a program to draw a triangular figure using the palindrome numbers.
    =   Write a program to print all prime numbers between 1000 and 3000.
    =   Write a program to print all multiplication tables between 2 to 25.

                             *
                            ***
                           *****
                          *******
                         *********
                        ***********
                       *************
                      ***************
                     *****************

    =   How to define a class?
        [access-specifier]
        [modifier]
        class <class-name>
        [extends <parent-class>]
        [implements <interface-list>]
        {}

    =   access-specifier:
        There are 4 access specifiers:
        1)  public
            The access is allowed in two ways, i.e. object reference and
            inheritance across the same package and across other packages.
        2)  protected
            The access is allowed in two ways, i.e. object reference, and
            inheritance across the same package. When it is across other packages,
            only object reference is allowed.
        3)  private
        4)  <undefined>

    =   The hierarchy of Java class:

        project
        +-  package-01
        |   +-  class-01
        |   +-  class-02
        |   +-  class-03
        |   +-  class-04
        +-  package-02
        |   +-  class-011
        |   +-  class-021
        |   +-  class-031
        |   +-  class-041
        +-  package-03
        |   +-  class-012
        |   +-  class-022
        |   +-  class-032
        |   +-  class-042
        
    =   There are 2 ways to access a class:
        1)  By object reference
            Hello h = new Hello();
            h.main();

        2)  By inheritance
            public class Subsidiary extends Hello {
            }


    =   LIST OF RESERVE WORDS/KEY WORDS IN JAVA (53 words)
        abstract    continue    for         new         switch
        assert***   default     goto*       package     synchronized
        boolean     do          if          private     this
        break       double      implements  protected   throw
        byte        else        import      public      throws
        case        enum****    instanceof  return      transient
        catch       extends     int         short       try
        char        final       interface   static      void
        class       finally     long        strictfp**  volatile
        const*      float       native      super       while
        null        true        false

        *       not used
        **      added in 1.2
        ***     added in 1.4
        ****    added in 5.0


