package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

 @Override
    public void start(Stage stage) throws Exception {
        
        
        HBox rootBox = new HBox(100);
        rootBox.setAlignment(Pos.TOP_RIGHT);

        TextField clientSearch = new TextField();
        Scene scene = new Scene(rootBox, 800, 600);
        
        stage.setScene(scene);
        
        stage.show();
        clientSearch.maxWidth(200);
        Button search = new Button();
        rootBox.getChildren().addAll(clientSearch,search);
    }
    
    public static void main(String[] args)
    {
        ClientLoanApp.
        launch(args);
    }
    
}