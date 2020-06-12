/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXToggleButton;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class WomenReportController implements Initializable {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    @FXML
    private JFXComboBox<String> selectComplaint ;
    @FXML
    private JFXButton browse;
    private File file;
    private File file2;
    private FileInputStream fis,fis2 ;
    int cp,cp2;
    private Parent fxml;
    @FXML
    private JFXComboBox<String> selectRelation;
    @FXML
    private JFXToggleButton toggle;
    @FXML
    private Pane suspectPane;
    @FXML
    private JFXComboBox<String> suspectCombo;
    @FXML
    private JFXButton browse2;
    @FXML
    private JFXTextField pho;
    @FXML
    private JFXCheckBox checkBox;
    @FXML
    private JFXButton submit;
    @FXML
    private DatePicker date;
    @FXML
    private JFXTimePicker time;
    @FXML
    private JFXTextField reason;
    @FXML
    private JFXTextField state;
    @FXML
    private JFXTextField district;
    @FXML
    private JFXTextField city;
    @FXML
    private JFXTextField station;
    @FXML
    private TextArea incidentInfo;
    @FXML
    private JFXTextField suspectFN;
    @FXML
    private JFXTextField suspectLN;
    @FXML
    private JFXTextField victimFN;
    @FXML
    private JFXTextField victimLN;
    @FXML
    private Label problem;
    @FXML
    private Label problem1;
    @FXML
    private Label success;
    @FXML
    private AnchorPane acpane;
    @FXML
    private  String name;
    @FXML
    private  String cato;
    @FXML
    private String cCity;
    @FXML
    private String cDistrict;
    @FXML
    private String cState;
    @FXML
    private String cStation;
    @FXML
    private  String cDate;
    @FXML
    private  String cTime;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        selectComplaint.getItems().add("Child Pornography(CP)-Child Sexual Abuse Material(CSAM)");
        selectComplaint.getItems().add("Rape/Gang Rape(RGR) - Sexually abuse content(SAC)");
        selectComplaint.getItems().add("Publishing or Transmitting Sexually Obsence Material in electronic form");
        selectComplaint.getItems().add("Harrasmental Case-HC(Either Online or In person)");
        selectComplaint.getItems().add("Murder Case or Any Case related to Voilence in any form");
        selectComplaint.getItems().add("Dowry Case or Any Blackmailing asking for money before/after marriage");
        selectComplaint.getItems().add("Fraud Case or Any Blackmailing asking for money before/after certain task");
        selectComplaint.getItems().add("Corruption Case or Any case which involves brime or other type of frauds");
        selectComplaint.getItems().add("Other ( Select only if rest of the crime category doesn't match your case");

        selectRelation.getItems().add("Mother");
        selectRelation.getItems().add("Father");
        selectRelation.getItems().add("Brother");
        selectRelation.getItems().add("Sister");
        selectRelation.getItems().add("Cousin");
        selectRelation.getItems().add("Friend");
        selectRelation.getItems().add("I am Victim");
        selectRelation.getItems().add("other");

        suspectCombo.getItems().add("Bank AC Number");
        suspectCombo.getItems().add("Phone Number");
        suspectCombo.getItems().add("DL Number");
        suspectCombo.getItems().add("Email");
        suspectCombo.getItems().add("Other");

        suspectPane.setVisible(false);
        pho.setVisible(false);
        submit.setStyle("-fx-background-color: #30303d");

        problem.setVisible(false);
        problem1.setVisible(false);

    }

    @FXML
    private void choosePicture(ActionEvent event) throws FileNotFoundException {
        FileChooser fc = new FileChooser();
        file = fc.showOpenDialog(null);
        if (file != null) {
            Image image = new Image(file.toURI().toString());

            cp = 1;
            fis = new FileInputStream(file);
            browse.setStyle("-fx-background-color: #008000");
            browse.setText("Uploaded Successfully!");
            browse.isUnderline();
        } else {
            cp = 0;
        }
    }
    @FXML
    private void choosePicture2(ActionEvent event) throws FileNotFoundException {
        FileChooser fc = new FileChooser();
        file2 = fc.showOpenDialog(null);
        if (file2 != null) {
            Image image = new Image(file2.toURI().toString());

            cp2 = 1;
            fis2 = new FileInputStream(file2);
            browse2.setStyle("-fx-background-color: #008000");
            browse2.setText("Uploaded Successfully!");
            browse2.isUnderline();
        } else {
            cp2 = 0;
        }
    }

    @FXML
    private void toogleAction(ActionEvent event) {
        if(toggle.isSelected())
        {
            suspectPane.setVisible(true);
        }
        else{
            suspectPane.setVisible(false);
        }
    }

    @FXML
    private void susPhone(ActionEvent event) {
        if(suspectCombo.getItems().isEmpty())
        {

        }
        else{
            pho.setVisible(true);
        }
    }

    @FXML
    private void checkAction(ActionEvent event) {
        if(checkBox.isSelected())
        {
            submit.setDisable(false);
            submit.setStyle(" -fx-background-color: #00b300");
        }
        else
        {
            submit.setDisable(true);
            submit.setStyle("-fx-background-color: #30303d");
        }

    }

    @FXML
    private void submit(ActionEvent event) throws SQLException, FileNotFoundException {
        if( (selectComplaint.getValue() == null) || ( date.getValue() == null )||(time.getValue() == null)||(state.getText().isEmpty()) || (district.getText().isEmpty())|| ( city.getText().isEmpty()) || (station.getText().isEmpty())|| (cp==0) || (victimFN.getText().isEmpty()) || ( victimLN.getText().isEmpty()) || (selectRelation.getValue() == null) )
        {
            success.setVisible(false);
            problem.setVisible(true);
            if(toggle.isSelected())
            {
                if(suspectFN.getText() == null && suspectLN.getText() == null && pho.getText() == null && cp2 == 0 )
                {
                    problem1.setVisible(true);
                }
            }
        }else
        {
            success.setVisible(false);
            problem.setVisible(false);
            if(toggle.isSelected())
            {
                if(suspectFN.getText() == null && suspectLN.getText() == null && pho.getText() == null && cp2 == 0)
                {
                    problem1.setVisible(true);
                }
                else
                {
                    problem1.setVisible(false);
                    if( cp2 == 1)
                    {
                        //Database Input with suspect Image

                        conn = DbConnection.Connection();
                        String sql = "insert into complaint (category,date,time,reason,state,district,city,station,evidence,victimFN,victimLN,relation,incident,suspectFN,suspectLN,suspectID,suspectIDvalue,suspectPhoto) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);
                        pst.setString(1,(String)selectComplaint.getValue());
                        pst.setString(2,date.getValue().toString());
                        pst.setString(3,time.getValue().toString());
                        pst.setString(4,reason.getText());
                        pst.setString(5,state.getText() );
                        pst.setString(6,district.getText() );
                        pst.setString(7,city.getText() );
                        pst.setString(8,station.getText() );
                        //Image input
                        pst.setBinaryStream(9,  fis, (int) file.length());
                        pst.setString(10,victimFN.getText());
                        pst.setString(11,victimLN.getText());
                        pst.setString(12,(String)selectRelation.getValue());
                        pst.setString(13,incidentInfo.getText());
                        pst.setString(14,suspectFN.getText());
                        pst.setString(15,suspectLN.getText());
                        pst.setString(16,(String)suspectCombo.getValue());
                        pst.setString(17,pho.getText());
                        //Image input
                        pst.setBinaryStream(18,  fis2, (int) file2.length());


                        int i = pst.executeUpdate();
                        if(i>0)
                        {

                            try {
                                fxml = FXMLLoader.load(getClass().getResource("/fxml/confirmComplaint.fxml"));

                                acpane.getChildren().removeAll();
                                acpane.getChildren().setAll(fxml);
                            } catch (IOException ex) {
                                Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
                            }finally{
                                try {
                                    rs.close();
                                    pst.close();
                                }catch (Exception e){

                                }
                            }

                        }else{}
                    }
                    else
                    {
                        problem1.setVisible(false);
                        //Database Input with No Suspect Image

                        conn = DbConnection.Connection();
                        String sql = "insert into complaint (category,date,time,reason,state,district,city,station,evidence,victimFN,victimLN,relation,incident,suspectFN,suspectLN,suspectID,suspectIDvalue) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);
                        pst.setString(1,(String)selectComplaint.getValue());
                        pst.setString(2,date.getValue().toString());
                        pst.setString(3,time.getValue().toString());
                        pst.setString(4,reason.getText());
                        pst.setString(5,state.getText() );
                        pst.setString(6,district.getText() );
                        pst.setString(7,city.getText() );
                        pst.setString(8,station.getText() );
                        //Image input
                        pst.setBinaryStream(9,  fis, (int) file.length());
                        pst.setString(10,victimFN.getText());
                        pst.setString(11,victimLN.getText());
                        pst.setString(12,(String)selectRelation.getValue());
                        pst.setString(13,incidentInfo.getText());
                        pst.setString(14,suspectFN.getText());
                        pst.setString(15,suspectLN.getText());
                        pst.setString(16,(String)suspectCombo.getValue());
                        pst.setString(17,pho.getText());

                        int i = pst.executeUpdate();
                        if(i>0)
                        {

                            try {
                                fxml = FXMLLoader.load(getClass().getResource("/fxml/confirmComplaint.fxml"));

                                acpane.getChildren().removeAll();
                                acpane.getChildren().setAll(fxml);
                            } catch (IOException ex) {
                                Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
                            }finally{
                                try {
                                    rs.close();
                                    pst.close();
                                } catch (Exception e) {
                                }

                            }
                        }
                    }
                }
            }
            else
            {
                //Database Input NO Suspect
                problem.setVisible(false);
                conn = DbConnection.Connection();
                String sql = "insert into complaint (category,date,time,reason,state,district,city,station,evidence,victimFN,victimLN,relation,incident) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1,(String)selectComplaint.getValue());
                pst.setString(2,date.getValue().toString());
                pst.setString(3,time.getValue().toString());
                pst.setString(4,reason.getText());
                pst.setString(5,state.getText() );
                pst.setString(6,district.getText() );
                pst.setString(7,city.getText() );
                pst.setString(8,station.getText() );
                //Image input
                pst.setBinaryStream(9,  fis, (int) file.length());
                pst.setString(10,victimFN.getText());
                pst.setString(11,victimLN.getText());
                pst.setString(12,(String)selectRelation.getValue());
                pst.setString(13,incidentInfo.getText());
                // cato,cCity,cDistrict,cState,cStation,cDate,cTime
                name = victimFN.getText()+" "+victimLN.getText();
                cato = ((String)selectComplaint.getValue());
                cCity = (city.getText());
                cDistrict = (district.getText());
                cState = (state.getText());
                cStation = (station.getText());
                cDate = (date.getValue().toString());
                cTime = (time.getValue().toString());
               

                int i = pst.executeUpdate();
                if(i>0)
                {

                    try {

                        fxml = FXMLLoader.load(getClass().getResource("/fxml/confirmComplaint.fxml"));

                        acpane.getChildren().removeAll();
                        acpane.getChildren().setAll(fxml);

                    } catch (IOException ex) {
                        Logger.getLogger(FXMLCiasController.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        try {
                            rs.close();
                            pst.close();
                        } catch (Exception e) {

                        }

                    }
                }
            }

        }
    }

}
