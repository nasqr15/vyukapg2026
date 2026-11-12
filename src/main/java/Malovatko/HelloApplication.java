package Malovatko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Arrays; // Změna importu
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane platno = new Pane();

        // 1. Slunko vlevo nahoře
        Kruh slunko = new Kruh(80, 80, 45);

        // 2. Tráva dole přes celou šířku
        Obdelnik trava = new Obdelnik(0, 320, 600, 80);

        // 3. Jezero z elipsy na trávě
        Elipsa jezero = new Elipsa(230, 325, 95, 25);

        // 4. První strom v jezeře
        Obdelnik kmen1 = new Obdelnik(190, 210, 18, 115);
        Kruh koruna1 = new Kruh(199, 175, 45);

        // 5. Druhý strom vpravo na trávě
        Obdelnik kmen2 = new Obdelnik(424, 180, 22, 140);
        Kruh koruna2 = new Kruh(435, 130, 55);

        // 6. Jablka ze čtverců uvnitř pravé koruny
        Ctverec jablko1 = new Ctverec(430, 90, 10);
        Ctverec jablko2 = new Ctverec(410, 115, 10);
        Ctverec jablko3 = new Ctverec(435, 115, 10);
        Ctverec jablko4 = new Ctverec(460, 110, 10);
        Ctverec jablko5 = new Ctverec(400, 145, 10);
        Ctverec jablko6 = new Ctverec(450, 150, 10);

        // ZDE JE OPRAVA: Použití Arrays.asList místo List.of
        List<Tvar> obrazek = Arrays.asList(
                slunko,
                trava,
                jezero,
                kmen1, koruna1,
                kmen2, koruna2,
                jablko1, jablko2, jablko3, jablko4, jablko5, jablko6
        );

        // Hromadné vykreslení všech tvarů
        for (Tvar tvar : obrazek) {
            tvar.Namaluj(platno);
        }

        Scene scene = new Scene(platno, 600, 400);
        stage.setTitle("Krajinka v JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}


