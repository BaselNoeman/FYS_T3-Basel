/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fys;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class SubmitController {
   
     @FXML
    public void openSubmitActionSub(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Submit.fxml"));
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
    
     @FXML
    public void openSubmit2(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Submit.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/openSubmit2.fxml"));
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
   
        @FXML
    public void openSubmit3(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Submit3.fxml"));
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
            @FXML
    public void openSubmit4(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Submit4.fxml"));
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
    
    
    @FXML
    public void openSubmitPopUp(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/submitPopUp.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();
    }   
    
      
    @FXML
    public void openHelpSub(ActionEvent event) throws IOException {
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
    

    @FXML
    public void closeHelpSub(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

   @FXML
    public void openHomeSub(ActionEvent event) throws IOException {
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
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });}
    
}

