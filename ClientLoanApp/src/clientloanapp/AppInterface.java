package clientloanapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppInterface extends Application {

    public static void print() {
        System.out.println("Button Clicked successfully");
    }
    
    public void launchApp() {
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        HBox rootBox = new HBox(10);
        rootBox.setAlignment(Pos.CENTER);
        b1.setOnMouseClicked(e -> print());
        rootBox.getChildren().add(b1);
        rootBox.getChildren().add(b2);
        Scene scene = new Scene(rootBox, 300, 200);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        launchApp();
    }
    public static void main(String[] args) {
        //System.out.println("Geia sou promt shell");  
        //Client George = new Client ();
        //IndivClient Nikos= new IndivClient();
       // System.out.println(getClientsFromSerive());
        
        AppInterface app = new AppInterface();
        app.launchApp();
    }
}