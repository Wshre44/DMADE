/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3technology.controller;

import com.j3technology.application.MastersDao;
import com.j3technology.application.MastersDaoImpl;
import com.j3technology.helpers.Dialogs;
import com.j3technology.model.AccountGroup;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Admin-J3
 */
public class AccountGroupController implements Initializable {
 @FXML
    private AnchorPane account_group;

    @FXML
    private AnchorPane header_pane;

    @FXML
    private Label acc_group_heading;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private Button btn;
    int i;
        String n;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private void handleSave(ActionEvent event) {
        if(id.getText()==null){
            Dialogs.warning("Please enter required data");
            id.requestFocus();
        }else{
            saveData();
            Dialogs.success("Data Stored Successfully..");
        } 
    }
     private void saveData(){
         
        i = Integer.parseInt(id.getText());
        n=name.getText();
        AccountGroup acc = new AccountGroup(i,n);
        MastersDao master = new MastersDaoImpl();
        master.saveData(acc);
       
     }
}
