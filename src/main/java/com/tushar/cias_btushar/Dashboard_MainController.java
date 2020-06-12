/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tushar.cias_btushar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Tushar
 */
public class Dashboard_MainController implements Initializable {

    @FXML
    private WebView webView;
    private WebEngine engine;
    @FXML
    private WebView webView1;
    @FXML
    private WebView webView2;
    @FXML
    private WebView webView3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        engine = webView.getEngine();
        engine.load(getClass().getResource("/javascript/Bar Chart Race.html").toExternalForm());
        engine = webView1.getEngine();
        engine.load(getClass().getResource("/javascript/Variable Radius Pie chart.html").toExternalForm());
        engine = webView2.getEngine();
        engine.load(getClass().getResource("/javascript/live.html").toExternalForm());
        engine = webView3.getEngine();
        engine.load(getClass().getResource("/javascript/violent crime.html").toExternalForm());
    }

}
