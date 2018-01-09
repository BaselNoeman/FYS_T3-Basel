/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fys;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
/**
 *
 * @author Kevin
 */
public class SearchLugContoller {

    
    @FXML
    private TextField FlightInput; 
    @FXML
    private TextField FlightAInput;
    @FXML
    private TextField ColorInput;
    @FXML
    private TextField SizeInput;
    @FXML
    private TextField BrandInput;
    
    @FXML
    public void openSearchLug(ActionEvent event) throws IOException
    {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/SearchLug.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode() + " Made by ShaMaster");
                    stage.setScene(hScene);
                }
            }
        });
    }
    
    @FXML
    public void openHome(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode() + " Made by ShaMaster");
                    stage.setScene(hScene);
                }
            }
        });
    }
    
     @FXML
    public void openHelp(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/helpPopup.fxml"));
        final Scene scene = new Scene(root);
        final Stage stage = new Stage();
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.close();
                }
            }
        });
    }
   
    public void openResult2(ActionEvent event) throws IOException {
         
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/SearchLug.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ResultsSearchLug.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }
    
}
