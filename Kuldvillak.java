public abstract class Kuldvillak {
    private String küsimus100;
    private String küsimus200;
    private String küsimus300;
    private String küsimus400;
    private String küsimus500;
    private String vastus100;
    private String vastus200;
    private String vastus300;
    private String vastus400;
    private String vastus500;
    public Kuldvillak(String küsimus100, String küsimus200, String küsimus300, String küsimus400, String küsimus500, String vastus100, String vastus200, String vastus300, String vastus400, String vastus500){
        this.küsimus100=küsimus100;
        this.küsimus200 =küsimus200;
        this.küsimus300 = küsimus300;
        this.küsimus400 = küsimus400;
        this.küsimus500=küsimus500;
        this.vastus100 = vastus100;
        this.vastus200=vastus200;
        this.vastus300= vastus300;
        this.vastus400=vastus400;
        this.vastus500=vastus500;
    }

    public String getKüsimus100() {
        return küsimus100;
    }

    public void setKüsimus100(String küsimus100) {
        this.küsimus100 = küsimus100;
    }

    public String getKüsimus200() {
        return küsimus200;
    }

    public void setKüsimus200(String küsimus200) {
        this.küsimus200 = küsimus200;
    }

    public String getKüsimus300() {
        return küsimus300;
    }

    public void setKüsimus300(String küsimus300) {
        this.küsimus300 = küsimus300;
    }

    public String getKüsimus400() {
        return küsimus400;
    }

    public void setKüsimus400(String küsimus400) {
        this.küsimus400 = küsimus400;
    }

    public String getKüsimus500() {
        return küsimus500;
    }

    public void setKüsimus500(String küsimus500) {
        this.küsimus500 = küsimus500;
    }

    public String getVastus100() {
        return vastus100;
    }

    public void setVastus100(String vastus100) {
        this.vastus100 = vastus100;
    }

    public String getVastus200() {
        return vastus200;
    }

    public void setVastus200(String vastus200) {
        this.vastus200 = vastus200;
    }

    public String getVastus300() {
        return vastus300;
    }

    public void setVastus300(String vastus300) {
        this.vastus300 = vastus300;
    }

    public String getVastus400() {
        return vastus400;
    }

    public void setVastus400(String vastus400) {
        this.vastus400 = vastus400;
    }

    public String getVastus500() {
        return vastus500;
    }

    public void setVastus500(String vastus500) {
        this.vastus500 = vastus500;
    }
    public abstract String annavastus(int nr);
    public abstract String annaküsimus(int nr);
}
