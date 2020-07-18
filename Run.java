package J29_3;

import J29_1.Pracownik;

import java.util.ArrayList;
import java.util.Scanner;

public class Run extends Kurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Kurs> listaKursow = new ArrayList<>();
        String exit = "On";        // wyjście z programu
        int uwagi = 0, znak = 0;//uwagi-jeśli ktoś zrobi błąd; znak-jak ktos nie znajdzie
        String info = "";         //informacja zwrotna
        System.out.println("Witaj w programie zarządzania kursami.");

        while (exit.equals("On")) {
            System.out.println("");
            System.out.println("Naciśnij: D-dodaj kurs, T-dodaj trenera do kursu, U-dodaj uczesnika kursu,");
            System.out.println("UT-usuń trenera z kursu, UU-Usuń uczestnika z kursu, UK-usuń kurs,");
            System.out.println("ZU-zmodyfikuj dane uczestnika, ZK-zmodyfikuj dane kursu,");
            System.out.println("W-wyświetl kursy wraz z prowadzącymi trenerami i uczestnikami, WK-wyświetl kurs,");
            System.out.println("OFF-aby zakończyć prace z programem.");
            String decyzja = sc.nextLine().toUpperCase();
            if (decyzja.equals("D")) {
                System.out.println("Dodajesz kurs.");
                System.out.print("Podaj nazwe kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.print("Podaj termin kursu: ");
                String termin = sc.nextLine();
                System.out.print("Podaj miejsce kursu: ");
                String miejsce = sc.nextLine();
                Kurs kurs = new Kurs(nazwaKursu, termin, miejsce);
                listaKursow.add(kurs);
                System.out.println("Kurs "+nazwaKursu+" "+termin+" został dodany pomyślnie");
            }
            else if (decyzja.equals("T")) {
                boolean znaleziony = false;
                System.out.println("Dodajesz trenera.");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.print("Podaj imie Trenera: ");
                        String imie= sc.nextLine();
                        System.out.print("Podaj nazwisko Trenera: ");
                        String nazwisko = sc.nextLine();
                        System.out.print("Podaj specjalizacje technologiczną Trenera: ");
                        String specjalizacjaTechnologiczna = sc.nextLine();
                        Trener trener = new Trener(imie,nazwisko,specjalizacjaTechnologiczna);
                        kurs.listaTrenerow.add(trener);
                        System.out.println("Trener "+imie+" "+nazwisko+" "+specjalizacjaTechnologiczna+" został dodany do kursu "+nazwaKursu+" "+termin+".");
                        znaleziony = true;
                        break;
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono!");
                }
            }
            else if (decyzja.equals("U")) {
                boolean znaleziony = false;
                System.out.println("Dodajesz uczestnika.");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                System.out.println("");
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.print("Podaj imie Uczestnika: ");
                        String imie = sc.nextLine();
                        System.out.print("Podaj nazwisko Uczestnika: ");
                        String nazwisko = sc.nextLine();
                        System.out.print("Podaj telefon Uczestnika: ");
                        String telefon = sc.nextLine();
                        System.out.print("Podaj email Uczestnika: ");
                        String email = sc.nextLine();
                        if (kurs.listaUczestnikow.size() < 15) {
                            Uczestnik uczestnik = new Uczestnik(imie, nazwisko, telefon, email);
                            kurs.listaUczestnikow.add(uczestnik);
                            System.out.print("Uczestnik ");
                            uczestnik.getUczestnik();
                            System.out.println(" został poprawnie dodany do kursu "+nazwaKursu+" "+termin+".");
                        } else {
                            System.out.println("Nie można dodać uczestnika! Maksymalna liczba 15 uczestnikow osiągnięta!");
                        }
                        znaleziony = true;
                        break;
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("UT")) {
                boolean znaleziony = false;
                System.out.println("Usuwasz trenera.");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.print("Podaj imie Trenera: ");
                        String imie = sc.nextLine();
                        System.out.print("Podaj nazwisko Trenera: ");
                        String nazwisko = sc.nextLine();
                        for (Trener i: kurs.listaTrenerow) {
                            if (i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)) {
                                System.out.print("Trener ");
                                i.getTrener();
                                System.out.println(" został poprawnie usunięty z kursu "+nazwaKursu+" "+termin+".");
                                kurs.listaTrenerow.remove(i);
                                znaleziony = true;
                                break;
                            }
                        }
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("UU")) {
                boolean znaleziony = false;
                System.out.println("Usuwasz uczestnika.");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.print("Podaj imie Uczestnika: ");
                        String imie= sc.nextLine();
                        System.out.print("Podaj nazwisko Uczestnika: ");
                        String nazwisko= sc.nextLine();

                        for (Uczestnik i: kurs.listaUczestnikow) {
                            if (i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)) {
                                System.out.print("Uczestnik ");
                                i.getUczestnik();
                                System.out.println(" został poprawnie usunięty z kursu "+nazwaKursu+" "+termin+".");
                                kurs.listaUczestnikow.remove(i);
                                znaleziony = true;
                                break;
                            }
                        }
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("UK")) {
                boolean znaleziony = false;
                System.out.println("Usuwasz kurs!");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        if (kurs.listaUczestnikow.size()==0){
                            System.out.println("Kurs "+nazwaKursu+" "+termin+" został usunięty pomyślnie!");
                            listaKursow.remove(kurs);
                        }
                        else {
                            System.out.println("Kurs "+nazwaKursu+" "+termin+" nie może zostać usunięty - Posiada nadal uczestników!");
                        }
                        znaleziony = true;
                        break;
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("ZU")) {
                boolean znaleziony = false;
                System.out.println("Modyfikujesz uczestnika kursu.");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.print("Podaj imie Uczestnika: ");
                        String imie = sc.nextLine();
                        System.out.print("Podaj nazwisko Uczestnika: ");
                        String nazwisko = sc.nextLine();
                        for (Uczestnik i: kurs.listaUczestnikow) {
                            if (i.getImie().equals(imie)&&i.getNazwisko().equals(nazwisko)) {
                                System.out.println("Co chcesz zmienić w danych "+imie+" "+nazwisko+"? imie,nazwisko,telefon, czy email?");
                                String decyzjaZmiany=sc.nextLine();
                                if (decyzja.equals("imie")) {
                                    System.out.print("Podaj nowe imie: ");
                                    String noweimie = sc.nextLine();
                                    i.setImie(noweimie);
                                }if (decyzja.equals("nazwisko")) {
                                    System.out.print("Podaj nowe nazwisko: ");
                                    String noweNazwisko = sc.nextLine();
                                    i.setNazwisko(noweNazwisko);
                                }if (decyzja.equals("telefon")) {
                                    System.out.print("Podaj nowy telefon: ");
                                    String nowyTelefon = sc.nextLine();
                                    i.setTelefon(nowyTelefon);
                                }if (decyzja.equals("email")) {
                                    System.out.print("Podaj nowy email: ");
                                    String nowyEmail = sc.nextLine();
                                    i.setImie(nowyEmail);
                                }
                                else {
                                    System.out.println("Błąd - spróbuj z małych liter");
                                }
                                System.out.println("Uczestnik " + i.getImie() +" "+i.getNazwisko() + " został poprawnie zmodyfikowany w kursie "+nazwaKursu+" "+termin+".");
                                znaleziony = true;
                                break;
                            }
                        }
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("ZK")) {
                boolean znaleziony = false;
                System.out.println("Modyfikujesz kurs!");
                System.out.print("Podaj nazwę kursu: ");
                String nazwaKursu = sc.nextLine();
                System.out.println("Podaj termin kursu:");
                String termin = sc.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.getNazwaKursu().equals(nazwaKursu) && kurs.getTermin().equals(termin)) {
                        System.out.println("Aby pominąć wciśnij ENTER");
                        System.out.print("Podaj nową nazwę kursu: ");
                        String nowaNazwaKursu = sc.nextLine();
                        if (nowaNazwaKursu.equals("")) {
                            System.out.println("Opcja pominięta.");
                        } else {
                            kurs.setNazwaKursu(nowaNazwaKursu);
                        }
                        System.out.print("Podaj nowy termin kursu: ");
                        String nowyTermin = sc.nextLine();
                        if (nowyTermin.equals("")) {
                            System.out.println("Opcja pominięta.");
                        } else {
                            kurs.setTermin(nowyTermin);
                        }
                        System.out.print("Podaj nowe miejsce kursu: ");
                        String noweMiejsce=sc.nextLine();
                        if (noweMiejsce.equals("")){
                            System.out.println("Opcja pominięta.");
                        }
                        else {kurs.setMiejsce(noweMiejsce);}
                        System.out.println("Kurs "+nazwaKursu+" "+termin+" został zmieniony na: "+kurs.getNazwaKursu()+" "+kurs.getTermin()+" "+kurs.getMiejsce()+".");
                        znaleziony = true;
                        break;
                    }
                }
                if (znaleziony == false) {
                    System.out.println("Nie znaleziono.");
                }
            }
            else if (decyzja.equals("W")) {
                System.out.println("Aktualne kursy: ");
                for (Kurs kurs : listaKursow) {
                    System.out.print(kurs.getNazwaKursu()+" "+kurs.getTermin()+" "+kurs.getMiejsce()+": ");
                    System.out.print("trenerzy: ");
                    for (Trener i:kurs.listaTrenerow){
                        System.out.print(i.getImie()+" "+i.getNazwisko()+", ");
                    }
                    System.out.print("uczestnicy: ");
                    for (Uczestnik i:kurs.listaUczestnikow){
                        System.out.print(i.getImie()+" "+i.getNazwisko()+", ");
                    }
                    System.out.println(".");
                }

            }
            else if (decyzja.equals("WK")){
                boolean znaleziono =false;
                System.out.println("Podaj kurs aby wymienić szczegóły:");
                System.out.print("Podaj nazwę kursu:");
                String nazwaKursu=sc.nextLine();
                System.out.print("Podaj termin kursu:");
                String termin=sc.nextLine();

                for (Kurs j:listaKursow){
                    if (j.getNazwaKursu().equals(nazwaKursu)&&j.getTermin().equals(termin)){
                        znaleziono=true;
                        System.out.print(j.getNazwaKursu()+" "+j.getTermin()+" "+j.getMiejsce()+": ");
                        System.out.print("lista trenerów: ");
                        for (Trener i:j.listaTrenerow){
                            i.getTrener();
                        }
                        System.out.print("lista uczestników: ");
                        for (Uczestnik i:j.listaUczestnikow){
                            i.getUczestnik();
                        }
                        System.out.println(".");
                    }
                }
                if (znaleziono==false){
                    System.out.println("Nie znaleziono");
                }

            }
            else if (decyzja.equals("OFF")) {
                System.out.println("Koniec pracy programu.");
                sc.close();
                break;
            }
            else {
                System.out.println("Błędna komenda");
            }
        }

    }
}
