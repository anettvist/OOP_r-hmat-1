import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        Diskmat diskmat = new Diskmat(
                "Milliste sümbolite hulgad luuluvad signatuuri Sigma=<C; F; P>?",
                "Millist skeemi kasutatakse valemite süstemaatiliseks analüüsimiseks?",
                "Mida loetakse graafiteooria alguseks?",
                "Teatud hulk väiteid loetakse tõeseks ilma tõestuseta. Kuidas neid väiteid nimetatakse? ",
                "Kuidas nimetatakse graafi, mis on sidus ja ei sisalda tsükleid ning kuidas nimetatakse gaafi mille sidususkomponendid on eelnimetatud graafid?",
                "Konstantsümbolite hulk, funktsionaalsümbolite hulk, predikaatsümbolite mittetühi hulk",
                "Tõesuspuu",
                "L.Euleri poolt",
                "Selle teooria aksioomideks",
                "Puu ja mets"
        );
       Tu tu =new Tu("Mis aastal valmis delta hoone?",
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
               "Mis arvuga lõpeb 2java arvutüüp short?",
               "psvm",
               "Java'le ei ole vastavat akronüümi",
               "JavaScript",
               "1995",
               "32 767"
       );
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta teema(Diskreetne matemaatika, Programmeerimine, Tartu Ülikool, ...): ");
        String teema = sc.nextLine();
        System.out.println("Sisesta küsimuse number 100,..., 500");
        int nr = sc.nextInt();
        if(teema.equalsIgnoreCase("diskreetne matemaatika"))
            System.out.println(diskmat.annaküsimus(nr));
        if(teema.equalsIgnoreCase("programmeerimine"))
            System.out.println(proge.annaküsimus(nr));
        if(teema.equalsIgnoreCase("tartu ülikool"))
            System.out.println(tu.annaküsimus(nr));
        System.out.println("Sisesta OK kui soovid näha vastust");
        String vastus = sc.nextLine();
        if(vastus.equalsIgnoreCase("ok")) {
            if (teema.equalsIgnoreCase("diskreetne matemaatika"))
                System.out.println(diskmat.annavastus(nr));
            if (teema.equalsIgnoreCase("programmeerimine"))
                System.out.println(proge.annavastus(nr));
            if (teema.equalsIgnoreCase("tartu ülikool"))
                System.out.println(tu.annavastus(nr));
        }


    }
}
