public class Proge extends Kuldvillak{
    public Proge(String küsimus100, String küsimus200, String küsimus300, String küsimus400, String küsimus500, String vastus100, String vastus200, String vastus300, String vastus400, String vastus500) {
        super(küsimus100, küsimus200, küsimus300, küsimus400, küsimus500, vastus100, vastus200, vastus300, vastus400, vastus500);
    }
    @Override
    public String annaküsimus(int nr) {
        switch (nr){
            case 100:
                return getKüsimus100();
            case 200:
                return getKüsimus200();
            case 300:
                return getKüsimus300();
            case 400:
                return getKüsimus400();
            case 500:
                return getKüsimus500();
        }
        return "sa ei valinud küsimust";
    }

    @Override
    public String annavastus(int nr) {
        switch (nr){
            case 100:
                return getVastus100();
            case 200:
                return getVastus200();
            case 300:
                return getVastus300();
            case 400:
                return getVastus400();
            case 500:
                return getVastus500();

        }
        return "sa ei valinud küsimust";
    }
}
