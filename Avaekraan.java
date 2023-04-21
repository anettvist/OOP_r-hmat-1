package com.example.projekt_graafiline;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Avaekraan extends Application {
    private static final String IDLE_BUTTON_STYLE_START = "-fx-background-color: \n" +
            "                        linear-gradient(#ffd65b, #e68400),\n" +
            "                        linear-gradient(#ffef84, #f2ba44),\n" +
            "                        linear-gradient(#ffea6a, #efaa22),\n" +
            "                        linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%),\n" +
            "                        linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0));\n" +
            "                    -fx-background-radius: 30;\n" +
            "                    -fx-background-insets: 0,1,2,3,0;\n" +
            "                   -fx-text-fill: #654b00;\n" +
            "                    -fx-font-weight: bold;\n" +
            "                   -fx-font-size: 14px;\n" +
            "                    -fx-padding: 10 20 10 20;";
    private static final String HOVERED_BUTTON_STYLE_START = "-fx-background-color: \n" +
            "        linear-gradient(#808080, #545454),\n" +
            "        linear-gradient(#949494, #707070),\n" +
            "        linear-gradient(#8f8f8f, #434343),\n" +
            "        linear-gradient(#949494 0%, #707070 50%, #252525 100%),\n" +
            "        linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0));\n" +
            "    -fx-background-radius: 30;\n" +
            "    -fx-background-insets: 0,1,2,3,0;\n" +
            "    -fx-text-fill: #c5b700;\n" +
            "    -fx-font-weight: bold;\n" +
            "    -fx-font-size: 14px;\n" +
            "    -fx-padding: 10 20 10 20;";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Avaekraan");
        BorderPane bp = new BorderPane();
        FileInputStream fail = new FileInputStream("C:\\Users\\malin\\Desktop\\kuldvillak.jpg");
        Image logo = new Image(fail);
        ImageView pildivaade = new ImageView(logo);
        pildivaade.setFitHeight(170);
        pildivaade.setFitWidth(700);
        bp.setTop(pildivaade);

        VBox vasemadtiimid = new VBox();
        Label l1 = new Label("Tiim 1");
        l1.setTextFill(Color.GOLD);
        TextField tf1 = new TextField();

        Label l2 = new Label("Tiim 2");
        l2.setTextFill(Color.GOLD);
        TextField tf2 = new TextField();
        Label l3 = new Label("Tiim 3");
        l3.setTextFill(Color.GOLD);
        TextField tf3 = new TextField();
        vasemadtiimid.getChildren().addAll(l1,tf1, l2, tf2, l3, tf3);
        bp.setLeft(vasemadtiimid);

        VBox paremadtiimid = new VBox();
        Label l4 = new Label("Tiim 4");
        l4.setTextFill(Color.GOLD);
        TextField tf4 = new TextField();
        Label l5 = new Label("Tiim 5");
        l5.setTextFill(Color.GOLD);
        TextField tf5 = new TextField();
        Label l6 = new Label("Tiim 6");
        l6.setTextFill(Color.GOLD);
        TextField tf6 = new TextField();
        paremadtiimid.getChildren().addAll(l4, tf4, l5, tf5, l6, tf6);
        bp.setRight(paremadtiimid);
        vasemadtiimid.setStyle("-fx-background-color:BLACK");
        paremadtiimid.setStyle("-fx-background-color: BLACK;");

        Text kasutus = new Text("Olete tulnud mängima kuldvillakut.\n Küsimusi on igale raskusastmele.\n" +
                "Kõigepealt sisesta tiimi nimi nii mitmesse kasti,\n kui tiime on, tühje kaste ei loeta tiimideks.\n" +
                "Seejärel vajuta start ja alusta vastamisega,\n õige vastuse nägemiseks vajuta space\n klahvi klaviatuuril.\n" +
                "Punkte saab lisada käsitsi.");
        kasutus.setFill(Color.GOLD);
        bp.setCenter(kasutus);
        Button start = new Button("START");
        start.setStyle(IDLE_BUTTON_STYLE_START);
        start.setOnMouseEntered(event -> start.setStyle(HOVERED_BUTTON_STYLE_START));
        start.setOnMouseExited(event -> start.setStyle(IDLE_BUTTON_STYLE_START));
        start.setOnMouseClicked(event -> {

        });

        bp.setBottom(start);
        bp.setAlignment(start, Pos.CENTER);
        bp.setStyle("-fx-background-color:BLACK");



        Scene  stseen = new Scene(bp, 700, 350);
        primaryStage.setResizable(false);
        primaryStage.setScene(stseen);
        primaryStage.show();

    }
}
