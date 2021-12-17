package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    private Connection conn;
    private static Database db = null;
    private final String USER = "postgres";

    //PUT YOUR OWN PASSWORD!
    private final String PASSWORD = "rootroot";
    private final String DBNAME = "capstonemock";
    private final String PORT = "5432";
    private final String HOST = "localhost";

    private Database() {
        try {
            this.setConn(DriverManager.getConnection("jdbc:postgresql://"+HOST+":"+PORT+"/"+DBNAME,USER,PASSWORD));
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public ResultSet query(String query) {
        ResultSet rs = null;

        try {
            rs = getConn().createStatement().executeQuery(query);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return rs;
    }

    public static Database getInstance() {
        return db != null ? db : new Database();
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
