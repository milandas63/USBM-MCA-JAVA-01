+------------+
| 10-10-2023 |  Day-07 (Tuesday)
+------------+
    >   The program is written within the try block
    >   When an exception occurs within the try block, an exception object is generated.
        The exception object resides within a variable defined in one of the catch clauses 
        that match the object.
    >   The following lines of that line that generates the exception are ignored.

    >   What is an exception class?
        An exception class is a special class that inherits the Throwable class.
    >   There are two types of exception classes:
        1)  Checked exception
            i)  An exception is generated from the try block but not handled in the
                catch clause
           ii)  An exception is not generated from the try block but unnecessarily
                handled in the catch clause
        2)  Unchecked exception
            >   An exception that is not checked by the compiler.
            >   Any exception class that inherits the RuntimeException is treated as
                an unchecked exception.

    >   Hierarchy of Exception class:
        Object
        +- Throwable
        |  +- Error (The class tree is used by JVM)
        |  |  +- AnnotationFormatError
        |  |  +- AssertionError
        |  |  +- AWTError
        |  |  +- CoderMalfunctionError
        |  |  +- FactoryConfigurationError
        |  |  +- FactoryConfigurationError
        |  |  +- IOError
        |  |  +- LinkageError
        |  |  +- SchemaFactoryConfigurationError
        |  |  +- ServiceConfigurationError
        |  |  +- ThreadDeath
        |  |  +- TransformerFactoryConfigurationError
        |  |  +- VirtualMachineError
        |  +- Exception (User's class)
        |  |  +- AclNotFoundException
        |  |  +- ActivationException
        |  |  +- AlreadyBoundException
        |  |  +- ApplicationException
        |  |  +- AWTException
        |  |  +- BackingStoreException
        |  |  +- BadAttributeValueExpException
        |  |  +- BadBinaryOpValueExpException
        |  |  +- BadLocationException
        |  |  +- BadStringOperationException
        |  |  +- BrokenBarrierException
        |  |  +- CertificateException
        |  |  +- CloneNotSupportedException
        |  |  +- DataFormatException
        |  |  +- DatatypeConfigurationException
        |  |  +- DestroyFailedException
        |  |  +- ExecutionException
        |  |  +- ExpandVetoException
        |  |  +- FontFormatException
        |  |  +- GeneralSecurityException
        |  |  +- GSSException
        |  |  +- IllegalClassFormatException
        |  |  +- InterruptedException
        |  |  +- IntrospectionException
        |  |  +- InvalidApplicationException
        |  |  +- InvalidMidiDataException
        |  |  +- InvalidPreferencesFormatException
        |  |  +- InvalidTargetObjectTypeException
        |  |  +- IOException
        |  |  +- JAXBException
        |  |  +- JMException
        |  |  +- KeySelectorException
        |  |  +- LambdaConversionException
        |  |  +- LastOwnerException
        |  |  +- LineUnavailableException
        |  |  +- MarshalException
        |  |  +- MidiUnavailableException
        |  |  +- MimeTypeParseException
        |  |  +- MimeTypeParseException
        |  |  +- NamingException
        |  |  +- NoninvertibleTransformException
        |  |  +- NotBoundException
        |  |  +- NotOwnerException
        |  |  +- ParseException
        |  |  +- ParserConfigurationException
        |  |  +- PrinterException
        |  |  +- PrintException
        |  |  +- PrivilegedActionException
        |  |  +- PropertyVetoException
        |  |  +- ReflectiveOperationException
        |  |  +- RefreshFailedException
        |  |  +- RemarshalException
        |  |  +- RuntimeException
        |  |  +- SAXException, ScriptException, ServerNotActiveException, SOAPException, SQLException, TimeoutException, TooManyListenersException, TransformerException, TransformException, UnmodifiableClassException, UnsupportedAudioFileException, UnsupportedCallbackException, UnsupportedFlavorException, UnsupportedLookAndFeelException, URIReferenceException, URISyntaxException, UserException, XAException, XMLParseException, XMLSignatureException, XMLStreamException, XPathException

    =   ASSIGNMENT:
        Create the following exception classes:

        Object
        +- Throwable
        |  +- Exception
        |  |  +- AgeException
        |  |  |  +- AgeCeilingException
        |  |  |  |  +- TooYoungAgeException
        |  |  |  |  +- TooOldAgeException
        |  |  |  +- InvalidAgeException
        |  |  |  |  +- NegativeAgeException
        |  |  |  |  +- ZeroAgeException


        int ages[] = {56,25,14,27,45,93,99,84,67,0,-24,55};

