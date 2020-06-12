/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class FinalLoadingController implements Initializable {

    @FXML
    private ImageView imageView;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       // File f = new File("F:\\My Netbeans\\CIAS\\src\\image\\tick.png");
        Image image = new Image(getClass().getResourceAsStream("/image/tick.png"));

        TranslateTransition ts0 = new TranslateTransition(Duration.seconds(3),imageView);

        ts0.play();

        ts0.setOnFinished(event ->{
            imageView.setImage(image);
            label.setText("Your Complaint is Registered Successfully!");
        });
    }

}
