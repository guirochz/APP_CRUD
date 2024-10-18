package com.example.app_busmap;

import android.content.Context;
import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection conectar(Context ctx){
        Connection conn = null;
        try {
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.19.1.223;"+
                    "databaseName=bd_BUSMAP2;user=sa;password=@ITB123456;");
        } catch (SQLException e){
            e.getMessage();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}