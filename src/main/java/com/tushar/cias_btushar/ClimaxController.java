/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class ClimaxController implements Initializable {

    @FXML
    private JFXButton exit;
    @FXML
    private Label text;
    @FXML
    private Label a1;
    @FXML
    private Label a3;
    @FXML
    private Label a4;
    @FXML
    private Separator a2;
    @FXML
    private Label d1;
    @FXML
    private Separator d2;
    @FXML
    private Label tus1;
    @FXML
    private Label udd1;
    @FXML
    private Label vin1;
    @FXML
    private Label vais1;
    @FXML
    private Label tus3;
    @FXML
    private Label tus2;
    @FXML
    private Label vin3;
    @FXML
    private Label vin2;
    @FXML
    private Label udd3;
    @FXML
    private Label udd2;
    @FXML
    private Label vais3;
    @FXML
    private Label vais2;
    @FXML
    private ImageView tus0;
    @FXML
    private ImageView udd0;
    @FXML
    private ImageView vin0;
    @FXML
    private ImageView vais0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        int n;
        Random ran = new Random();
        n = ran.nextInt(10);

        switch(n)
        {
            case 1:
                text.setText("“When a man is denied the right to live the life he believes in, he has no choice but to become an outlaw.”\n" +
                        "― Nelson Mandela");
                break;
            case 2:
                text.setText("“I came from a real tough neighborhood. Once a guy pulled a knife on me. I knew he wasn't a professional, the knife had butter on it.”\n" +
                        "― Rodney Dangerfield");
                break;

            case 3:
                text.setText("“All men make mistakes, but a good man yields when he knows his course is wrong, and repairs the evil. The only crime is pride.”\n" +
                        "― Sophocles, Antigone");
                break;

            case 4:
                text.setText("“Poverty is the parent of revolution and crime.”\n" +
                        "― Aristotle");
                break;

            case 5:
                text.setText("“A good act does not wash out the bad, nor a bad act the good. Each should have its own reward.”\n" +
                        "― George R.R. Martin, A Clash of Kings");
                break;

            case 6:
                text.setText("“Criminals should be punished, not fed pastries.”\n" +
                        "― Lemony Snicket, The Blank Book");
                break;

            case 7:
                text.setText("“There are crimes of passion and crimes of logic. The boundary between them is not clearly defined.”\n" +
                        "― Albert Camus");
                break;

            case 8:
                text.setText("“To have once been a criminal is no disgrace. To remain a criminal is the disgrace”\n" +
                        "― Malcolm X");
                break;

            case 9:
                text.setText("“Criminals do not die by the hands of the law. They die by the hands of other men.”\n" +
                        "― George Bernard Shaw, Man and Superman");
                break;

            case 10:
                text.setText("“Law without reason is criminal.”\n" +
                        "― Criss Jami, Healology");
                break;

        }
        TranslateTransition t = new TranslateTransition(Duration.seconds(0.2),text);
        t.setByY(1200);
        t.play();
        t.setOnFinished(event -> {
            TranslateTransition t0 = new TranslateTransition(Duration.seconds(1),text);
            t0.setByY(-1200);
            t0.play();
        });
        // Animation1
        TranslateTransition ts0 = new TranslateTransition(Duration.seconds(0.2),a1);
        TranslateTransition ts1 = new TranslateTransition(Duration.seconds(0.2),a2);
        TranslateTransition ts2 = new TranslateTransition(Duration.seconds(0.2),a3);
        TranslateTransition ts3 = new TranslateTransition(Duration.seconds(0.2),a4);
        ts0.setByY(1200);
        ts1.setByY(1200);
        ts2.setByY(1200);
        ts3.setByY(1200);
        ts0.play();
        ts1.play();
        ts2.play();
        ts3.play();

        ts0.setOnFinished(event ->{
            TranslateTransition tsa0 = new TranslateTransition(Duration.seconds(2),a1);
            tsa0.setByY(-1200);
            tsa0.play();

        });
        ts1.setOnFinished(event ->{
            TranslateTransition tsa1 = new TranslateTransition(Duration.seconds(2),a2);
            tsa1.setByY(-1200);
            tsa1.play();

        });
        ts2.setOnFinished(event ->{
            TranslateTransition tsa2 = new TranslateTransition(Duration.seconds(2),a3);
            tsa2.setByY(-1200);
            tsa2.play();

        });
        ts3.setOnFinished(event ->{
            TranslateTransition tsa3 = new TranslateTransition(Duration.seconds(2),a4);
            tsa3.setByY(-1200);
            tsa3.play();

        });

        //Animation 2
        TranslateTransition td0 = new TranslateTransition(Duration.seconds(0.2),d1);
        TranslateTransition td1 = new TranslateTransition(Duration.seconds(0.2),d2);

        td0.setByY(1200);
        td1.setByY(1200);

        td0.play();
        td1.play();
        td0.setOnFinished(event ->{
            TranslateTransition tda0 = new TranslateTransition(Duration.seconds(2.5),d1);
            tda0.setByY(-1200);
            tda0.play();

        });
        td1.setOnFinished(event ->{
            TranslateTransition tda1 = new TranslateTransition(Duration.seconds(2.6),d2);
            tda1.setByY(-1200);
            tda1.play();

        });
        // Animation3
        TranslateTransition tu0 = new TranslateTransition(Duration.seconds(0.2),tus0);
        TranslateTransition tu1 = new TranslateTransition(Duration.seconds(0.2),tus1);
        TranslateTransition tu2 = new TranslateTransition(Duration.seconds(0.2),tus2);
        TranslateTransition tu3 = new TranslateTransition(Duration.seconds(0.2),tus3);
        tu0.setByX(-1200);
        tu1.setByX(-1200);
        tu2.setByX(-1200);
        tu3.setByX(-1200);
        tu0.play();
        tu1.play();
        tu2.play();
        tu3.play();

        tu0.setOnFinished(event ->{
            TranslateTransition tusa0 = new TranslateTransition(Duration.seconds(3),tus0);
            tusa0.setByX(1200);
            tusa0.play();

        });
        tu1.setOnFinished(event ->{
            TranslateTransition tusa1 = new TranslateTransition(Duration.seconds(3),tus1);
            tusa1.setByX(1200);
            tusa1.play();

        });
        tu2.setOnFinished(event ->{
            TranslateTransition tusa2 = new TranslateTransition(Duration.seconds(3),tus2);
            tusa2.setByX(1200);
            tusa2.play();

        });
        tu3.setOnFinished(event ->{
            TranslateTransition tusa3 = new TranslateTransition(Duration.seconds(3),tus3);
            tusa3.setByX(1200);
            tusa3.play();

        });
        // Animation4
        TranslateTransition udt0 = new TranslateTransition(Duration.seconds(0.2),udd0);
        TranslateTransition udt1 = new TranslateTransition(Duration.seconds(0.2),udd1);
        TranslateTransition udt2 = new TranslateTransition(Duration.seconds(0.2),udd2);
        TranslateTransition udt3 = new TranslateTransition(Duration.seconds(0.2),udd3);
        udt0.setByX(-1200);
        udt1.setByX(-1200);
        udt2.setByX(-1200);
        udt3.setByX(-1200);
        udt0.play();
        udt1.play();
        udt2.play();
        udt3.play();

        udt0.setOnFinished(event ->{
            TranslateTransition tusa0 = new TranslateTransition(Duration.seconds(3.2),udd0);
            tusa0.setByX(1200);
            tusa0.play();

        });
        udt1.setOnFinished(event ->{
            TranslateTransition tusa1 = new TranslateTransition(Duration.seconds(3.2),udd1);
            tusa1.setByX(1200);
            tusa1.play();

        });
        udt2.setOnFinished(event ->{
            TranslateTransition tusa2 = new TranslateTransition(Duration.seconds(3.2),udd2);
            tusa2.setByX(1200);
            tusa2.play();

        });
        udt3.setOnFinished(event ->{
            TranslateTransition tusa3 = new TranslateTransition(Duration.seconds(3.2),udd3);
            tusa3.setByX(1200);
            tusa3.play();

        });
        // Animation5
        TranslateTransition v0 = new TranslateTransition(Duration.seconds(0.2),vin0);
        TranslateTransition v1 = new TranslateTransition(Duration.seconds(0.2),vin1);
        TranslateTransition v2 = new TranslateTransition(Duration.seconds(0.2),vin2);
        TranslateTransition v3 = new TranslateTransition(Duration.seconds(0.2),vin3);
        v0.setByX(1200);
        v1.setByX(1200);
        v2.setByX(1200);
        v3.setByX(1200);
        v0.play();
        v1.play();
        v2.play();
        v3.play();

        v0.setOnFinished(event ->{
            TranslateTransition tusa0 = new TranslateTransition(Duration.seconds(3),vin0);
            tusa0.setByX(-1200);
            tusa0.play();

        });
        v1.setOnFinished(event ->{
            TranslateTransition tusa1 = new TranslateTransition(Duration.seconds(3),vin1);
            tusa1.setByX(-1200);
            tusa1.play();

        });
        v2.setOnFinished(event ->{
            TranslateTransition tusa2 = new TranslateTransition(Duration.seconds(3),vin2);
            tusa2.setByX(-1200);
            tusa2.play();

        });
        v3.setOnFinished(event ->{
            TranslateTransition tusa3 = new TranslateTransition(Duration.seconds(3),vin3);
            tusa3.setByX(-1200);
            tusa3.play();

        });
        // Animation6
        TranslateTransition va0 = new TranslateTransition(Duration.seconds(0.2),vais0);
        TranslateTransition va1 = new TranslateTransition(Duration.seconds(0.2),vais1);
        TranslateTransition va2 = new TranslateTransition(Duration.seconds(0.2),vais2);
        TranslateTransition va3 = new TranslateTransition(Duration.seconds(0.2),vais3);
        va0.setByX(1200);
        va1.setByX(1200);
        va2.setByX(1200);
        va3.setByX(1200);
        va0.play();
        va1.play();
        va2.play();
        va3.play();

        va0.setOnFinished(event ->{
            TranslateTransition tusa0 = new TranslateTransition(Duration.seconds(3.2),vais0);
            tusa0.setByX(-1200);
            tusa0.play();

        });
        va1.setOnFinished(event ->{
            TranslateTransition tusa1 = new TranslateTransition(Duration.seconds(3.2),vais1);
            tusa1.setByX(-1200);
            tusa1.play();

        });
        va2.setOnFinished(event ->{
            TranslateTransition tusa2 = new TranslateTransition(Duration.seconds(3.2),vais2);
            tusa2.setByX(-1200);
            tusa2.play();

        });
        va3.setOnFinished(event ->{
            TranslateTransition tusa3 = new TranslateTransition(Duration.seconds(3.2),vais3);
            tusa3.setByX(-1200);
            tusa3.play();

        });

    }

    @FXML
    private void exitApp(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void logOut(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        loadStage("/fxml/FXMLSignIn.fxml");
     //   FXMLHomeController hcn = new FXMLHomeController();
     //   hcn.homeset(true);
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
