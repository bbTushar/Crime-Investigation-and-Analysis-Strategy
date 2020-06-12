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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Tushar
 */
public class FXMLCiasController implements Initializable {

    @FXML
    private JFXButton close;
    @FXML
    private VBox vbox;
    @FXML
    private JFXButton btnHome;
    @FXML
    private JFXButton btnHotNews;
    @FXML
    private JFXButton btnCrime;
    @FXML
    private JFXButton btnWomenSafety;
    @FXML
    private JFXButton btnAddComplaint;
    @FXML
    private JFXButton btnLogOut;
    @FXML
    private Label btnHeader;
    @FXML
    private AnchorPane fxmlCias;

    @FXML
    void crossClose(ActionEvent event) {
        loadStage("/fxml/Climax.fxml");
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    private Parent fxml;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnHeader.setText("   Home");
        btnHome.setStyle("-fx-background-color: #730411");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLHome.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_Home(ActionEvent event) {
        FXMLHomeController hcn = new FXMLHomeController();
        hcn.homeset(false);
        btnHeader.setText("   Home");
        btnHome.setStyle("-fx-background-color: #730411");

        btnHotNews.setStyle("-fx-background-color: transparent");
        btnCrime.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLHome.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_HotNews(ActionEvent event) {
        btnHeader.setText("   Hot News");
        btnHome.setStyle("-fx-background-color: transparent");
        btnHotNews.setStyle("-fx-background-color: #730411");
        btnCrime.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLHotNews.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void open_WomenSafety(ActionEvent event) {
        btnHeader.setText("   Women Safety");
        btnHome.setStyle("-fx-background-color: transparent");
        btnHotNews.setStyle("-fx-background-color: transparent");
        btnCrime.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: #730411");
        btnAddComplaint.setStyle("-fx-background-color: transparent");
        try {

            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLWomenSafety.fxml"));
            vbox.getChildren().removeAll();

            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @FXML
    private void open_AddComplaints(ActionEvent event) {
        btnHeader.setText("   CIAS Reporting Portal");
        btnHome.setStyle("-fx-background-color: transparent");
        btnHotNews.setStyle("-fx-background-color: transparent");
        btnCrime.setStyle("-fx-background-color: transparent");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: #730411");
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLAddComplaints.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void open_Crime(ActionEvent event) {
        btnHeader.setText("   Crime");
        btnHome.setStyle("-fx-background-color: transparent");
        btnHotNews.setStyle("-fx-background-color: transparent");
        btnCrime.setStyle("-fx-background-color: #730411");
        btnWomenSafety.setStyle("-fx-background-color: transparent");
        btnAddComplaint.setStyle("-fx-background-color: transparent");

        FXMLCrimeController c = new FXMLCrimeController();
        c.setPane(fxmlCias);

        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLCrime.fxml"));
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
