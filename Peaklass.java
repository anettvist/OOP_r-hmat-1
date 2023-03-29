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
                "Mis arvuga lõpeb 2java arvutüüp short?",
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

        Scanner sc = new Scanner(System.in);
        System.out.println("Vali teema: \n 1 - Diskreetne matemaatika \n 2 - Programmeerimine \n 3 - Tartu Ülikool \n 4 - Majandus \n 5 - Andmebaasid \n 6 - Tõenäosusteooria ");
        String teema = sc.nextLine();
        System.out.println("Mitme punkti peale mängida soovid? \n 100 \n 200 \n 300 \n 400 \n 500");
        int nr = Integer.parseInt(sc.nextLine()); //see oli vale
        if (teema.equalsIgnoreCase("1"))
            System.out.println(diskmat.annaküsimus(nr));
        if (teema.equalsIgnoreCase("2"))
            System.out.println(proge.annaküsimus(nr));
        if (teema.equalsIgnoreCase("3"))
            System.out.println(proge.annaküsimus(nr));
        if (teema.equalsIgnoreCase("4"))
            System.out.println(majandus.annaküsimus(nr));
        if (teema.equalsIgnoreCase("5"))
            System.out.println(andmebaasid.annaküsimus(nr));
        if (teema.equalsIgnoreCase("6"))
            System.out.println(tõenäosus.annaküsimus(nr));
        System.out.println("Sisesta OK kui soovid näha vastust");
        String vastus = sc.nextLine();
        if (vastus.equalsIgnoreCase("ok")) {
            if (teema.equalsIgnoreCase("1"))
                System.out.println(diskmat.annavastus(nr));
            if (teema.equalsIgnoreCase("2"))
                System.out.println(proge.annavastus(nr));
            if (teema.equalsIgnoreCase("3"))
                System.out.println(tu.annavastus(nr));
            if (teema.equalsIgnoreCase("4"))
                System.out.println(majandus.annavastus(nr));
            if (teema.equalsIgnoreCase("5"))
                System.out.println(andmebaasid.annavastus(nr));
            if (teema.equalsIgnoreCase("6"))
                System.out.println(tõenäosus.annavastus(nr));
        }
    }
}
