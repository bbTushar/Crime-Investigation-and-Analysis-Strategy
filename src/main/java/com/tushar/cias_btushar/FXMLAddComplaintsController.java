/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class FXMLAddComplaintsController implements Initializable {

    @FXML
    private Button btnHome;
    @FXML
    private Button btnWomenC;
    @FXML
    private Button btnCyber;
    @FXML
    private Button btnOther;
    @FXML
    private Pane panec;
    private Parent fxml;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnHome.setStyle("-fx-background-color: #730411");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/AddComplaintHome.fxml"));

            panec.getChildren().removeAll();
            panec.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    @FXML
    private void complaintHome(ActionEvent event) {

        btnHome.setStyle("-fx-background-color: #730411");

        //    btnHome.setStyle("-fx-border:5px dotted #1c6ea4;");

        btnWomenC.setStyle("-fx-background-color:  #228b22");
        btnCyber.setStyle("-fx-background-color:  #0000ff");
        btnOther.setStyle("-fx-background-color:  #6a5acd");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/AddComplaintHome.fxml"));

            panec.getChildren().removeAll();
            panec.getChildren().setAll(fxml);

        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @FXML
    private void complaintWomenC(ActionEvent event) {
        btnHome.setStyle("-fx-background-color:  #ffa07a");
        btnWomenC.setStyle("-fx-background-color: #730411");
        btnCyber.setStyle("-fx-background-color:  #0000ff");
        btnOther.setStyle("-fx-background-color:  #6a5acd");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/WomenReport.fxml"));

            panec.getChildren().removeAll();
            panec.getChildren().setAll(fxml);

        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void complaintCyber(ActionEvent event) {
        btnHome.setStyle("-fx-background-color:  #ffa07a");
        btnWomenC.setStyle("-fx-background-color:  #228b22");
        btnCyber.setStyle("-fx-background-color: #730411");
        btnOther.setStyle("-fx-background-color:  #6a5acd");
    }

    @FXML
    private void complaintOther(ActionEvent event) {
        btnHome.setStyle("-fx-background-color:  #ffa07a");
        btnWomenC.setStyle("-fx-background-color:  #228b22");
        btnCyber.setStyle("-fx-background-color:  #0000ff");
        btnOther.setStyle("-fx-background-color: #730411");
    }

}
