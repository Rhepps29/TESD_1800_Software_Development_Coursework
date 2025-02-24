import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Ex16_1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        HBox btpane = new HBox(20);
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        btpane.getChildren().addAll(btLeft,btRight);
        btpane.setAlignment(Pos.CENTER);
        btpane.setStyle("-fx-border-color: black");
        BorderPane pane = new BorderPane();
        pane.setBottom(btpane);
        Pane paneForText = new Pane();
        Text text = new Text(165,75, "Programming is fun");
        paneForText.getChildren().addAll(text);
        pane.setCenter(paneForText);
        HBox RBPane = new HBox(20);
        RBPane.setStyle("-fx-border-color: black");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        RBPane.getChildren().addAll(rbRed,rbYellow,rbBlack,rbOrange,rbGreen);
        RBPane.setAlignment(Pos.CENTER);
        pane.setTop(RBPane);
        ToggleGroup group = new ToggleGroup();
        rbBlack.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        btLeft.setOnAction(e-> {
            if (text.getX()>10)
            text.setX(text.getX()-10);
        });
        btRight.setOnAction(e-> {
            if (text.getX()<335)
            text.setX(text.getX()+10);
        });
        rbRed.setOnAction(e->{
            if (rbRed.isSelected()){
                text.setFill(Color.RED);
            }
        });
        rbGreen.setOnAction(e->{
            if (rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
        });
        rbYellow.setOnAction(e->{
            if (rbYellow.isSelected()){
                text.setFill(Color.YELLOW);
            }
        });
        rbBlack.setOnAction(e->{
            if (rbBlack.isSelected()){
                text.setFill(Color.BLACK);
            }
        });
        rbOrange.setOnAction(e->{
            if (rbOrange.isSelected()){
                text.setFill(Color.ORANGE);
            }
        });
        Scene scene = new Scene(pane, 450,200);
        rbBlack.setSelected(true);
        primaryStage.setTitle("Ex16_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}