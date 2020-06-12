/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class FXMLWomenSafetyController implements Initializable {

    @FXML
    private MediaView mediaView;
    Media media = new Media(getClass().getResource("/videos/defence.mp4").toExternalForm());
    MediaPlayer player = new MediaPlayer(media);
    @FXML
    private JFXButton playB;
    @FXML
    private JFXButton pauseB;
    @FXML
    private JFXButton stopB;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mediaView.setMediaPlayer(player);
        player.setVolume(100);
        player.play();
        playB.setDisable(true);
    }

    @FXML
    private void openIt(MouseEvent event) {
        try {

            String url = "https://www.amazon.com/Desert-Eagle-Spring-Powered-Airsoft/dp/B07BYL6LC8/ref=lp_3395191_1_1/134-5462305-0311834?s=paintball&ie=UTF8&qid=1583162683&sr=1-1";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));


        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void play(ActionEvent event) {
        player.play();
        playB.setDisable(true);
    }

    @FXML
    private void pause(ActionEvent event) {
        player.pause();
        playB.setDisable(false);
    }

    @FXML
    private void stop(ActionEvent event) {
        player.stop();
        playB.setDisable(false);
    }

    @FXML
    private void openDefence(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("http://www.healthline.com/health/womens-health/self-defense-tips-escape#8-moves-to-try"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open2(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Newish-NW-5070-P-Powerful-Pepper-Defence/dp/B07G5WRD52/ref=sr_1_4_sspa?crid=2XWLG2V2EG6XN&keywords=pepper+spray+self+defence+for+women+pocket&qid=1583162816&sprefix=pepper+s%2Caps%2C359&sr=8-4-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyMFM4OUFFVDFLRkMwJmVuY3J5cHRlZElkPUEwNzM2Mjc4MUJJRkEyNkdKOTUzUCZlbmNyeXB0ZWRBZElkPUEwNjIxNjA0MTdIODlHTDlDMFpJUCZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open3(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Katcase-Electric-Shock-Laser-Keychain/dp/B06XK8H2RZ/ref=sr_1_3?crid=SMUCVS0MG6Y9&keywords=lipsticks+gun&qid=1583221047&sprefix=lipsticks+gun%2Caps%2C344&sr=8-3"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open4(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Aryshaa-Anti-Rape-Keychain-Personal-Security/dp/B07VT3PDT8/ref=sr_1_12?crid=USQ2GXX3I8HR&keywords=personal+alarm+keychain+for+women&qid=1583221149&sprefix=personal+al%2Caps%2C559&sr=8-12"));

        } catch (IOException | URISyntaxException e1) {
        }
    }

    @FXML
    private void open5(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/DIY-Crafts-Cutting-Interchangeble-India/dp/B077G4DDPL/ref=sr_1_26?crid=2G298BHAL2UC3&keywords=hidden+knife+for+safety&qid=1583221215&sprefix=hidden+knife+%2Caps%2C342&sr=8-26"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }
    @FXML
    private void open6(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.flipkart.com/cbsp-self-defense-keychain-black-dog-locking-key-chain/p/itmfa8akf9hzndzc?pid=CBRFA82G7ZCPZJHH&lid=LSTCBRFA82G7ZCPZJHHF6OZYC&marketplace=FLIPKART&cmpid=content_carabiner_4579465931567248_F116BPYB_bmc_pla&ef_id=:G:s&s_kwcid=AL!739!3!!e!!o!4579465931567248!"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open7(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI(""));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open8(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Aseem-Stopper-Stackable-Slip-Resistant-Laminated/dp/B07MZLVJYY/ref=sr_1_4_sspa?keywords=door+stoppers&qid=1583221536&sr=8-4-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFMWkpPWTBRUkUyVlcmZW5jcnlwdGVkSWQ9QTA5NzU1NDIzM1pYOE9OSUtKQkZSJmVuY3J5cHRlZEFkSWQ9QTA3NzExMDIzMlZJWVdYMEcwTE8md2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open9(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/MAMTA-Green-Black-Swiss-Knive/dp/B07VVD2BS4/ref=sr_1_2?crid=VTAEEOFJI0ZV&dchild=1&keywords=tactical+knife&qid=1583221764&sprefix=tactica%2Caps%2C510&sr=8-2"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open10(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://goguarded.com/product/medium-go-guarded-ring-5-9-magenta/"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open11(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Stanley-Classic-Retractable-Utility-Heavy-Duty/dp/B00ICIKF3E/ref=sr_1_1?crid=110ZPW2ZVHG45&keywords=retractable+baton&qid=1583221900&sprefix=retractable+bat%2Caps%2C466&sr=8-1"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open12(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/BlackShark%C2%AE-Flashlight-Adjustable-Self-Defense-Resistant/dp/B00SGMLJUO/ref=sr_1_1?crid=1APUPSPF5BA41&keywords=self+defense+flashlight&qid=1583221954&sprefix=self+defence+flas%2Caps%2C346&sr=8-1"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }



    @FXML
    private void open13(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/HitTime-Tactical-Survival-Aviation-Aluminum/dp/B07DX23TMV/ref=sr_1_1?crid=27XO8Z3HYU7OG&dchild=1&keywords=tactical+pen+for+self+defense&qid=1583221983&sprefix=tactical+pen%2Caps%2C323&sr=8-1"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open15(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://binge.co/what-are-the-best-panic-button-and-personal-safety-apps"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    private void open14(MouseEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.in/Newish-Powerful-Chilli-Spray-Defence/dp/B07NJ6L7XX/ref=sr_1_3?crid=3EQG33NV7J7BX&keywords=pepper+gel&qid=1583222006&sprefix=pepper+ge%2Caps%2C314&sr=8-3"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }
    @FXML
    void openEmer(ActionEvent event) {
        try {

            Desktop.getDesktop().browse(new URI("https://www.indiatoday.in/information/story/list-of-emergency-numbers-in-india-1464566-2019-02-26"));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }


}
