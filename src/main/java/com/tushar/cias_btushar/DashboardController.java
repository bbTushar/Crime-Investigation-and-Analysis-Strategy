/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class DashboardController implements Initializable {


    @FXML
    private Label btnHeader;
    @FXML
    private JFXButton close;
    @FXML
    private JFXButton btnWomenSafety;
    @FXML
    private JFXButton btnAddComplaint;
    @FXML
    private JFXButton btnLogOut;
    @FXML
    private JFXButton backToHome;
    @FXML
    private VBox vbox;
    @FXML
    private JFXButton btnWorld;
    @FXML
    private JFXButton btnAsia;
    @FXML
    private JFXButton btnIndia;

    /**
     * Initializes the controller class.
     */
    private Parent fxml;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnHeader.setText("   World Analysis");
        btnWorld.setStyle("-fx-background-color: #730411");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/Dashboard_Main.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void crossClose(ActionEvent event) {
        loadStage("/fxml/Climax.fxml");
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @FXML
    private void open_WomenSafety(ActionEvent event) {
        btnHeader.setText("   World Map");
        btnWorld.setStyle("-fx-background-color: transparent");

        btnAsia.setStyle("-fx-background-color: transparent");
        btnIndia.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: #730411");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/Map.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_AddComplaints(ActionEvent event) {
        btnHeader.setText("   Radar Chart");
        btnWorld.setStyle("-fx-background-color: transparent");

        btnAsia.setStyle("-fx-background-color: transparent");
        btnIndia.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: #730411");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/Radar.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void logOut(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        loadStage("/fxml/FXMLSignIn.fxml");
        FXMLHomeController hcn = new FXMLHomeController();
        hcn.homeset(true);

    }

    @FXML
    private void backToHome(ActionEvent event) {
        FXMLHomeController hcn = new FXMLHomeController();
        hcn.homeset(false);
        ((Node)(event.getSource())).getScene().getWindow().hide();
        loadStage("/fxml/FXMLCias.fxml");


    }
    @FXML
    private void open_World(ActionEvent event) {
        btnHeader.setText("   World Analysis");
        btnWorld.setStyle("-fx-background-color: #730411");

        btnAsia.setStyle("-fx-background-color: transparent");
        btnIndia.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/Dashboard_Main.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_Asia(ActionEvent event) {
        btnHeader.setText("   Projection View");
        btnWorld.setStyle("-fx-background-color: transparent");
        btnAsia.setStyle("-fx-background-color: #730411");
        btnIndia.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/Dashboard_Asia.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_India(ActionEvent event) {
        btnHeader.setText("   World View");
        btnWorld.setStyle("-fx-background-color: transparent");
        btnAsia.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnIndia.setStyle("-fx-background-color: #730411");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {

            fxml = FXMLLoader.load(getClass().getResource("/fxml/Dashboard_India.fxml"));
            vbox.getChildren().removeAll();

            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
