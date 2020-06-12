/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class FXMLCrimeController implements Initializable {

    @FXML
    private Button btn;
    public static AnchorPane fxmlCias;
    @FXML
    private Button burglary;
    @FXML
    private Button Murder;
    @FXML
    private Button Extortion;
    @FXML
    private Button terrorism;
    @FXML
    private Button MoneyL;
    @FXML
    private Button Abduction;
    @FXML
    private Button BlackM;
    @FXML
    private Button Dowry;
    @FXML
    private Button Corruption;
    @FXML
    private Button ArmT;
    @FXML
    private Button Cyberc;
    @FXML
    private Button drugs;
    @FXML
    private Button childP;
    @FXML
    private Button humanT;
    @FXML
    private Button forcedM;
    @FXML
    private Button Stalking;
    @FXML
    private Button Acid;
    @FXML
    private Button Rape;
    @FXML
    private Button ragging;
    @FXML
    private JFXTextField searchCr;

    public static final String SONG = "C:\\IntelliJProject\\CIAS\\src\\audio\\email scam eng.mp3";
    public static final String SONG1 = "C:\\IntelliJProject\\CIAS\\src\\audio\\email scam hin.mp3";

    public static final String SONG2 = "C:\\IntelliJProject\\CIAS\\src\\audio\\identity theft eng.mp3";
    public static final String SONG3 = "C:\\IntelliJProject\\CIAS\\src\\audio\\identity theft hin.mp3";

    public static final String SONG4 = "C:\\IntelliJProject\\CIAS\\src\\audio\\Obscene content eng.mp3";
    public static final String SONG5 = "C:\\IntelliJProject\\CIAS\\src\\audio\\Obscene content hin.mp3";

    public static final String SONG6 = "C:\\IntelliJProject\\CIAS\\src\\audio\\cyber bullying eng.mp3";
    public static final String SONG7 = "C:\\IntelliJProject\\CIAS\\src\\audio\\cyber bullying hin.mp3";

    String bip = SONG;
    Media hit = new Media(new File(bip).toURI().toString());
    MediaPlayer player = new MediaPlayer(hit);
    
    String bip1 = SONG1;
    Media hit1 = new Media(new File(bip1).toURI().toString());
    MediaPlayer player1 = new MediaPlayer(hit1);
    
    String bip2 = SONG2;
    Media hit2 = new Media(new File(bip2).toURI().toString());
    MediaPlayer player2 = new MediaPlayer(hit2);
    
    String bip3 = SONG3;
    Media hit3 = new Media(new File(bip3).toURI().toString());
    MediaPlayer player3 = new MediaPlayer(hit3);
    
    String bip4 = SONG4;
    Media hit4 = new Media(new File(bip4).toURI().toString());
    MediaPlayer player4 = new MediaPlayer(hit4);
    
    String bip5 = SONG5;
    Media hit5 = new Media(new File(bip5).toURI().toString());
    MediaPlayer player5 = new MediaPlayer(hit5);
    
    String bip6 = SONG6;
    Media hit6 = new Media(new File(bip6).toURI().toString());
    MediaPlayer player6 = new MediaPlayer(hit6);
    
    String bip7 = SONG7;
    Media hit7 = new Media(new File(bip7).toURI().toString());
    MediaPlayer player7 = new MediaPlayer(hit7);
    
   

    @FXML
    private JFXButton p1;
    @FXML
    private JFXButton p2;
    @FXML
    private JFXButton p3;
    @FXML
    private JFXButton ph1;
    @FXML
    private JFXButton ph2;
    @FXML
    private JFXButton ph3;
    @FXML
    private JFXButton a1;
    @FXML
    private JFXButton a2;
    @FXML
    private JFXButton a3;
    @FXML
    private JFXButton ah1;
    @FXML
    private JFXButton ah2;
    @FXML
    private JFXButton ah3;
    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton b2;
    @FXML
    private JFXButton b3;
    @FXML
    private JFXButton bh1;
    @FXML
    private JFXButton bh2;
    @FXML
    private JFXButton bh3;
    @FXML
    private JFXButton c1;
    @FXML
    private JFXButton c2;
    @FXML
    private JFXButton c3;
    @FXML
    private JFXButton ch1;
    @FXML
    private JFXButton ch2;
    @FXML
    private JFXButton ch3;

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        p2.setDisable(true);
        ph2.setDisable(true);

        a2.setDisable(true);
        ah2.setDisable(true);

        b2.setDisable(true);
        bh2.setDisable(true);

        c2.setDisable(true);
        ch2.setDisable(true);


    }

    @FXML
    private void openBtn(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(1);
        loadStage("/fxml/temp.fxml");
    }
    public void setPane(AnchorPane p)
    {
        fxmlCias = p;
    }
    public AnchorPane getPane()
    {
        return(fxmlCias);
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
    private void openburglary(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(2);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openMurder(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(6);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openExtortion(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(7);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openterrorism(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(3);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openMoneyL(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(8);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openAbduction(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(4);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openBlackM(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(9);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openDowry(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(5);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openCorruption(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(10);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openArmT(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(11);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openCyberc(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(12);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void opendrugs(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(13);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openchildP(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(16);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openhumanT(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(17);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openforcedM(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(18);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openStalking(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(14);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openacid(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(19);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openRape(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(15);
        loadStage("/fxml/temp.fxml");
    }

    @FXML
    private void openRagging(ActionEvent event) {
        BoxBlur blurr = new BoxBlur(5,5,5);
        fxmlCias.setEffect(blurr);
        TempController c = new TempController();
        c.saja(20);
        loadStage("/fxml/temp.fxml");
    }

    private void searchCrime(ActionEvent event) {
        if(searchCr.getText().compareToIgnoreCase("rape")==1)
        {
            System.out.println("juhudsu");
        }
    }

    @FXML
    private int searchCrime(KeyEvent event) {


        if(event.getCode().equals(KeyCode.ENTER))
        {


            if(searchCr.getText().compareToIgnoreCase("assault")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(1);
                loadStage("/fxml/temp.fxml");
                return(0);
            }
            if(searchCr.getText().compareToIgnoreCase("robbery")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(2);
                loadStage("/fxml/temp.fxml");
                return(0);

            }
            if(searchCr.getText().compareToIgnoreCase("terrorism")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(3);
                loadStage("/fxml/temp.fxml");
                return(0);
            }
            if(searchCr.getText().compareToIgnoreCase("abduction")==1 || searchCr.getText().compareToIgnoreCase("kidnapping")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(4);
                loadStage("/fxml/temp.fxml");
                return(0);

            }
            if(searchCr.getText().compareToIgnoreCase("dowry")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(5);
                loadStage("/fxml/temp.fxml");
                return(0);

            }
            if(searchCr.getText().compareToIgnoreCase("murder")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(6);
                loadStage("/fxml/temp.fxml");
                return(0);

            }

            if(searchCr.getText().compareToIgnoreCase("money laundering")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(8);
                loadStage("/fxml/temp.fxml");
                return(0);

            }
            if(searchCr.getText().compareToIgnoreCase("black marketing")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(9);
                loadStage("/fxml/temp.fxml");
                return(0);

            }
            if(searchCr.getText().compareToIgnoreCase("corruption")==1)
            {
                BoxBlur blurr = new BoxBlur(5,5,5);
                fxmlCias.setEffect(blurr);
                TempController c = new TempController();
                c.saja(10);
                loadStage("/fxml/temp.fxml");
                return(0);

            }

        }
        return(0);
    }

    @FXML
    private void play(ActionEvent event) {
        player.play();
        p1.setDisable(true);
        p2.setDisable(false);

    }

    @FXML
    private void pause(ActionEvent event) {
        player.pause();
        p2.setDisable(true);
        p1.setDisable(false);
    }

    @FXML
    private void stop(ActionEvent event) {
        player.stop();
        p1.setDisable(false);
        p2.setDisable(true);

    }

    @FXML
    private void playh(ActionEvent event) {
        player1.play();
        ph1.setDisable(true);
        ph2.setDisable(false);
    }
    @FXML
    private void pauseh(ActionEvent event) {
        player1.pause();
        ph2.setDisable(true);
        ph1.setDisable(false);
    }

    @FXML
    private void stoph(ActionEvent event) {
        player1.stop();
        ph1.setDisable(false);
        ph2.setDisable(true);

    }

    @FXML
    private void aplay(ActionEvent event) {
        player2.play();
        a1.setDisable(true);
        a2.setDisable(false);
    }

    @FXML
    private void apause(ActionEvent event) {
        player2.pause();
        a2.setDisable(true);
        a1.setDisable(false);
    }

    @FXML
    private void astop(ActionEvent event) {
        player2.stop();
        a1.setDisable(false);
        a2.setDisable(true);
    }

    @FXML
    private void aplayh(ActionEvent event) {
        player3.play();
        ah1.setDisable(true);
        ah2.setDisable(false);
    }

    @FXML
    private void apauseh(ActionEvent event) {
        player3.pause();
        ah2.setDisable(true);
        ah1.setDisable(false);
    }

    @FXML
    private void astoph(ActionEvent event) {
        player3.stop();
        ah1.setDisable(false);
        ah2.setDisable(true);
    }

    @FXML
    private void bplay(ActionEvent event) {
        player4.play();
        b1.setDisable(true);
        b2.setDisable(false);
    }

    @FXML
    private void bpause(ActionEvent event) {
        player4.pause();
        b2.setDisable(true);
        b1.setDisable(false);
    }

    @FXML
    private void bstop(ActionEvent event) {
        player4.stop();
        b1.setDisable(false);
        b2.setDisable(true);
    }

    @FXML
    private void bplayh(ActionEvent event) {
        player5.play();
        bh1.setDisable(true);
        bh2.setDisable(false);
    }

    @FXML
    private void bpauseh(ActionEvent event) {
        player5.pause();
        bh2.setDisable(true);
        bh1.setDisable(false);
    }

    @FXML
    private void bstoph(ActionEvent event) {
        player5.stop();
        bh1.setDisable(false);
        bh2.setDisable(true);
    }

    @FXML
    private void cplay(ActionEvent event) {
        player6.play();
        c1.setDisable(true);
        c2.setDisable(false);

    }

    @FXML
    private void cpause(ActionEvent event) {
        player6.pause();
        c2.setDisable(true);
        c1.setDisable(false);
    }

    @FXML
    private void cstop(ActionEvent event) {
        player6.stop();
        c1.setDisable(false);
        c2.setDisable(true);
    }

    @FXML
    private void cplayh(ActionEvent event) {
        player7.play();
        ch1.setDisable(true);
        ch2.setDisable(false);
    }

    @FXML
    private void cpauseh(ActionEvent event) {
        player7.pause();
        ch2.setDisable(true);
        ch1.setDisable(false);
    }

    @FXML
    private void cstoph(ActionEvent event) {
        player7.stop();
        ch1.setDisable(false);
        ch2.setDisable(true);
    }
}
