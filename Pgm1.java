/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm1;


import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ELCOT
 */
public class Pgm1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/database1";
        String username = "root";
        String password = "1234";
        
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("success");
        connection.close();
        
    }

    
}
