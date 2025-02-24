import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class Ex16_21 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        TextField tf = new TextField();
        tf.setAlignment(Pos.CENTER);
        Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
        MediaPlayer mp = new MediaPlayer(media);
        mp.setCycleCount(Timeline.INDEFINITE);
        EventHandler<ActionEvent> eH = e ->{
            tf.setText(Integer.toString(Integer.parseInt(tf.getText())-1));
            if (Integer.parseInt(tf.getText())<=0){
                mp.play();
            }else{
                mp.pause();
            }
        };
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(1000),eH));
        
        
        tf.setOnAction(e->{
            tl.setCycleCount(Integer.parseInt(tf.getText()));
            tl.play();

        });
        Pane pane = new Pane(tf);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}