package tugasjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TugasJAVAFX extends Application {
        
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        Label Input1 = new Label("First Name");
        Label Input2 = new Label("Last Name");
        Label Input3 = new Label("E-mail Address");
        Label Input4 = new Label("Contact No");
        Label Input5 = new Label("Password");
        Label Input6 = new Label("Confirm Password");
        btn.setText("Register");
        btn.setStyle("-fx-background-color : blue;");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Successfully Registered!");
            }
        });
        

        Group root = new Group();
        TilePane panel1 = new TilePane();
        TilePane panel2 = new TilePane();
        TilePane panel3 = new TilePane();
        TilePane panel4 = new TilePane();
        TilePane panel5 = new TilePane();
        TilePane panel6 = new TilePane();
        TilePane panel7 = new TilePane();
        
        panel1.getChildren().addAll(Input1, tf1);   
        panel2.getChildren().addAll(Input2, tf2);
        panel3.getChildren().addAll(Input3, tf3);   
        panel4.getChildren().addAll(Input4, tf4);
        panel5.getChildren().addAll(Input5, tf5);
        panel6.getChildren().addAll(Input6, tf6);
        panel7.getChildren().add(btn);
        
        panel1.setLayoutX(50);
        panel1.setLayoutY(10);
        
        panel2.setLayoutX(50);
        panel2.setLayoutY(50);
        
        panel3.setLayoutX(50);
        panel3.setLayoutY(90);
        
        panel4.setLayoutX(50);
        panel4.setLayoutY(130);
        
        panel5.setLayoutX(50);
        panel5.setLayoutY(170);
        
        panel6.setLayoutX(50);
        panel6.setLayoutY(210);
        
        panel7.setLayoutX(230);
        panel7.setLayoutY(250);
        
        root.getChildren().addAll(panel1,panel2, panel3, panel4, panel5, panel6, panel7);
        
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
