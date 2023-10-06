+------------+
| 05-10-2023 |  Day-04 (Thursday)
+------------+
    =   Java contains 2 sets of data-types:
        >   Primitive data type     Wrapper-classes         Data-Range
            -   byte                java.lang.Byte          -128 to +127
            -   short               java.lang.Short         -32768 to 32767
            -   int*                java.lang.Integer       -2147483648 to 2147483647
            -   long                java.lang.Long          -9223372036854775808 to 9223372036854775807
            -   float               java.lang.Float
            -   double*             java.lang.Double
            -   boolean             java.lang.Boolean
            -   char                java.lang.Character
        >   Object data types

    =   Java programs are written within class. class is a reserve/keyword.
        A Java application is written within a method that is a member of a class.

        Format:
            class <class-name> {
                //  Field member (generally called global variables in other languages)
                String name = "James Gosling";
                int age = 65;

                //  Constructor member
                <class-name>() {

                }

                //  Method member (which is function in other languages)
                void calculate() {
                    .....
                }
                double divide(int dividend, int divisor) {
                    return 0.0;
                }
                public static void main(String[] arg) {
                    System.out.println("Hello World!");
                }
            }

    =   Object
        +-  DataTypes
        |   +-  A
        |   |   +-  B
        |   |   |   +-  C

            A a = new C();
            DataType dt = new B();

        The child class may be instantiated to create the parent class object.

    =   INSTANTIATION
        primary (object always resides in primary)

              a   b   c    q    t   x       y
               \  |  /      \   |    \     /
        --------\-|-/--------\--|-----\---/------------ new
                 \|/          \ |      \ /
               String          \|       B
                                A                 D

        secondary (a class always resides in secondary)

    =   StringPool

        String x = "USBM";
        String y = "United School";
        String z = "Business Management";
        String a = "USBM";

        StringPool
        +------------------------+
        | USBM                   |         x = sp[0]
        +------------------------+
        | United School          |         y = sp[1]
        +------------------------+
        | Business Management    |         z = sp[2]
        +------------------------+
        |                        |         a = sp[0]
        +------------------------+
        |                        |
        +------------------------+
        |                        |
        +------------------------+

    =   There are 3 members of a class:
        1)  field member/global-variables
            >   The field members are very important and required to store data.
            >   The name of the field members should start with a lowercase alphabetic
                character

        2)  constructor member
            >   The constructor members are important, they initialize fields.
            >   They are mostly required to instanciate a class and obtain an object.
            >   Every class must have a constructor. If a constructor is not defined,
                an empty parameter constructor is implicitly created. This constructor
                is called the default constructor.
            >   The name of the constructor must resemble with the class name in
                which it is defined.

                DataTypes dt = new DataTypes();
                DataTypes dt1 = new DataTypes("James", 66, true);

        3)  method member/functions
            >   methods are similar to functions in other language. 
            >   A method may receive parameters. It executes a set of line and return
                the result of the computation. If there is nothing to return, the 
                method be declared void.
            >   A method name should start with a lowercase alphabetic character.

        4)  destructor member (not used)


