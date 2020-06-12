/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class ConfirmComplaintController implements Initializable {

    @FXML
    private AnchorPane acpane;
    @FXML
    private JFXButton submit;
    private Parent fxml;
    @FXML
    private  Label name;
    @FXML
    private  Label cato;
    @FXML
    private  Label cCity;
    @FXML
    private  Label cDistrict;
    @FXML
    private  Label cState;
    @FXML
    private Label cStation;
    @FXML
    private  Label cDate;
    @FXML
    private Label cTime;
    @FXML
    private JFXCheckBox check;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            submit.setDisable(true);
            Connection con = DbConnection.Connection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement("SELECT victimFN,victimLN,category,city,district,state,station,date,time FROM complaint ORDER BY complaintNo DESC LIMIT 1");
            rs = ps.executeQuery();
            if(rs.next())
            {

                name.setText(rs.getString(1)+" "+rs.getString(2));
                cato.setText(rs.getString(3));
                cCity.setText(rs.getString(4));
                cDistrict.setText(rs.getString(5));
                cState.setText(rs.getString(6));
                cStation.setText(rs.getString(7));
                cDate.setText(rs.getString(8));
                cTime.setText(rs.getString(9));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConfirmComplaintController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void submit(ActionEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/finalLoading.fxml"));

            acpane.getChildren().removeAll();
            acpane.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void checkB(ActionEvent event) {
        if(check.isSelected())
        {
            submit.setDisable(false);
        }else{
            submit.setDisable(true);
        }
    }



}
