/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3technology.view;

import com.j3technology.application.main;
import com.jfoenix.controls.JFXRippler;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author Admin-J3
 */
public class SplashController implements Initializable {
      @FXML
    private AnchorPane title_bar;
    @FXML
    private AnchorPane anchor;
    @FXML
    private MediaView loadingMedia;
private final String LOADING_SCREEN_PATH = getClass().getResource("/com/j3technology/view/loading_screen.mp4").toString();
    /**
     * Initializes the controller class.
     */

public static double screenWidth,screenHeight;
    static
    {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            screenWidth = dim.getWidth();
            screenHeight = dim.getHeight()-20;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        splash();
    }    
     public  void splash()
     {
        new SplashScreenService().start();
        Media media = new Media(LOADING_SCREEN_PATH);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        loadingMedia.setMediaPlayer(mediaPlayer);
        loadingMedia.setSmooth(true);
        loadingMedia.setPreserveRatio(true);

        JFXRippler rippler = new JFXRippler(loadingMedia);
        rippler.setRipplerFill(Paint.valueOf("#404040"));
        anchor.getChildren().add(rippler);
        mediaPlayer.play();
     }
     
     class SplashScreenService extends Thread {
         private double xOffset = 0; 
        private double yOffset = 0;
        @Override
        public void run() {

            // Processing on the main ui Thread :
            try {

                Thread.sleep(10_500); // Should be 10_500 milliseconds.
                Platform.runLater(
                        () -> {
                    try {
                        Stage mainStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("/com/j3technology/view/Masters/Dashboard.fxml"));
                        root.setOnMousePressed(new EventHandler<MouseEvent>() {
                        @Override
                          public void handle(MouseEvent event) {
                         xOffset = event.getSceneX();
                         yOffset = event.getSceneY();
                     }
                        });
                         root.setOnMouseDragged(new EventHandler<MouseEvent>() {
                       @Override
                        public void handle(MouseEvent event) {
                            mainStage.setX(event.getScreenX() - xOffset);
                            mainStage.setY(event.getScreenY() - yOffset);
                        }
                    });
                        mainStage.setTitle("Main Layout");
                        mainStage.initStyle(StageStyle.UNDECORATED);
                        Scene scene = new Scene(root,screenWidth,screenHeight);
                        scene.getStylesheets().add(main.class.getResource("/theme/application.css").toExternalForm());
                        mainStage.setScene(scene);
                        mainStage.show();
                        anchor.getScene().getWindow().hide();
                    } catch (IOException ex) {
                        Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
                    }
            });

            } catch (InterruptedException ie) {

                System.out.println("[X] Exception while loading the Main Layout Screen.");
                System.out.println(ie.getMessage());
                ie.printStackTrace();
            }
        }
    }
     
     
     
      
          
}
