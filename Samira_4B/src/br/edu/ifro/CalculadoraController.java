package br.edu.ifro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author 00218927258
 */
public class CalculadoraController implements Initializable {

    @FXML
    private JFXTextField resul;
    @FXML
    private JFXTextField n2;
    @FXML
    private JFXTextField n1;
    @FXML
    private JFXButton btnSoma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Soma(ActionEvent event) {
        Double num1= Double.parseDouble(n1.getText()),
               num2= Double.parseDouble(n2.getText());
        Double res= num1+num2;
        
        resul.setText(res.toString());
        
    }
    
}
