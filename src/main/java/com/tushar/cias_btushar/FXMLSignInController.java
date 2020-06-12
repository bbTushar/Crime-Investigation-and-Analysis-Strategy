
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FXMLSignInController implements Initializable {
    private Parent fxml;

    Media media = new Media(getClass().getResource("/videos/CIAS3.mp4").toExternalForm());

    MediaPlayer player = new MediaPlayer(media);

    @FXML
    private MediaView mediaView;
    @FXML
    private VBox vbox;
    @FXML
    private JFXButton skip;
    @FXML
    private JFXButton close;
    @FXML
    private JFXButton btnOpenReg;
    @FXML
    private JFXButton btnSignIn;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXPasswordField pwd;
    @FXML
    private Label wrong;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        mediaView.setMediaPlayer(player);
        player.setVolume(10);
        player.play();
       
        wrong.setVisible(false);
        loadStage("/fxml/FXMLRegistration.fxml");
        player.setOnEndOfMedia(() -> {
            player.stop();
            try {
                fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLAfterVideo.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    @FXML
    private void skipLogin(MouseEvent event) {
        player.stop();
        try {
            fxml = FXMLLoader.load(getClass().getResource("/fxml/FXMLAfterVideo.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        }catch (IOException ex) {
            Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void openRegistration(ActionEvent event) {
        player.stop();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
         
    }

    @FXML
    private void crossClose(ActionEvent event) {

        loadStage("/fxml/Climax.fxml");
        ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
        player.stop();
       
    }

    @FXML
    private void signIn(ActionEvent event) throws SQLException {

        Connection con = DbConnection.Connection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        wrong.setVisible(false);
        ps = con.prepareStatement("SELECT * FROM login WHERE id = ? and pwd = ?");
        ps.setString(1, id.getText());
        ps.setString(2, pwd.getText());
        rs = ps.executeQuery();
        if(rs.next())
        {

            loadStage("/fxml/Loading.fxml");
            player.stop();
            stage.show();
            ps.close();
            rs.close();
            ((Node)(event.getSource())).getScene().getWindow().hide();

        }
        else
        {
            wrong.setVisible(true);
        }


    }

    private void loadStage(String fxml) {
        try {
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource(fxml));
            if( fxml.equalsIgnoreCase("/fxml/Loading.fxml"))
            {
                stage = new Stage();
                stage.setScene(new Scene(root));
                stage.initStyle(StageStyle.TRANSPARENT);
            }
            else
            {
                stage2 = new Stage();
                stage2.setScene(new Scene(root));
                stage2.initStyle(StageStyle.TRANSPARENT);
            }
           
        } catch (IOException var4) {
            System.out.println("load stage SignINController");
        }

    }
    Stage stage,stage2;

}
