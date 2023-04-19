package com.example.op_ryhmatoo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Küsimused extends Application {
    private static int kategooriaid = 6;
    private static int küsimusi = 5;

    private GridPane gridPane;
    private Button[][] buttons;
    private int[][] points = {{100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500}};

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Kuldvillak");

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // katrgooriad
        String[] kategooriad = {"Diskmat", "TU", "Progre", "Majandus", "Tõenäosus", "Andmebaasid"};
        for (int i = 0; i < kategooriaid; i++) {
            Label katekooriate_silt = new Label(kategooriad[i]);
            katekooriate_silt.setPrefSize(150, 50);
            katekooriate_silt.setAlignment(Pos.CENTER);
            gridPane.add(katekooriate_silt, i, 0);
        }

        // küsimused
        buttons = new Button[kategooriaid][küsimusi];
        for (int i = 0; i < kategooriaid; i++) {
            for (int j = 0; j < küsimusi; j++) {
                buttons[i][j] = new Button("$" + ((j+1)*100));
                buttons[i][j].setPrefSize(150, 100);
                int finalI = i;
                int finalJ = j;
                buttons[i][j].setOnAction(event -> handleButtonAction(finalI, finalJ));
                gridPane.add(buttons[i][j], i, j+1);
            }
        }

        //loome stseeni
        gridPane.setPadding(new Insets(5, 5, 80, 5)); //vahed eriti alt et punktid panna kuhugi
        primaryStage.setWidth(800); //originaalse akna laius
        primaryStage.setHeight(500); //ja pikkus
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); //ei lase suurust muuta
        primaryStage.show();
    }

    private void handleButtonAction(int categoryIndex, int questionIndex) {
        buttons[categoryIndex][questionIndex].setDisable(true);
        Stage pointsStage = new Stage();
        pointsStage.setTitle("Küsimus");
        pointsStage.initModality(Modality.APPLICATION_MODAL);
        pointsStage.initOwner(gridPane.getScene().getWindow());
        pointsStage.setResizable(false); //ei lase suurust muuta

        //küsimuse koht
        Label küsimus = new Label("küsimus"); //siia läheb küsimus
        Label vastus = new Label("vastus"); //siia läheb vastus
        vastus.setStyle("-fx-opacity: 0;"); //on juba alguses ekraanil aga läbipaistev
        vastus.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            vastus.setStyle("-fx-opacity: 1;");  }); //kui vajutada peale siis ilmub
        küsimus.setFont(new Font("Arial", 50));
        vastus.setFont(new Font("Arial", 50));
        küsimus.setAlignment(Pos.CENTER);
        küsimus.setPadding(new Insets(20));

        VBox pointsLayout = new VBox();
        pointsLayout.setAlignment(Pos.CENTER);
        pointsLayout.getChildren().addAll(küsimus, vastus);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> pointsStage.close());
        HBox closeButtonLayout = new HBox(closeButton);
        closeButtonLayout.setAlignment(Pos.CENTER);
        pointsLayout.getChildren().addAll(closeButtonLayout);

        Scene pointsScene = new Scene(pointsLayout, gridPane.getScene().getWidth(), gridPane.getScene().getHeight());
        pointsStage.setScene(pointsScene);
        pointsStage.showAndWait();


    }

    private void handlePointsButtonAction(int points) {
        System.out.println("Points: " + points);
    }

    public static void main(String[] args) {
        launch(args);
    }

}