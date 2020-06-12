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
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Tushar
 */

public class FXMLHomeController implements Initializable {

    @FXML
    private WebView webView;

    private WebEngine engine;
    @FXML
    private JFXButton btn;
    @FXML
    private Label label2;
    @FXML
    private Label label1;
    public static boolean flag=true;
    @FXML
    private AnchorPane fxmlHome;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        engine = webView.getEngine();

        engine.load(getClass().getResource("/javascript/amcharts4/examples/javascript/word-cloud-changing-data/index.html").toExternalForm());
        

       
        if(flag!=false){
            label1.setVisible(false);
            TranslateTransition ts0 = new TranslateTransition(Duration.seconds(2),label1);
            ts0.setByY(1200);
            ts0.play();
            label1.setVisible(true);
            ts0.setOnFinished(event ->{
                TranslateTransition tsa = new TranslateTransition(Duration.seconds(8),label1);
                tsa.setByY(-1200);
                tsa.play();
            });


            TranslateTransition ts = new TranslateTransition(Duration.seconds(0.5),label2);
            ts.setByY(700);
            ts.play();
            ts.setOnFinished(event ->{
                TranslateTransition tsa = new TranslateTransition(Duration.seconds(7),label2);
                tsa.setByY(-700);
                tsa.play();
            });


            //buttton
            TranslateTransition ts1 = new TranslateTransition(Duration.seconds(0.5),btn);
            ts1.setByY(700);
            ts1.play();
            ts1.setOnFinished(event ->{
                TranslateTransition ts2 = new TranslateTransition(Duration.seconds(9),btn);
                ts2.setByY(-700);
                ts2.play();

            });}

    }

    @FXML
    private void gotoDashboard(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        loadStage("/fxml/Loading2.fxml");

    }
    public void homeset(boolean b)
    {
        flag = b;
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
