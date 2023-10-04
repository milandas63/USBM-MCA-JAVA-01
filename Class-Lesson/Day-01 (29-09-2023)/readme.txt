+------------+
| 29-09-2023 |
+------------+
    =   What is a computer programming language:
        A computer programming language is a language of notation that is given
        for the computer to understand. The notation language is further converted
        to machine language using a tool called compiler.

        >   The programs are written using ASCII characters because ASCII characters
            are human readable.
        >   They execute in sequence of line number
        >   It has facilities to iterate/loop across a set of lines
        >   It can compute an equation by the presedence of operators
            10 * 3 - 6 + 4 / 3
        >   It can jump to another line and execute from there
        >   It can branch to a set of lines and return back to the point from
            where it has gone
        >   It can check or evaluate conditions
                10 > 25     ==> false
                15 < 40     ==> true

        for(int i=0; i<10; i++) {
            ...........
            ............
            .........
            ................
        }

        double x = 25%2;
        public strict class Somename {}


        C, C++, etc.
        +---------------+       +------------+        +-------------------+
        |  Source Code  |------>|  Compiler  |------->|  Object language  |------>+
        +---------------+       +------------+        +-------------------+       |
                                +-------------------+         +----------+        |
                                |  Machine language |<--------|  Linker  |<-------+
                                +-------------------+         +----------+

        Java
        +---------------+       +------------+        +-------------------+
        |  Source Code  |------>|  Compiler  |------->| Bytecode language |
        +---------------+       +------------+        +-------------------+

        +-------------------+     +---------------+        +------------------+
        | Bytecode language |-----|  Runtime JRE  |--------| Machine language |
        +-------------------+     |  JIT Compiler |        +------------------+
                                  +---------------+

    =   The Runtime JRE provides a number of advantages:
        1)  It does automatic memory management. It reclaims the memory location
            of variables that is not in the scope. This concept is called garbage
            collection.
        2)  It protects from viruses
        3)  It facilitates multi-programming. Several programs may concurrently
            run in Java.

        {
            int i = 10;
            printf(i);
        }
        printf(i);

    =   What is a programming language?

    =   There are 3 types of programming languages:
        >   Passive language
            It is only used for presentation purpose.
            HTML, SGML, etc.

        >   Active language
            Most of the general purpose computer languages are active languages.
            It can solve mission critical problems.
            Using these languages, an application may be written that run in the
            machine in which it resides. It uses the resources of the residing machine.
            C, C++, PL/1, Pascal, etc.

        >   Dynamic language
            A program that resides in another machine. On calling the program
            from the local machine, the program is executed in the residing machine
            using the resouces of the residing machine. It only sends the result
            of the program to the requesting machine. The result is normally
            sent in form of pasive language.
            PHP, ASP, JSP, Java-Servlet, etc.

    =   What is Java?
        Java is an Open Source, Object Oriented Programming language
        Java is open-source and is registered under GNU license

    =   There are 3 modules in Java
        >   JavaSE  -   Java 2 Standard Edition             60%
        >   JavaEE  -   Java 2 Enterprise Edition           25%
        >   JavaME  -   Java 2 Micro Edtion

    =   There are 3 kinds of programmes written in Java:
        >   Application -   Written for machines connected with LAN
        >   Applet      -   Are embedded within HTML and runs on a internet browser
        >   Servlet     -   Web application

    =   >   Java programs are written within a class. The name of the class must not be
            a Java reserve word. There are 53 reserve words.
        >   A Java application starts from the main method.
        >   The format of the main method is "public static void main(String[] arg) {...}

    =   Java programs are written using plain ASCII editors.
        >   Nodepad, Visual Code, EditPlus, Notepad++, etc. are all ASCII editors.
        >   For RAD (Rapid Applicaiton Development) there are few popular IDE (Integrated
            Development Environment) programs.
            -   Eclipse
            -   NetBeans
            -   JBuilder
            -
        Eclipse is the most popular IDE used in the industry for development of Java programs.

    =   To install:
        >   JDK (Java Development Kit)
            jdk-8u271-windows-x64.exe
        >   Java API documentation. It comes in form of HTML
            jdk-8u321-docs-all.zip
        >   Eclipse IDE
            eclipse-java-oxygen-3a-win32-x86_64.zip


