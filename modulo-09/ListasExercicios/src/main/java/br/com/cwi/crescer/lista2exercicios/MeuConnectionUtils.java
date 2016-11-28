/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista2exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author matha
 */
public class MeuConnectionUtils {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "cwi";
    private static final String PASS = "cwi";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
}
