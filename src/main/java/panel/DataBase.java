/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author YK
 */
public class DataBase {
    private String url, user, password;
    public DataBase(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }
    public boolean checkConnection(){
        Connection conn = null;
        try {
            /*String url = "jdbc:mysql://localhost:3306";
            String user = "root";
            String password = "";*/

            conn = DriverManager.getConnection("jdbc:mysql://"+url, user, password);
            return true;
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
