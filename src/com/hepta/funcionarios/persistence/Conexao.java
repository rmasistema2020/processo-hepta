package com.hepta.funcionarios.persistence;


import java.sql.*;


public class Conexao
{
    public static void main (String[] args)
    {
        Connection conn = null;

        try
        {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://127.0.0.1:3306/bd_funcionario";
            Class.forName ("/mysql/com.mysql.jdbc.Driver").newInstance();
            Class.forName ("/mysql/mysql-connector-java-5.1.6-bin.jar");
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Conex�o com o BD estabelecida!");
        }
        catch (Exception e)
        {
            System.err.println ("N�o foi poss�vel estabelecer conex�o com o BD");
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Conex�o finalizada");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}