
package com.tushar.cias_btushar;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class Loading2Controller implements Initializable {

    @FXML
    private ImageView img;
    @FXML
    private Label lbl;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadStage("/fxml/Dashboard.fxml");
        Random ran = new Random();
        int ranN = ran.nextInt(7);

        TranslateTransition ts = new TranslateTransition(Duration.seconds(5),lbl);

        ts.play();

        ts.setOnFinished(event ->{
            stage.show();
            Stage primaryStage = (Stage) lbl.getScene().getWindow();
            primaryStage.close();

        });

    }
    private void loadStage(String fxml) {
        try {
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource(fxml));
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.TRANSPARENT);
           
        } catch (IOException var4) {
        }

    }
    Stage stage;
}