+------------+
| 18-10-2023 |  Day-12 (Wednesday)
+------------+
    =   What is a LayoutManager?
        >   A LayoutManager is an interface in the java.awt package.
        >   When the LayoutManager is active, it helps to add the component onto the
            container in the required location and required size.
        >   Using LayoutManager, the components can be automatically setteled to the
            desired location and in the desired size.
        >   There are 5 classes that have implemented the LayoutManager interface:
            1)  FlowLayout
                The components are added to the container like words are added to a
                text editor.
                +----------------------------------------+
                | xxxxxxxxxxxxx xxxxxx xx xxxxxxxxxx     |
                | xxxxxx xxxxxxxxxxxxxxxx xxxxx xxxxxxxx |
                | xxxxxxxxxx xxxxxxxxxx xxxxxxxx         |
                | xxxxxxxxxxxxxxxxxxxxxxx                |
                |                                        |
                |                                        |
                |                                        |
                |                                        |
                |                                        |
                +----------------------------------------+
            2)  BorderLayout
                The container is devided into 5 parts, such as NORTH, WEST, CENTER EAST
                and SOUTH
                +----------------------------------------+
                |                  NORTH                 |
                +---------+---------------------+--------+
                |    W    |                     |   E    |
                |    E    |                     |   A    |
                |    S    |       CENTER        |   S    |
                |    T    |                     |   T    |
                |         |                     |        |
                +---------+---------------------+--------+
                |                  SOUTH                 |
                +----------------------------------------+
            3)  GridLayout
                It devides the container into rows and columns: GridLayout(6,7)
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
                |     |     |     |     |     |     |     |
                +-----+-----+-----+-----+-----+-----+-----+
            4)  CardLayout
            5)  GridBagLayout

