/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3technology.controller;

import com.j3technology.application.main;
import com.j3technology.helpers.Route;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Admin-J3
 */
public class DashboardController implements Initializable {
    @FXML
    private AnchorPane anchor1;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private JFXHamburger hamburger;
    @FXML
    private AnchorPane icon_pane;
    @FXML
    private AnchorPane center;
    @FXML
    private Label three;
    @FXML
    private JFXButton accountGroup_btn;

    @FXML
    private JFXButton accountMaster_btn;

    @FXML
    private JFXButton companyMaster_btn;

    @FXML
    private JFXButton doctorMaster_btn;

    @FXML
    private JFXButton genericMaster_btn;

    @FXML
    private JFXButton gstMaster_btn;

    @FXML
    private JFXButton patientMaster_btn;

    @FXML
    private JFXButton salesmanMaster_btn;

    @FXML
    private JFXButton itemEntry_btn;

    @FXML
    private JFXButton stockEntry_btn;

    @FXML
    private JFXButton stockAdjuctment_btn;

    @FXML
    private JFXButton sale_btn;

    @FXML
    private JFXButton salesReturn_btn;

    @FXML
    private JFXButton salesOrder_btn;

    @FXML
    private JFXButton salesCallane_btn;

    @FXML
    private JFXButton purchase_btn;

    @FXML
    private JFXButton purchaseReturn_btn;

    @FXML
    private JFXButton purchaseOrder_btn;

    @FXML
    private JFXButton purchaseCallane_btn;

    @FXML
    private JFXButton creaditNote_btn;

    @FXML
    private JFXButton debitNote_btn;

    @FXML
    private JFXButton receiptVoucher_btn;

    @FXML
    private JFXButton paymentVoucher_btn;

    @FXML
    private JFXButton contraVoucher_btn;

    @FXML
    private JFXButton journalVoucher_btn;
        @FXML
    private ImageView acc;

            @FXML
    private ImageView btn_home;
           
            private int clickCount = 0;
            @FXML
    private Pane j3anchor;
            
                @FXML
    private Label j;

    @FXML
    private Label tech;
    
    @FXML
    private StackPane main_stack_pane;
    @FXML 
    private AnchorPane account_group;
  
    /**
     * Initializes the controller class.
     */
           
             
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       handleLeftSideMenuDrawer(); 
      
