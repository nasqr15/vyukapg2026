package Malovatko;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Tvar {
    public static void main(String[] args) {

        Pane canvas;
        canvas = new Pane();
        Kruh k1 = new Kruh(5,5,10);
        k1.setFill(Color.DODGERBLUE);
        canvas.getChildren().add(k1);
    }
}
