+------------+
| 06-10-2023 |
+------------+
    =   APPLIED RULES
       --------------------------------------------------------------------------
                                                    OUTER   INNER   OUTER   INNER
        SL  MODIFIER        FIELD   METHOD  CONSTR  CLASS   CLASS  INTERF  INTERF
       --------------------------------------------------------------------------
        1.  public          yes     yes     yes     yes     yes     yes     yes
        2.  protected       yes     yes     yes     no      yes     no      yes
        3.  private         yes     yes     yes     no      yes     no      yes
        4.  <undefined>     yes     yes     yes     yes     no      yes     no
       --------------------------------------------------------------------------
        5.  abstract        no      yes     no      yes     yes     yes     yes
        6.  final           yes     yes     no      yes     yes     no      no
        7.  static          yes     yes     no      no      yes     no      yes
        8.  native          no      yes     no      no      no      no      no
        9.  synchronized    no      yes     no      no      no      no      no
       10.  transient       yes     no      no      no      no      no      no
       11.  volatile        yes     no      no      no      no      no      no
       12.  strictfp        no      yes     no      yes     yes     yes     yes
       --------------------------------------------------------------------------


        int[26]
        +-----------------+
    A,a | 1               | 0
        +-----------------+
    B,b | 0               | 1
        +-----------------+
        | 1               | 2
        +-----------------+
        | 0               | 3
        +-----------------+
        | 0               |
        +-----------------+
        | 0               |
        +-----------------+
        |                 |
        +-----------------+
        | 1               | 22

    =   [modifiers]
        >   abstract
            When a class is incomplete, the class must be declared abstract.
            When a method is abstract, the method doesn't have a body. It is terminated
            with a semicolon (;) after defining the signature.

            abstract class Important {
                String text = "Hello world";

                public int length() {
                    return text.length();
                }

                public abstract String reverse();
            }

        >   final
            =   A class may be final. If a class is final the same can't be inherited.
            =   A field may be final. If a field is final, the field becomes constant. The
            =   value of the field can't be changed after they are created.
            =   A method may be final. If a method is final, the same method can't be
                overrided.

        >   static
            =   A field may be static. If a field is static, all instances of that class
                share common memory location for a static field.

        >   native
        >   synchronized
        >   transient
        >   volatile
        >   strictfp