        drawer.setPrefHeight(main.screenHeight-45);
        main_stack_pane.setPrefSize(main.screenWidth, main.screenHeight-45);
        try {
            createPages();
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
  
    private void handleLeftSideMenuDrawer() {
        HamburgerBasicCloseTransition transition = new HamburgerBasicCloseTransition(hamburger);  
        transition.setRate(-1);
	hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
        transition.setRate(transition.getRate()*-1);
        transition.play();
        TranslateTransition moveRight = new TranslateTransition(new Duration(500), drawer);
	moveRight.setToX(240);
        TranslateTransition moveLeft = new TranslateTransition(new Duration(500), drawer);
//        FadeTransition ft = new FadeTransition(Duration.millis(300), icon_pane);
//        ft.setFromValue(0.5);
//        ft.setToValue(1.0);
        moveLeft.setToX(0);
        if(drawer.getTranslateX()==0){//linear-gradient(to top right, rgba(0, 255, 127, 0.1), rgba(0, 17, 13, 0.6))
            moveRight.play();
             j3();
        }else{
            moveLeft.play();     
    }});
  }   
 public void j3()
    {
         final String content = "J3";
         final String content1 = "  Technology";
         final Text text = new Text(25, 35, "");
         text.setFill(Color.RED);
         text.setFont(Font.font ("gabriola", 55));
         text.setLayoutX(10);
         text.setLayoutY(22);
         final Text text1 = new Text(40, 35, "");
         text1.setFont(Font.font ("gabriola", 40));
         text1.setLayoutX(20);
         text1.setLayoutY(20);
         final Animation animation = new Transition() {
             {
                 setCycleDuration(Duration.millis(5000));
             }
             @Override
             protected void interpolate(double frac) {
                 final int length = content.length();
                 final int length1 = content1.length();
                 final int n = Math.round(length * (float) frac);
                 final int n1 = Math.round(length1 * (float) frac);
                 text.setText(content.substring(0, n));
                 text1.setText(content1.substring(0, n1));
             }
         };
         animation.play();
         j3anchor.getChildren().add(text);
         j3anchor.getChildren().add(text1);
    }
     
     @FXML
    private void minimizeProgram(ActionEvent event) {

        System.out.println("{*} Program Minimized.");
        (
                (Stage)
                        (
                                (Button) event.getSource()).getScene().getWindow()
        ).setIconified(true);
    }

    @FXML
    private void maximizeProgram(ActionEvent event) {

        clickCount++;

        if (clickCount % 2 == 0) {

            System.out.println("{*} Going Windowed Mode.");
            (
                    (Stage)
                            (
                                    (Button) event.getSource()).getScene().getWindow()
            ).setFullScreen(false);

        } else {

            System.out.println("{*} Going FullScreen Mode.");
            (
                    (Stage)
                            (
                                    (Button) event.getSource()).getScene().getWindow()
            ).setFullScreen(true);
        }
    }

    @FXML
    void closeProgram(ActionEvent event) {
        Platform.exit();
    }
    
    
     @FXML
    void handleAccountGroup(ActionEvent event) {
        setFullScreenOnMenuClick();
        setNode(account_group);
    }

    @FXML
    void handleAccountMaster(ActionEvent event) {

    }

    @FXML
    void handleCompanyMaster(ActionEvent event) {

    }

    @FXML
    void handleDoctorMaster(ActionEvent event) {

    }

    @FXML
    void handleGSTMaster(ActionEvent event) {

    }

    @FXML
    void handleGenericMaster(ActionEvent event) {

    }

    @FXML
    void handleItemEntry(ActionEvent event) {

    }

    @FXML
    void handlePatientMaster(ActionEvent event) {

    }

    @FXML
    void handleSalesmanMaster(ActionEvent event) {

    }

    @FXML
    void handleStockAdjectment(ActionEvent event) {

    }

    @FXML
    void handleStockEntry(ActionEvent event) {

    }
    
    
    private void setFullScreenOnMenuClick(){
        TranslateTransition moveLeft = new TranslateTransition(new Duration(500), drawer);
        moveLeft.setToX(-(drawer.getScaleX()+170));
        moveLeft.play();
    }
     
     private void createPages() throws IOException{
              account_group   = FXMLLoader.load(getClass().getResource(Route.ACCOUNT_GROUP));
//            account_master  = FXMLLoader.load(getClass().getResource(Route.ACCOUNT_MASTER));
//            company_master  = FXMLLoader.load(getClass().getResource(Route.COMPANY_MASTER));
//            doctor_master   = FXMLLoader.load(getClass().getResource(Route.DOCTOR_MASTER));
//            generic_master  = FXMLLoader.load(getClass().getResource(Route.GENERIC_MASTER));
//            gst_master      = FXMLLoader.load(getClass().getResource(Route.GST_MASTER));
//            patient_master  = FXMLLoader.load(getClass().getResource(Route.PATIENT_MASTER));
//            salesman_master = FXMLLoader.load(getClass().getResource(Route.SALESMAN_MASTER));
//            item_entry      = FXMLLoader.load(getClass().getResource(Route.ITEM_ENTRY));
        
    }
     
     
       //Set selected node to a content holder
    public void setNode(Node node) {
        main_stack_pane.getChildren().clear();
        main_stack_pane.getChildren().add((Node) node);
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(500), node);
        scaleTransition.setByX(-1f);
        scaleTransition.setToY(0f);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
    }
    public void openPage(Node node, double pageWidth, double pageHeight){
        Stage pageStage = new Stage();
        Scene scene = new Scene((Parent) node, pageWidth, pageHeight);
        pageStage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        pageStage.setScene(scene);
        pageStage.setY(50);
        pageStage.show();
    }
}
