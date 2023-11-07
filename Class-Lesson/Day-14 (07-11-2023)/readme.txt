+------------+
| 07-11-2023 |  Day-14 (Tuesday)
+------------+
    =   Syntax to start MySQL from the Command prompt
        > mysql -uuser -ppassword
        > show databases;
        > create database if not exists usbm_mca;
        > create table if not exists student_info(
            id          int(6)              not null auto_increment,
            name        varchar(50)         not null unique,
            father      varchar(50)         default null,
            gender      enum('F','M','O')   not null,
            dob         date,
            course      varchar(50),
            department  varchar(50),
            primary key(id)
          );
        > insert into student_info values(1, 'Gyana Ranjan Dash', 'Dash', 'M', '2002-06-02', 'MCA', 'Master in Computer Application');
        > insert into student_info(name,father,gender,dob,course,department) values('Naveen Patnaik','Biju Patnaik','M','1959-01-01','MBA','Master in Business Administration');
        > select * from student_info;

    =   JDBC (Java DataBase Connectivity)

    =   How to communicate with a DB using Java Programming Language?
        JDBC - Java DataBase Connectivity
        >   Type-1 driver or JDBC-ODBC bridge driver
        >   Type-2 driver or Native-API driver
        >   Type-3 driver or Network Protocol driver
        >   Type-4 driver or Thin driver

    =   Prior to JDBC, Microsoft's ODBC was the only agent to connect to a database.

    =   How to connect a Java program to any RDBMS?
        >   To connect with MySQL engine, we use MySQL Connector.
        >   There are 6 steps to be followed to connect with any RDBMS:
            1)  Step-1: Load and Register the driver
                org.gjt.mm.mysql.Driver
                com.jdbc.mysql.Driver
            2)  Step-2: Create Connection object
            3)  Step-3: Create Statement object
            4)  Step-4: Create ResultSet object
            5)  Step-5: Manipulate ResultSet
            6)  Step-6: Close ResultSet, Statement & Connection objects

    =   ASSIGNMENT
        Modify the program to display the list in the following format:
        +----+-------------------+--------------+--------+------------+--------+
        | id | name              | father       | gender | dob        | course |
        +----+-------------------+--------------+--------+------------+--------+
        |  1 | Gyana Ranjan Dash | Dash         | M      | 2002-06-02 | MCA    |
        |  2 | Naveen Patnaik    | Biju Patnaik | M      | 1959-01-01 | MBA    |
        +----+-------------------+--------------+--------+------------+--------+
