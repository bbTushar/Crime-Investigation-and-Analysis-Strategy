
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FXMLRegistrationController implements Initializable {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    @FXML
    private JFXButton close;
    @FXML
    private JFXButton btnOpenSignIn;
    @FXML
    private JFXButton btnback;
    @FXML
    private JFXTextField firstN;
    @FXML
    private JFXTextField lastN;
    @FXML
    private JFXTextField phoneNo;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXPasswordField pwd;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXButton sign;
    @FXML
    private Label success;
    @FXML
    private Label fail;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        success.setVisible(false);
        fail.setVisible(false);
    }    

    @FXML
    private void crossClose(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void openSignIn(ActionEvent event) {
         loadStage("/fxml/FXMLSignIn.fxml"); 
         ((Node)(event.getSource())).getScene().getWindow().hide();
               
    }

    @FXML
    private void getBack(ActionEvent event) {
    }
    private void loadStage(String fxml) {
        try {
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        } catch (IOException var4) { 
        }

    }

    @FXML
    private void signUp(ActionEvent event) throws SQLException {
        success.setVisible(false);
        fail.setVisible(false);
        if(firstN.getText().isEmpty()||lastN.getText().isEmpty()||phoneNo.getText().isEmpty()||id.getText().isEmpty()||pwd.getText().isEmpty()||phoneNo.getText().length()!=10)
        {
           fail.setVisible(true);
          
        }else
        {
         conn = DbConnection.Connection();
         String sql = "insert into register (firstN,lastN,phoneNo,id,pwd,address) values(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,firstN.getText() );
            pst.setString(2,lastN.getText() );
            pst.setString(3,phoneNo.getText() );
            pst.setString(4,id.getText() );
            pst.setString(5,pwd.getText() );
            pst.setString(6,address.getText() );
            int i = pst.executeUpdate();
            if(i>0)
            {
               
                pst.close();
                sql = "insert into login (id,pwd) values(?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1,id.getText());
                pst.setString(2,pwd.getText());
                i = pst.executeUpdate();
                if(i>0)
                {
                  
                    success.setVisible(true);
                    firstN.setText("");
                    lastN.setText("");
                    phoneNo.setText("");
                    id.setText("");
                    pwd.setText("");
                    address.setText("");
                   // sign.setStyle("-fx-background-color: #008000");
                }
            }else{
               
            }
        }
            
    }
    
}
