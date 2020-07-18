package J29_3;

public class ImieNazwisko {
    public String imie;
    public String nazwisko;

    public ImieNazwisko(){
    }

    public ImieNazwisko (String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        this.imie=imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }

    @Override
    public String toString() {
        return "ImieNazwisko{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
