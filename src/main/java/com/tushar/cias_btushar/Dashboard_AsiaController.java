package com.tushar.cias_btushar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Dashboard_AsiaController implements Initializable {

    @FXML
    private WebView webView;

    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = webView.getEngine();

        engine.load(getClass().getResource("/javascript/Projection View.html").toExternalForm());

    }

}
