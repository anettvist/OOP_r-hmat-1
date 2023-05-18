package com.example.projekt_graafiline;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Küsimused extends Application {
    private static int kategooriaid = 6;
    private static int küsimusi = 5;
    private static TextField tf1;
    private static int seis1;
    private static TextField tf2;
    private static int seis2;
    private static TextField tf3;
    private static int seis3;
    private static TextField tf4;
    private static int seis4;
    private static TextField tf5;
    private static int seis5;
    private static TextField tf6;
    private static int seis6;
//start nupu hover
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
//kuldvillaku mänguosa kastide hoverid
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: dark grey; -fx-text-fill: gold; -fx-border-color: grey";
    private static final String HOVER_BUTTON_STYLE ="-fx-background-color: dark grey; -fx-text-fill: yellow; -fx-border-color: white";

    private GridPane gridPane;
    private Button[][] buttons;
    private int[][] points = {{100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500},
            {100, 200, 300, 400, 500}};
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Avaekraan");//avaekraan
        BorderPane bp = new BorderPane();
        FileInputStream fail = new FileInputStream("C:\\Users\\malin\\Desktop\\kuldvillak.jpg");
        Image logo = new Image(fail);
        ImageView pildivaade = new ImageView(logo);
        pildivaade.setFitHeight(170);
        pildivaade.setFitWidth(700);
        bp.setTop(pildivaade);

        VBox vasemadtiimid = new VBox();//tiiminimede kastid, mis asuvad vasakul pool
        Label l1 = new Label("Tiim 1");
        l1.setTextFill(Color.GOLD);
        tf1=new TextField();
        Label l2 = new Label("Tiim 2");
        l2.setTextFill(Color.GOLD);
        tf2 = new TextField();
        Label l3 = new Label("Tiim 3");
        l3.setTextFill(Color.GOLD);
        tf3 = new TextField();
        vasemadtiimid.getChildren().addAll(l1, tf1, l2, tf2, l3, tf3);
        bp.setLeft(vasemadtiimid);

        VBox paremadtiimid = new VBox();//tiiminimede kastid, mis asuvad paremal pool
        Label l4 = new Label("Tiim 4");
        l4.setTextFill(Color.GOLD);
        tf4 = new TextField();
        Label l5 = new Label("Tiim 5");
        l5.setTextFill(Color.GOLD);
        tf5 = new TextField();
        Label l6 = new Label("Tiim 6");
        l6.setTextFill(Color.GOLD);
        tf6 = new TextField();
        paremadtiimid.getChildren().addAll(l4, tf4, l5, tf5, l6, tf6);
        bp.setRight(paremadtiimid);
        vasemadtiimid.setStyle("-fx-background-color:BLACK");
        paremadtiimid.setStyle("-fx-background-color: BLACK;");

        Text kasutus = new Text("Olete tulnud mängima kuldvillakut.\nKüsimusi on igale raskusastmele.\n" +
                "Kõigepealt sisesta tiimi nimed \n" +
                "Seejärel vajuta start ja alusta vastamisega,\nõige vastuse nägemiseks vajuta ükskõik\nkuhu ekraanil.\n" +
                "Punkte saab lisada käsitsi.");
        kasutus.setFill(Color.GOLD);
        bp.setCenter(kasutus);
        Button start = new Button("START");
        start.setStyle(IDLE_BUTTON_STYLE_START);//nupule hoveri seadistamine
        start.setOnMouseEntered(event -> start.setStyle(HOVERED_BUTTON_STYLE_START));
        start.setOnMouseExited(event -> start.setStyle(IDLE_BUTTON_STYLE_START));
        start.setOnMouseClicked(event -> {handlebuttonaction(new Stage());
        primaryStage.hide();});
        bp.setBottom(start);
        bp.setAlignment(start, Pos.CENTER);
        bp.setStyle("-fx-background-color:BLACK");
        Scene stseen = new Scene(bp, 700, 350);
        primaryStage.setResizable(false);
        primaryStage.setScene(stseen);
        primaryStage.show();

    }
    public void handlebuttonaction(Stage küss) {
        küss.setTitle("Kuldvillak");

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setStyle("-fx-background-color: black;");
        HBox plussmiinus = new HBox(2);// teeme igale tiimile oma punktide lisamis võimaluse
        HBox plussmiinus2 = new HBox(2);
        HBox plussmiinus3 = new HBox(2);
        HBox plussmiinus4= new HBox(2);
        HBox plussmiinus5 = new HBox(2);
        HBox plussmiinus6 = new HBox(2);

        Button pluss = new Button("+");
        Button miinus = new Button("-");
        Button pluss2 = new Button("+");
        Button miinus2 = new Button("-");
        Button pluss3 = new Button("+");
        Button miinus3 = new Button("-");
        Button pluss4 = new Button("+");
        Button miinus4 = new Button("-");
        Button pluss5 = new Button("+");
        Button miinus5 = new Button("-");
        Button pluss6 = new Button("+");
        Button miinus6 = new Button("-");

        plussmiinus.getChildren().addAll(pluss, miinus);//lisame nupud vastavatesse boxidesse
        plussmiinus2.getChildren().addAll(pluss2, miinus2);
        plussmiinus3.getChildren().addAll(pluss3, miinus3);
        plussmiinus4.getChildren().addAll(pluss4, miinus4);
        plussmiinus5.getChildren().addAll(pluss5, miinus5);
        plussmiinus6.getChildren().addAll(pluss6, miinus6);

        if(tf1.getText().isBlank())//kui tekstikasti ei ole midagi sisestatud, siis pannakse selle asemele kriips
            tf1.setText("-");//hiljem on ka võimalik veel tiime lisada ja nimesi muuta
        if(tf2.getText().isBlank())
            tf2.setText("-");
        if(tf3.getText().isBlank())
            tf3.setText("-");
        if(tf4.getText().isBlank())
            tf4.setText("-");
        if(tf5.getText().isBlank())
            tf5.setText("-");
        if(tf6.getText().isBlank())
            tf6.setText("-");

        VBox nimiP1 = new VBox(3);//teeme igale tiimile ma punkti ja nime kasti
        seis1 = 0;
        Label t1  = new Label(String.valueOf(seis1));
        t1.setTextFill(Color.GOLD);
        t1.setAlignment(Pos.CENTER);
        nimiP1.getChildren().addAll(tf1, t1, plussmiinus);

        VBox nimiP2 = new VBox(3);
        seis2 = 0;
        Label t2  = new Label(String.valueOf(seis2));
        t2.setTextFill(Color.GOLD);
        t2.setAlignment(Pos.CENTER);
        nimiP2.getChildren().addAll(tf2, t2, plussmiinus2);

        VBox nimiP3 = new VBox(3);
        seis3 = 0;
        Label t3  = new Label(String.valueOf(seis3));
        t3.setTextFill(Color.GOLD);
        t3.setAlignment(Pos.CENTER);
        nimiP3.getChildren().addAll(tf3, t3, plussmiinus3);

        VBox nimiP4 = new VBox(3);
        seis4 = 0;
        Label t4  = new Label(String.valueOf(seis4));
        t4.setTextFill(Color.GOLD);
        t4.setAlignment(Pos.CENTER);
        nimiP4.getChildren().addAll(tf4, t4, plussmiinus4);

        VBox nimiP5 = new VBox(3);
        seis5 = 0;
        Label t5  = new Label(String.valueOf(seis5));
        t5.setTextFill(Color.GOLD);
        t5.setAlignment(Pos.CENTER);
        nimiP5.getChildren().addAll(tf5, t5, plussmiinus5);

        VBox nimiP6 = new VBox(3);
        seis6 = 0;
        Label t6  = new Label (String.valueOf(seis6));
        t6.setTextFill(Color.GOLD);
        t6.setAlignment(Pos.CENTER);
        nimiP6.getChildren().addAll(tf6, t6, plussmiinus6);


        pluss.setOnMouseClicked(event -> {//siin teeme punktide lisamise ja lahutamise
            t1.setText(String.valueOf(seis1 =seis1+100));
        });
        miinus.setOnMouseClicked(event -> {
            t1.setText(String.valueOf(seis1= seis1-100));
        });
        pluss2.setOnMouseClicked(event -> {
            t2.setText(String.valueOf(seis2 = seis2+100));
        });
        miinus2.setOnMouseClicked(event -> {
            t2.setText(String.valueOf(seis2 = seis2-100));
        });
        pluss3.setOnMouseClicked(event -> {
            t3.setText(String.valueOf(seis3 = seis3+100));
        });
        miinus3.setOnMouseClicked(event -> {
            t3.setText(String.valueOf(seis3 = seis3-100));
        });
        pluss4.setOnMouseClicked(event -> {
            t4.setText(String.valueOf(seis4 = seis4+100));
        });
        miinus4.setOnMouseClicked(event -> {
            t4.setText(String.valueOf(seis4 = seis4-100));
        });
        pluss5.setOnMouseClicked(event -> {
            t5.setText(String.valueOf(seis5 = seis5+100));
        });
        miinus5.setOnMouseClicked(event -> {
            t5.setText(String.valueOf(seis5 = seis5-100));
        });
        pluss6.setOnMouseClicked(event -> {
            t6.setText(String.valueOf(seis6 = seis6+100));
        });
        miinus6.setOnMouseClicked(event -> {
            t6.setText(String.valueOf(seis6 = seis6-100));
        });


        // katrgooriad
        String[] kategooriad = {"Diskmat", "TU", "Progre", "Majandus", "Tõenäosus", "Andmebaasid"};
        for (int i = 0; i < kategooriaid; i++) {
            Label katekooriate_silt = new Label(kategooriad[i]);
            katekooriate_silt.setTextFill(Color.GOLD);
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
                buttons[i][j].setStyle(IDLE_BUTTON_STYLE);
                int finalJ = j;
                int finalI = i;
                buttons[i][j].setOnMouseEntered(e -> buttons[finalI][finalJ].setStyle(HOVER_BUTTON_STYLE));
                buttons[i][j].setOnMouseExited(e -> buttons[finalI][finalJ].setStyle(IDLE_BUTTON_STYLE));
                buttons[i][j].setOnAction(event -> handleButtonAction(finalI, finalJ));
                gridPane.add(buttons[i][j], i, j+1);
            }
        }

        //loome stseeni
        gridPane.setPadding(new Insets(5, 5, 10, 5)); //vahed eriti alt et punktid panna kuhugi
        küss.setWidth(800); //originaalse akna laius
        küss.setHeight(500); //ja pikkus
        gridPane.add(nimiP1,0, 6);//lisame gridi
        gridPane.add(nimiP2, 1, 6);
        gridPane.add(nimiP3, 2, 6);
        gridPane.add(nimiP4,3, 6);
        gridPane.add(nimiP5, 4, 6);
        gridPane.add(nimiP6, 5, 6);
        Scene scene = new Scene(gridPane);
        küss.setScene(scene);
        küss.setResizable(false); //ei lase suurust muuta
        küss.show();
    }


    private void handleButtonAction(int categoryIndex, int questionIndex) {//loome küsimusklasside isendid
        Diskmat diskmat = new Diskmat(
                "Milliste sümbolite hulgad luuluvad signatuuri Sigma=<C; F; P>?",
                "Millist skeemi kasutatakse valemite süstemaatiliseks analüüsimiseks?",
                "Mida loetakse graafiteooria alguseks?",
                "Teatud hulk väiteid loetakse tõeseks ilma tõestuseta. Kuidas neid väiteid nimetatakse? ",
                "Kuidas nimetatakse graafi, mis on sidus ja ei sisalda tsükleid ning kuidas nimetatakse gaafi mille sidususkomponendid on eelnimetatud graafid?",
                "Konstantsümbolite hulk, funktsionaalsümbolite hulk, predikaatsümbolite mittetühi hulk",
                "Tõesuspuu",
                "Königsbergi sildade probleemi lahendust šveitsi matemaatiku L.Euleri poolt",
                "Selle teooria aksioomideks",
                "Puu ja mets"
        );
        Tu tu = new Tu("Mis aastal valmis delta hoone?",
                "Kes on Tartu Ülikooli rektor?",
                "Mitmes linnas/asulas on Tartu ülikooli haarusid?",
                "Mitu teaduskonda on Tartu ülikoolis?",
                "Mitu inimest ca on lõpetanud Tartu ülikooli",
                "2020",
                "Toomas Asser",
                "6",
                "9",
                "70 000"
        );
        Proge proge = new Proge("Millise lühendiga saab väljastada javas rea “public static void main(String[] args)”? ",
                "Mida tähendab lühend java?",
                "Milline programmeerimiskeel on maailmas enim tuntud?",
                "Millal avaldati esimene java versioon?",
                "Mis arvuga lõpeb java arvutüüp short?",
                "psvm",
                "Java'le ei ole vastavat akronüümi",
                "JavaScript",
                "1995",
                "32 767"
        );
        Andmebaasid andmebaasid = new Andmebaasid(
                "Mida tähendab lühend SQL?",
                "Mis on metaandmed?",
                "Mis on andmebaasi juhtimissüsteem?",
                "Mis on andmeliiasus?",
                "Mis on olemite komplekt?",
                "Structured query language",
                "nimi, andmetüüp, kas võib olla tühi, vaikeväärtused, kitsendused jms",
                "programm, mis “oskab” vastavalt andmebaasis olevale kirjeldusele tõlgendada seal olevaid andmeid.",
                "reaalse maailma 1 fakti kajastatakse andmebaasis korduvalt",
                "olemitüübi alamhulk, osa olemitest, mis kuuluvad sama olemitüübi alla"
        );
        Majandus majandus = new Majandus(
                "Mis on ristelastsus?",
                "Mis on nõudlusseadus?",
                "Mis on normaalhüvised?",
                "Mis on pakkumisseadus?",
                "Mis on majapidamine?",
                "Kui palju ühe kauba hind mõjutab teise kauba hinda",
                "Muude tingimuste samaks jäädes, mida kõrgem on hind, seda väiksem on nõutav kogus.",
                "kaubad, mille nõudlus suureneb kui klientide sissetulek suureneb",
                "Muude tingimuste samaks jäädes, mida kõrgem on hüvise hind, seda suurem on pakutav kogus.",
                "majandusüksus, mille on ühine eelarve ja ühine sissetulek ning ühine otsus hüviste tarbimiseks"
        );
        Tõenäosus tõenäosus = new Tõenäosus(
                "Millega tegeleb kombinatoorika?",
                "Mis on juhuslik suurus?",
                "Mida teeb tõenäosus?",
                "Mis on subjektiivne tõenäosus?",
                "Mis on statistiline tõenäosus?",
                "tegeleb keerukatele tingimustele vastavate objektide loendamisega",
                "on muutuja, mille väärtused on määratud juhusliku katse tulemuste poolt",
                "Iseloomustab sündmuse toimumise tõenäosust skaalal 0-1",
                "ekspertide arvamus",
                "juhuslike katsete paljukordne kordamine"
        );
        buttons[categoryIndex][questionIndex].setDisable(true);
        Stage pointsStage = new Stage();
        pointsStage.setTitle("Küsimus");
        pointsStage.initModality(Modality.APPLICATION_MODAL);
        pointsStage.initOwner(gridPane.getScene().getWindow());
        pointsStage.setResizable(false); //ei lase suurust muuta
        Label küsimus = new Label(); //siia läheb küsimus
        Label vastus = new Label(); //siia läheb vastus
        //küsimuse koht
        if(categoryIndex==0 && questionIndex ==0){//kuvame vastava küsimuse
            küsimus.setText(diskmat.getKüsimus100());
            vastus.setText(diskmat.getVastus100());
        }
        if(categoryIndex==0 && questionIndex ==1){
            küsimus.setText(diskmat.getKüsimus200());
            vastus.setText(diskmat.getVastus200());
        }
        if(categoryIndex==0 && questionIndex ==2){
            küsimus.setText(diskmat.getKüsimus300());
            vastus.setText(diskmat.getVastus300());
        }
        if(categoryIndex==0 && questionIndex ==3){
            küsimus.setText(diskmat.getKüsimus400());
            vastus.setText(diskmat.getVastus400());
        }
        if(categoryIndex==0 && questionIndex ==4){
            küsimus.setText(diskmat.getKüsimus500());
            vastus.setText(diskmat.getVastus500());
        }
        if(categoryIndex==1 && questionIndex ==0){
            küsimus.setText(tu.getKüsimus100());
            vastus.setText(tu.getVastus100());
        }
        if(categoryIndex==1 && questionIndex ==1){
            küsimus.setText(tu.getKüsimus200());
            vastus.setText(tu.getVastus200());
        }
        if(categoryIndex==1 && questionIndex ==2){
            küsimus.setText(tu.getKüsimus300());
            vastus.setText(tu.getVastus300());
        }
        if(categoryIndex==1 && questionIndex ==3){
            küsimus.setText(tu.getKüsimus400());
            vastus.setText(tu.getVastus400());
        }
        if(categoryIndex==1 && questionIndex ==4){
            küsimus.setText(tu.getKüsimus500());
            vastus.setText(tu.getVastus500());
        }
        if(categoryIndex==2 && questionIndex ==0){
            küsimus.setText(proge.getKüsimus100());
            vastus.setText(proge.getVastus100());
        }
        if(categoryIndex==2 && questionIndex ==1){
            küsimus.setText(proge.getKüsimus200());
            vastus.setText(proge.getVastus200());
        }
        if(categoryIndex==2 && questionIndex ==2){
            küsimus.setText(proge.getKüsimus300());
            vastus.setText(proge.getVastus300());
        }
        if(categoryIndex==2 && questionIndex ==3){
            küsimus.setText(proge.getKüsimus400());
            vastus.setText(proge.getVastus400());
        }
        if(categoryIndex==2 && questionIndex ==4){
            küsimus.setText(proge.getKüsimus500());
            vastus.setText(proge.getVastus500());
        }
        if(categoryIndex==3 && questionIndex ==0){
            küsimus.setText(majandus.getKüsimus100());
            vastus.setText(majandus.getVastus100());
        }
        if(categoryIndex==3 && questionIndex ==1){
            küsimus.setText(majandus.getKüsimus200());
            vastus.setText(majandus.getVastus200());
        }
        if(categoryIndex==3 && questionIndex ==2){
            küsimus.setText(majandus.getKüsimus300());
            vastus.setText(majandus.getVastus300());
        }
        if(categoryIndex==3 && questionIndex ==3){
            küsimus.setText(majandus.getKüsimus400());
            vastus.setText(majandus.getVastus400());
        }
        if(categoryIndex==3 && questionIndex ==4){
            küsimus.setText(majandus.getKüsimus500());
            vastus.setText(majandus.getVastus500());
        }
        if(categoryIndex==4 && questionIndex ==0){
            küsimus.setText(tõenäosus.getKüsimus100());
            vastus.setText(tõenäosus.getVastus100());
        }
        if(categoryIndex==4 && questionIndex ==1){
            küsimus.setText(tõenäosus.getKüsimus200());
            vastus.setText(tõenäosus.getVastus200());
        }
        if(categoryIndex==4 && questionIndex ==2){
            küsimus.setText(tõenäosus.getKüsimus300());
            vastus.setText(tõenäosus.getVastus300());
        }
        if(categoryIndex==4 && questionIndex ==3){
            küsimus.setText(tõenäosus.getKüsimus400());
            vastus.setText(tõenäosus.getVastus400());
        }
        if(categoryIndex==4 && questionIndex ==4){
            küsimus.setText(tõenäosus.getKüsimus500());
            vastus.setText(tõenäosus.getVastus500());
        }
        if(categoryIndex==5 && questionIndex ==0){
            küsimus.setText(andmebaasid.getKüsimus100());
            vastus.setText(andmebaasid.getVastus100());
        }
        if(categoryIndex==5 && questionIndex ==1){
            küsimus.setText(andmebaasid.getKüsimus200());
            vastus.setText(andmebaasid.getVastus200());
        }
        if(categoryIndex==5 && questionIndex ==2){
            küsimus.setText(andmebaasid.getKüsimus300());
            vastus.setText(andmebaasid.getVastus300());
        }
        if(categoryIndex==5 && questionIndex ==3){
            küsimus.setText(andmebaasid.getKüsimus400());
            vastus.setText(andmebaasid.getVastus400());
        }
        if(categoryIndex==5 && questionIndex ==4){
            küsimus.setText(andmebaasid.getKüsimus500());
            vastus.setText(andmebaasid.getVastus500());
        }

        vastus.setOpacity(0); //on juba alguses ekraanil aga läbipaistev
        küsimus.setFont(new Font("Arial", 20));
        küsimus.setTextFill(Color.GOLD);
        vastus.setFont(new Font("Arial", 15));
        vastus.setTextFill(Color.GOLD);
        küsimus.setAlignment(Pos.CENTER);
        vastus.setAlignment(Pos.BOTTOM_CENTER);
        küsimus.setPadding(new Insets(20));

        VBox pointsLayout = new VBox(40);
        pointsLayout.setAlignment(Pos.CENTER);
        Button closeButton = new Button("Sulge");
        closeButton.setOnAction(event -> pointsStage.close());
        HBox closeButtonLayout = new HBox(closeButton);
        pointsLayout.setOnMouseClicked(event -> vastus.setOpacity(1));//klikides ekraanile teeme vastuse nähtavaks
        closeButtonLayout.setAlignment(Pos.BOTTOM_CENTER);
        pointsLayout.getChildren().addAll(küsimus, vastus, closeButtonLayout);
        pointsLayout.setStyle("-fx-background-color: black;");

        Scene pointsScene = new Scene(pointsLayout, gridPane.getScene().getWidth(), gridPane.getScene().getHeight());
        pointsStage.setScene(pointsScene);
        pointsStage.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
