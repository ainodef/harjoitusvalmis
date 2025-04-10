package com.example.harjoitus;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.*;

/**
 * Ikkuna luokka, joka toimii käyttöliittymänä
 */
public class ikkunaa extends Application {
    private kukkakauppa kukkakauppa1;
    private bonus kanta_asiakas1;
    private Label viime_ostos;

    /**
     * init valmistaa kukkakaupan ja kanta-asiakkaan start-komentoa varten
     */
    @Override
    public void init() {
        kukkakauppa1 = new kukkakauppa();
        kanta_asiakas1 = new bonus("Mauno Kuusi");
    }

    /**
     * Käyttöliittymä ja sen komennot
     * @param primaryStage Pääikkuna
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Kukkakauppa");
        ListView<String> lajikeList = new ListView<>();

        for (lajike lajike : kukkakauppa1.etsilajike(null, null, 0)) {
            if (lajike != null) {
                String item = "Lajikenimi: " + lajike.getLajikenimi() +
                        ", Väri: " + lajike.getColor() +
                        ", Hinta: " + lajike.getHinta();
                lajikeList.getItems().add(item);
            }
        }
/**
 * Määrä jonka asiakas ostaa
 */
        TextField teksti = new TextField();
        teksti.setText("3");
        viime_ostos = new Label("Viime kerralla ostit: " + lueViimeOstos());
/**
 * nappi, jota painamalla näkee ostokset ja viime ostokset
 */
        Button button1 = new Button("Ostetut lajikkeet");
        Label label1 = new Label();
        button1.setOnAction(actionEvent -> {
            String lajikkeet = lajikeList.getSelectionModel().getSelectedItem();
            String teksti2 = teksti.getText();
            if (lajikkeet == null || teksti2.isEmpty()) {
                label1.setText("Ei olemassa");
            } else {
                String ostos = "Ostit: " +lajikkeet + " Määrä: " +teksti2;
                label1.setText(ostos);
                tiedostoOstos(ostos);
                viime_ostos.setText("Viime kerralla ostit: " + lueViimeOstos());
            }
        });
/**
 * Luo ikkunan, jossa kaikki näkyy
 */
        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(lajikeList, button1, label1, viime_ostos);
        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Ostoksen tallennus tiedostoon
     * @param ostos Kertoo mitä ostit
     */
    private void tiedostoOstos(String ostos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("viimeostokset.txt"))) {
            writer.write(ostos);
         }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lukee viimeisimmän ostoksen tiedostosta
     * @return Viimeisin ostos
     */
    private String lueViimeOstos() {
        StringBuilder viimeOstos = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("viimeostokset.txt"))) {
            viimeOstos.append(reader.readLine());
        } catch (IOException e) {
            return "Ei ostoksia tallennettuna.";
        }
        return viimeOstos.toString();
    }

    /**
     * Main-metodi, jolla koko homma toimii
     * @param args argumentit
     */
    public static void main(String[] args) {
        launch(args);
    }
}