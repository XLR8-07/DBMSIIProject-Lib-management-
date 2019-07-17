package controllers;

import Connections.DBConnection;
import com.jfoenix.controls.JFXTextField;

import java.sql.Connection;
import java.sql.Statement;

public class IntroController {
    public JFXTextField IDTextField;
    public JFXTextField NameTextField;

    public void Button_Press()
    {
        DBConnection con=new DBConnection();
        Connection connection = con.ConnectDB();

        String id= IDTextField.getText();
        String NAME=NameTextField.getText();
        int i=Integer.parseInt(id);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO TEST VALUES(" + i + "," + "'" + NAME + "')");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
