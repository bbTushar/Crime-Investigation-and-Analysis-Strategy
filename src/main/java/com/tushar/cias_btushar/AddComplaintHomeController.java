/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class AddComplaintHomeController implements Initializable {

    @FXML
    private JFXButton fileCompl;
    @FXML
    private AnchorPane acpane;
    private Parent fxml;
    public Button b;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO


    }

    @FXML
    private void openFile(ActionEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/beforeComplaint.fxml"));

            acpane.getChildren().removeAll();
            acpane.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    void learn(ActionEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://victimsofcrime.org/library/crime-information-and-statistics"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }
}



