package A_JDBC.test;

import A_JDBC.conn.ConectionFactory;

public class ConectionFactoryTest {
    public static void main(String[] args) {
        ConectionFactory conectionFactory = new ConectionFactory();
        System.out.println(conectionFactory.getConnection());
    }
}