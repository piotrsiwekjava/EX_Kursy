package J29_3;

import java.util.ArrayList;

public class Kurs {
    public String nazwaKursu;
    public ArrayList <Trener> listaTrenerow = new ArrayList<>();
    public String termin;
    public ArrayList <Uczestnik> listaUczestnikow = new ArrayList<>();
    public String miejsce;

    public Kurs(){
    }
    public Kurs (ArrayList<Trener>listaTrenerow){
        this.listaTrenerow=listaTrenerow;
    }

    public Kurs(String nazwaKursu,String termin, String miejsce){
        this.nazwaKursu=nazwaKursu;
        this.termin=termin;
        this.miejsce=miejsce;
    }

    public Kurs (String nazwaKursu, ArrayList<Trener>listaTrenerow, String termin, ArrayList<Uczestnik>listaUczestnikow, String miejsce){
        this.nazwaKursu=nazwaKursu;
        this.listaTrenerow=listaTrenerow;
        this.termin=termin;
        this.listaUczestnikow=listaUczestnikow;
        this.miejsce=miejsce;
    }

    public String getNazwaKursu(){
        return nazwaKursu;
    }
    public void setNazwaKursu(String nazwaKursu){
        this.nazwaKursu=nazwaKursu;
    }
    public ArrayList <Trener> getListaTrenerow(){
        return listaTrenerow;
    }
    public void setListaTrenerow(ArrayList<Trener> listaTrenerow){
        this.listaTrenerow=listaTrenerow;
    }
    public String getTermin(){
        return termin;
    }
    public void setTermin(String termin){
        this.termin=termin;
    }
    public ArrayList <Uczestnik> getListaUczestnikow(){
        return listaUczestnikow;
    }
    public void setListaUczestnikow(ArrayList<Uczestnik> listaUczestnikow){
        this.listaUczestnikow=listaUczestnikow;
    }
    public String getMiejsce(){
        return miejsce;
    }
    public void setMiejsce(String miejsce){
        this.miejsce=miejsce;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "nazwaKursu='" + nazwaKursu + '\'' +
                ", listaTrenerow=" + listaTrenerow +
                ", termin='" + termin + '\'' +
                ", listaUczestnikow=" + listaUczestnikow +
                ", miejsce='" + miejsce + '\'' +
                '}';
    }
}
