package J29_3;

public class Trener extends ImieNazwisko {

    public String specjalizacjaTechnologiczna;

    public Trener(){
    }
    public Trener(String imie,String nazwisko,String specjalizacjaTechnologiczna){
        super (imie,nazwisko);
        this.specjalizacjaTechnologiczna=specjalizacjaTechnologiczna;
    }
    public String getSpecjalizacjaTechnologiczna(){
        return specjalizacjaTechnologiczna;
    }
    public void setSpecjalizacjaTechnologiczna(String specjalizacjaTechnologiczna){
        this.specjalizacjaTechnologiczna=specjalizacjaTechnologiczna;
    }
    public void getTrener(){
        System.out.print(imie+" "+nazwisko+" - "+specjalizacjaTechnologiczna+", ");
    }

    @Override
    public String toString() {
        return "Trener{" +
                "specjalizacjaTechnologiczna='" + specjalizacjaTechnologiczna + '\'' +
                '}';
    }
}
