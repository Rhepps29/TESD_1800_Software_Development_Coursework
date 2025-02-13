import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class Exercise15_2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Exercise 15");
        Pane pane = new Pane();
        Rectangle rect = new Rectangle(100,100,25,50);
        rect.setFill(Color.BLUE);
        Polygon poly = new Polygon();
        ObservableList<Double> list = poly.getPoints();
        poly.setFill(Color.RED);
        double x = 100, y = 100, radius = 40;
        for (int i = 0; i <5; i++){
            list.add(x + radius * (Math.cos(2 * i * Math.PI / 5)));
            list.add(y - radius * (Math.sin(2 * i * Math.PI / 5)));
        }
        poly.setRotate(-18);
        pane.getChildren().addAll(poly,rect);
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(poly);
        pt.setNode(rect);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();
        FadeTransition ft = new FadeTransition(Duration.millis(2000), rect);
        ft.setFromValue(1);
        ft.setToValue(.01);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        pane.setOnMouseClicked(e->{
            if (e.getButton() == MouseButton.SECONDARY){
            pt.pause();
            ft.pause();
        }else if (e.getButton() == MouseButton.PRIMARY){
            pt.play();
            ft.play();
        }
        });
        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.show();
    }
}