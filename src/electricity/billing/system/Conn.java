package electricity.billing.system;

import java.sql.*;

public class Conn {
    
    // 5 number ka code h

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Dubeyaddy1998");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}